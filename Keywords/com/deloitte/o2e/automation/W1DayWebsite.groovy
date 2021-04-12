package com.deloitte.o2e.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By

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

import com.deloitte.core.BasePage
import com.deloitte.utils.ConstantsShackShine
import com.deloitte.utils.DateTimeUtils
import com.deloitte.utils.StringUtils
import com.deloitte.utils.ConstantsW1Day

import internal.GlobalVariable

public class W1DayWebsite extends BasePage {


	//Choose a first available time slot in Calendar
	def selectDayAndTime() {

		waitElementInvisible(30,ConstantsW1Day.XPATH_CALENDAR_SPINNER)

		TestObject object = findTestObject("Object Repository/05.W1Day/00.Calendar Objects/lbl_AvailableDay")
		String xpath = object.getProperties().get(0).getValue()
		WebDriver driver = DriverFactory.getWebDriver()

		int actualDay = Integer.parseInt(DateTimeUtils.getCurrentDateDay())
		boolean hourSelected = false

		while(hourSelected != true){
			List<WebElement> elements = driver.findElements(By.xpath(xpath))

			//lets see the availabillity for Morning|Afternoon|Evening
			for(WebElement element : elements){

				String text = element.getText()
				if(!text.isEmpty() && Integer.parseInt(text.split(" ")[0]) > 0){
					javaExecutorClickElement(element)

					WebElement elementSelectHour = findWebElement(ConstantsW1Day.XPATH_SELECT_HOUR)

					if(elementSelectHour != null){
						javaExecutorClickElement(elementSelectHour)
						hourSelected = true
					}
				}

			}

			//if no hour exist for actual day we may jump to next day
			if(!hourSelected){
				actualDay+=1
				jumpToNextDay(actualDay)
			}
		}

	}

	def jumpToNextDay(int nextDay){

		TestObject object = findTestObjectByLabel("Object Repository/05.W1Day/00.Calendar Objects/lblCalendarSelectDay", String.valueOf(nextDay))

		javaExecutorClick(object.getProperties().get(0).getValue())

		waitElementInvisible(30,ConstantsW1Day.XPATH_CALENDAR_SPINNER)
	}


}
