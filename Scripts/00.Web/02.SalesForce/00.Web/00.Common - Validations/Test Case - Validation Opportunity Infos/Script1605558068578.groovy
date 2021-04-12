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

WebUI.comment('Verify Opportunity Detail')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Opportunity Name', '1-800-GOT-JUNK? - Seb Seb - 11/13/2020 - 0967')) {
    WebUI.comment('Opportunity Name OK')
} else {
    WebUI.comment('Opportunity Name not OK')
}

WebUI.comment('Verify Opportunity Record Type')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Opportunity Record Type', '1-800-GOT-JUNK?')) {
    WebUI.comment('Opportunity Record Type OK')
} else {
    WebUI.comment('Opportunity Record Type  NOTOK')
}

WebUI.comment('Verify Opportunity ID')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Opportunity ID', '0967')) {
    WebUI.comment('Opportunity ID OK')
} else {
    WebUI.comment('Opportunity ID NOTOK')
}

WebUI.comment('Status')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Status', 'New')) {
    WebUI.comment('Opportunity Status OK')
} else {
    WebUI.comment('Opportunity Status NOTOK')
}

WebUI.comment('Type')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Type', 'Residential')) {
    WebUI.comment('Opportunity Type OK')
} else {
    WebUI.comment('Opportunity Type NOTOK')
}

