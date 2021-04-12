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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import Common as Common
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.comment('Wait for the page to Load')

WebUI.waitForElementPresent(findTestObject('01.GJOBE/00.CommonObjects/imgUser'), 20)

WebUI.comment('Verify Service Appointment Information')

WebUI.comment('Verify Status')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Status', 'Dispatched')) {
    WebUI.comment('Status OK')
} else {
    WebUI.comment('Status Not OK')
}

WebUI.comment('Arrival Window Start')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Arrival Windows Start', '13/11/2020 12:30 PM')) {
    WebUI.comment('Arrival Window Start OK')
} else {
    WebUI.comment('Arrival Window Start NOTOK')
}

