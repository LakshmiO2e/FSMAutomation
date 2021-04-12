package com.deloitte.o2e.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.event.KeyEvent

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By;

import com.deloitte.core.BasePage
import com.deloitte.utils.ConstantsGJOBE
import com.deloitte.utils.DatePickerUtils
import com.deloitte.utils.DateTimeUtils
import com.deloitte.utils.StringUtils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.exception.StepFailedException

import internal.GlobalVariable

public class GjobeWebsite extends BasePage {


	/**
	 * Main method for selecting day and time - Keyword
	 */
	//Choose a first available time slot in Calendar
	public void selectDayAndTime() {
		WebUI.comment('Select available morning/afternoon/evening')
		def btnAvailSlot = findAvaiDayTestObject()
		int currentDate = Integer.parseInt(DateTimeUtils.getCurrentDateDay())
		while(btnAvailSlot == null){
			currentDate = selectAvailDay(currentDate)
			btnAvailSlot = findAvaiDayTestObject()
			currentDate++
		}
		click(btnAvailSlot)

		WebUI.comment('Select the first available time')
		click(findTestObject("01.GJOBE/02.Create new Appointment/Step 2 - Screen/01.PickTimeObjects/rbtnSelectTime"))

	}

	private static TestObject findAvaiDayTestObject(int session = 1) {
		int day = 1
		int DISPLAYED_DAY = 3
		int DISPLAYED_SESSION = 3

		for(day; day <= DISPLAYED_DAY; day++) {
			for(session; session <= DISPLAYED_SESSION; session++) {
				TestObject lblAvaiDay = findTestObject('01.GJOBE/02.Create new Appointment/Step 2 - Screen/00.CalendarObjects/lblAvailableDay', [('day'):day, ('session'):session])

				WebUI.scrollToElement(lblAvaiDay, GlobalVariable.G_max_timeout, FailureHandling.STOP_ON_FAILURE)

				String avaiText = WebUI.getText(lblAvaiDay)
				int totalAvaiTime = StringUtils.extractNumberFromString(avaiText)

				if (totalAvaiTime>0) return lblAvaiDay
			}
		}
	}

	//Select Day in Calendar
	private def selectAvailDay(int currentDate) {

		def lblDay = findTestObjectByLabel('Object Repository/GJOBE_AU/Step 2/00.CalendarObjects/lblCalendarDay', '')

		WebDriver driver = DriverFactory.getWebDriver()
		def lblDayElement =  driver.findElements(By.xpath(lblDay.getProperties()[0].getValue())).size()

		int today = Integer.parseInt(DateTimeUtils.getCurrentDateDay())
		WebUI.comment("selectAvailDay ${currentDate.toString()}")
		if (currentDate <= lblDayElement+1) {
			def lblDaySlot = findTestObjectByLabel('Object Repository/GJOBE_AU/Step 2/00.CalendarObjects/lblCalendarDay', "${currentDate}")
			WebUI.scrollToElement(lblDaySlot, GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
			def lnkSelectDay = findTestObjectByLabel('Object Repository/00.Common Objects - SSH and WOW1D/00.Calendar Objects/lblCalendarSelectDay', "${currentDate}")
			if (currentDate != lblDayElement + 1 && (currentDate != today || currentDate == 1)) {
				superWait(lnkSelectDay)
				click(lnkSelectDay)
				waitForIconCalendarLoading()
			}
			else {
				if(currentDate == lblDayElement + 1) {
					selectAvailDayNextMonth()
					currentDate = 0
					lblDayElement =  driver.findElements(By.xpath(lblDay.getProperties()[0].getValue())).size()
				}
			}
		}
		return currentDate
	}



	public void selectGantTimeLine(String value){

		WebUI.click(findTestObject("Object Repository/01.GJOBE/01.Flows/02.Reschedule Service Gant/scltTimeLine"))

		TestObject object = findTestObjectByLabel("Object Repository/01.GJOBE/01.Flows/02.Reschedule Service Gant/slctTimeLineValue", "${value}")

		WebUI.click(object)
	}

	/**
	 * 
	 * @param object
	 * @param teamName
	 * @param serviceNumber
	 * @param statusValue
	 */
	public void dragGanttAppointmentToToday(TestObject object, String teamName, String serviceNumber,String statusValue){

		String xpathIFrame = findTestObject("Object Repository/01.GJOBE/00.CommonObjects/iFrameFieldService").getProperties().get(0).getValue()

		getActualDriver().switchTo().frame(findWebElement(xpathIFrame))
		WebUI.delay(10)

		javaExecutorClick(ConstantsGJOBE.XPATH_GANTT_MAIN)

		List<WebElement> elementsToSearch = findWebElements(ConstantsGJOBE.XPATH_GANTT_USER_TO_SEARCH)

		Map<Integer,List<WebElement>> mapElements = getAllTeamsGanttLine(object,  teamName)

		Map.Entry<String,String> entryKey = mapElements.entrySet().iterator().next()
		int position = entryKey.getKey()
		List<WebElement> elementsToDrag = entryKey.getValue()

		if (!mapElements.isEmpty()){
			for(WebElement elementToDrag: elementsToDrag){

				mouseHouver(elementToDrag)

				//get the value from tooltip
				if( getValueFromToolTip().equals(serviceNumber)){

					rightClick(elementToDrag)
					//now we change the status
					WebElement elementChangeStatus = findWebElement(ConstantsGJOBE.XPATH_CHANGE_STATUS_MENU)
					mouseHouver(elementChangeStatus)
					WebElement elelemtStatusDispathed = findWebElement(ConstantsGJOBE.XPATH_CHANGE_STATUS_VALUE.replace("value", statusValue))
					mouseHouver(elelemtStatusDispathed)

					//now we drag and drop to a position
					String xpathToDrag = findTestObjectByLabelValueandPosition("Object Repository/01.GJOBE/01.Flows/02.Reschedule Service Gant/ganttAppointmentToDrag", "JERO",String.valueOf(position) , "10").getProperties().get(0).getValue()
					dragAndDrop(elementToDrag,findWebElement(xpathToDrag))

					//verify if send email is marked as CHECKED
					verifyGanttTodayEmailCHECK(elementToDrag)

					break

				}
			}
		}
	}

	/**
	 * This will double click the today moved service and verify if email is marked as 
	 * CHECK
	 * @param elementToDrag
	 */
	private static void verifyGanttTodayEmailCHECK(WebElement elementToDrag){

		try{
			doubleClick(elementToDrag)
			// click tab feed
			javaExecutorClick(ConstantsGJOBE.XPATH_GANTT_BTN_FEED)

			WebUI.delay(5)
			getActualDriver().switchTo().frame(findWebElement(ConstantsGJOBE.XPATH_GANTT_IFRAME_POPUP_WINDOW))

			// if not null then the input is mark as checked
			if(findWebElement(ConstantsGJOBE.XPATH_GANTT_RDBTN_SENDEMAIL_CHECK) != null){
				javaExecutorClick(ConstantsGJOBE.XPATH_GANTT_BTN_UPDATE)
			}
		}catch(Exception e){
			throw new StepFailedException("Error when trying to verify Send Reschedule Email")
		}


	}

	/**
	 * 
	 * @return
	 */
	private String getValueFromToolTip(){

		WebElement elementToolTip = findWebElement(ConstantsGJOBE.XPATH_GANTT_TOOLTIP_INFO)

		StringUtils.logger("Tooltip with id: ", elementToolTip.getText())

		return  elementToolTip.getText().split(" ")[0]
	}

	/**
	 * 
	 * @return
	 */
	private Map<Integer,List<WebElement>> getAllTeamsGanttLine(TestObject object, String teamName){

		int countFails = 0
		int countLine = 3

		while(countFails <= 5){
			try{
				List<WebElement> elementsToSearch = findWebElements(ConstantsGJOBE.XPATH_GANTT_USER_TO_SEARCH)
				Map<Integer,List<WebElement>> map  = new HashMap<Integer,List<WebElement>>()
				List<WebElement> elements  = new ArrayList<>()


				for(WebElement elementToSearch: elementsToSearch){
					countLine++
					waitElementVisible(10, elementToSearch)
					mouseHouver(elementToSearch)
					scrollToElement(elementToSearch)
					String xpath = findTestObjectByLabelAndValue(object.getObjectId(),teamName, String.valueOf(countLine)).getProperties().get(0).getValue()

					elements = findWebElements(xpath)

					if(!elements.isEmpty()){
						map.put(countLine, elements)

						return map
					}
				}

			}catch(Exception e){
				countFails++
				StringUtils.logger("Gantt refreshed the panel... We will try again with attempt number - ", String.valueOf(countFails))
				javaExecutorClick(ConstantsGJOBE.XPATH_GANTT_MAIN)

			}

		}

		if(countFails >5){
			throw new StepFailedException("Error: When trying to search for specific team in GANTT")
		}
		return null
	}
}
