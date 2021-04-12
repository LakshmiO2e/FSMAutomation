package com.deloitte.o2e.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.logging.Logger

import com.deloitte.core.BasePage
import com.deloitte.utils.ConstantsShackShine
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ShackShineWebsite extends BasePage {


	private static final Logger log = Logger.getLogger(ShackShineWebsite.class.getName())

	//TODO: Note only selectService is working the others are still in progress


	/**
	 * This method will click on Service Category and then select an sub category
	 * 
	 * @param serviceCategory
	 * @param serviceName
	 * @param optionalNumber
	 */
	public void selectService(String serviceCategory, String serviceName, String optionalNumber){
		String servCategory = serviceCategory.toLowerCase()

		WebUI.comment(servCategory)
		def selectCategory = findTestObjectByLabel('Object Repository/02.ShackShine/01.Estimate Details/02.Step 2 Page - Choose Your Service/slctService', "${servCategory}")

		WebUI.click(selectCategory)

		def selectSubCategory = findTestObjectByLabelAndValue("Object Repository/02.ShackShine/01.Estimate Details/02.Step 2 Page - Choose Your Service/chkService","${servCategory}","${serviceName}")

		WebUI.click(selectSubCategory)

		if(Integer.parseInt(optionalNumber) > 1 ){
			def selectNuber = findTestObjectByLabel("Object Repository/02.ShackShine/01.Estimate Details/02.Step 2 Page - Choose Your Service/inptNumber","${servCategory}")
			WebUI.setText(selectNuber, optionalNumber)
		}
	}


	//Choose a first available time slot in Calendar
	def selectDayAndTime() {

		StringUtils.logger("Select available morning/afternoon", "")
		waitSectionDisplay(10)
		StringUtils.logger("Day - ", DateTimeUtils.getCurrentDateDay())
		def btnAvailSlot = findAvaiDayTestObject(Integer.parseInt(DateTimeUtils.getCurrentDateDay()))
		int currentDay = Integer.parseInt(DateTimeUtils.getCurrentDateDay()) + 1
		while(btnAvailSlot == null){
			StringUtils.logger("Search for next day","")
			StringUtils.logger("Day - " , currentDay.toString())
			currentDay = selectAvailDay(currentDay)
			btnAvailSlot = findAvaiDayTestObject(currentDay)
			currentDay++
		}
		click(btnAvailSlot)

		WebUI.comment('Select the first available time')
		TestObject btnAvailTime = findAvaiTimeTestObject()
		superWait(btnAvailTime)
		String xpath = btnAvailTime.getProperties().get(0).getValue()
		javaExecutorClick(xpath)
		WebUI.waitForPageLoad(GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
	}

	private static TestObject findAvaiDayTestObject(int possitionStart = 1,int currentDay) {
		int DYSPLAYED_AVAILABLE_PER_DAY = 2
		int DISPLAYED_AVAILABLE_DAYS = 1

		//click next date Calendar
		if(Integer.parseInt(DateTimeUtils.getCurrentDateDay()) != currentDay){
			TestObject object = findTestObjectByLabel("Object Repository/02.ShackShine/01.Estimate Details/00.Calendar Objects/lblCalendarDay",String.valueOf(currentDay) )

			javaExecutorClick(object.getProperties().get(0).value)

			//delay for some seconds
			WebUI.delay(5)
		}

		for(int i = possitionStart; i <= DYSPLAYED_AVAILABLE_PER_DAY; i++) {

			TestObject lblAvaiDay = findTestObject('Object Repository/02.ShackShine/01.Estimate Details/00.Calendar Objects/lbl_AvailableDay',
					[('value'):DISPLAYED_AVAILABLE_DAYS,
						('value'):DISPLAYED_AVAILABLE_DAYS,
						('label'):ConstantsShackShine.getAvailableLabels()[i-1]])

			String avaiText = WebUI.getText(lblAvaiDay)
			int totalAvaiTime = StringUtils.extractNumberFromString(avaiText)
			StringUtils.logger("Value for " + ConstantsShackShine.getAvailableLabels()[i-1] + " - "+ avaiText)
			if (totalAvaiTime > 0) {
				return lblAvaiDay
			}

		}
	}

	//Select a day in calendar
	def selectAvailDay(int currentDate) {
		def lblDay = findTestObjectByLabel('Object Repository/02.ShackShine/01.Estimate Details/00.Calendar Objects/lbl_AvailableDay', '')
		def lblDayElement =  WebUI.findWebElements(lblDay, GlobalVariable.G_max_timeout).size()
		int today = Integer.parseInt(DateTimeUtils.getCurrentDateDay())

		if (currentDate <= lblDayElement+1){
			def lblDayClass = ''

			if(!lblDayClass.contains('disabled') && currentDate != lblDayElement+1 && (currentDate != today || currentDate == 1)){
				def lnkSelectDay = findTestObjectByLabel('Object Repository/02.ShackShine/01.Estimate Details/00.Calendar Objects/lbl_AvailableDay', "${currentDate}")
				superWait(lnkSelectDay)
				click(lnkSelectDay)
				waitForIconCalendarLoading()
			}
		}
		return currentDate
	}

	//find object hour to then click
	private TestObject findAvaiTimeTestObject() {

		for(int i = 1; i < 3; i++){

			if(findTestObjectByLabel('Object Repository/02.ShackShine/01.Estimate Details/01. Pick Day Objects/slctAvailableHour',"${i}") != null){

				return findTestObjectByLabel('Object Repository/02.ShackShine/01.Estimate Details/01. Pick Day Objects/slctAvailableHour', "${i}")
			}
		}
	}
}