import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementPresent(findTestObject('01.GJOBE/00.CommonObjects/imgUser'), 20)

//WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/ActionsDropDown'))
WebUI.waitForElementPresent(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/btnBookAppointment'), 
    5)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/btnBookAppointment'))

Mobile.comment('##### - Step 1')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/00.Step - Verify Info/slctWorkType'), 
    slctWorkType, false)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/00.Step - Verify Info/btnGetAppointments'))

Mobile.comment('##### - Step 2')

WebUI.delay(10)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/lblTitle'))

WebUI.waitForElementPresent(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/btnIdealTime'), 
    10)

WebUI.delay(30)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/btnTomorrowSlots'))

WebUI.delay(10)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/slctTimeFirstSpot'))

//CustomKeywords.'Common.SelectValue'(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/slctTime'), 
//  '9:30PM')
WebUI.waitForElementPresent(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/txtAppointmentBooked'), 
    20)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/02.Step - View Service Appointment/btnCloseBookAppointmentWindow'))

WebUI.delay(3)

