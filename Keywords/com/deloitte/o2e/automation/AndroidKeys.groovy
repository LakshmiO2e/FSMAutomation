package com.deloitte.o2e.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

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
import internal.GlobalVariable as GlobalVariable


public class AndroidKeys {



	public static void loginFSL(String username, String password){
		if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/00.Login/android.view.View - Username xpath'), 10)) {
			Mobile.setText(findTestObject('04.Mobile/02.Android/00.Login/FSL/android.widget.EditText-Username Xpath'), username,
					5)

			Mobile.delay(5)

			Mobile.setText(findTestObject('04.Mobile/02.Android/00.Login/FSL/android.widget.EditText - Password Xpath'), password,
					5)

			Mobile.delay(5)

			Mobile.tap(findTestObject('04.Mobile/02.Android/00.Login/FSL/android.widget.Button - Log In to Sandbox'), 5)
		}
	}

	public static void tapAllow(){
		if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/00.Login/android.view.View - Username xpath'), 10)) {

			Mobile.delay(5)

			Mobile.tap(findTestObject('04.Mobile/02.Android/00.Login/android.widget.Button - Log In to Sandbox (1)'), 5)

			Mobile.delay(5)
		}
	}

	public static void tapWait(){
		if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/00.Login/FSL/android.widget.Button - Wait ID'), 10)) {
			Mobile.delay(5)

			Mobile.tap(findTestObject('04.Mobile/02.Android/00.Login/FSL/android.widget.Button - Wait ID'), 5)

			Mobile.delay(5)
		}
	}


	public static void enterPasscodeForFSLApp(String passcode){

		def isEnterPasscodeShown = Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/login/inptPasscode'),
				3)

		if (isEnterPasscodeShown == true) {
			Mobile.setText(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/login/radioInpt'),
					passcode, 5) //click I Agree and Enter URL to login page
		} else {
			Mobile.setText(findTestObject('Object Repository/04.Mobile/02.Android/android.view.View - Username'), GlobalVariable.variableUsername)

			Mobile.delay(3)

			WebUI.setText(findTestObject('04.Mobile/02.Android/00.Login/android.view.View - Password'), GlobalVariable.variablePassword)
		}

		Mobile.delay(10)
	}

	public static void tapCalendarIcon(){

		Mobile.delay(10)
		//Tap Calendar picker and Select Target date
		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		//Tap calendar picker
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'),
				10)

		//Mobile.tap(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'),10)

		//choose 1 TODO need to fix sync issue then made this part keywords work as parameters
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.TextView - 1 Image Btn'),
				10)

		Mobile.delay(3)

	}

	public static void tapCalendarIconAndTap1Date(TestObject testObject){

		Mobile.delay(10)
		//Tap Calendar picker and Select Target date
		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		//Tap calendar picker
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'),
				10)

		//Mobile.tap(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'),10)

		//choose 1 TODO need to fix sync issue then made this part keywords work as parameters
		Mobile.tap(testObject)

		Mobile.delay(5)

	}

	public static void tapCalendarIconAndTapDate(TestObject testObject){

		Mobile.delay(10)
		//Tap Calendar picker and Select Target date
		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		//Tap calendar picker
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'),
				10)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Calendar/android.widget.TextView - 1'), 10)

		Mobile.delay(5)

	}

	public static void tapCalendarIconAndTap1Date(){

		Mobile.delay(10)
		//Tap Calendar picker and Select Target date
		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		//Tap calendar picker
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'),
				10)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Calendar/android.widget.TextView - 1'), 10)

		Mobile.delay(5)

	}

	public static void tapCalendarIconAndTap3Date(){

		//Tap Calendar picker and Select Target date
		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'), 10)

		//Tap calendar picker
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'), 10)

		Mobile.waitForElementPresent(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'), 10)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Calendar/android.widget.TextView - 3'), 10)

		Mobile.delay(5)

	}


	public static void clickClockIconGotoWorkOrderPage(){
		Mobile.comment('Click Clock icon go to work order page')

		//Click Clock icon go to work order page
		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView-Clock Image Icon'),
				10)

		Mobile.delay(5)
	}

	public static void tapIAgree(){
		//If I agree showup, then click I agree
		if (Mobile.verifyElementVisible('04.Mobile/02.Android/00.Connection/android.widget.TextView - I AGREE', 10)) {
			//click I Agree and Enter URL to login page
			Mobile.tap(findTestObject('04.Mobile/02.Android/00.Connection/android.widget.TextView - I AGREE'), 10)
			Mobile.delay(5)
		}else{
			Mobile.comment("I Agree not show up ")

		}
	}

	public static AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	public static void refreshPage(){
		driver.getPageSource()
	}

	public static void takeAPicAndUpload(){
		Mobile.delay(5)

		'Tap on Camera icon'

		'Wait for Element Present take Photo'
		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.ImageView - Camera Icon Xpath'),
				60)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.ImageView - Camera Icon Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.ImageButton-Correct Btn Xpath'),
				60)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.ImageButton-Correct Btn Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Next Btn Step2-Xpath'),
				60)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Next Btn Step2-Xpath'),
				10)

		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.view.ViewGroup- No Radio Option Btn'),
				60)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.view.ViewGroup- No Radio Option Btn'),
				9)

		Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Next Btn Step2-Xpath'),
				60)

		Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Next Btn Step2-Xpath'),
				10)

		Mobile.delay(10)
	}


}
