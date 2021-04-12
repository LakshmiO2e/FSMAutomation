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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/LoginFSL'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('##### - Select Appointment')

CustomKeywords.'IOS.Scroll'('down')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/slctScheduledAppointment'), 
    '18:30')

Mobile.comment('##### - Action Call Ahead')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/btnActions'), 0)

Mobile.scrollToText('Open Quote')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 
    'Open Quote')

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Add Products'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(100, FailureHandling.STOP_ON_FAILURE)

