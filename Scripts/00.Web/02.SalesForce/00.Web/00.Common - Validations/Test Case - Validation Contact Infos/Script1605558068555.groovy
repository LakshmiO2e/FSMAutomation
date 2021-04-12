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

WebUI.comment('Verify Contact Information')

WebUI.comment('Verify Name')

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Name', validationFullName)) {
    WebUI.comment('Name OK')
} else {
    WebUI.comment('Name not OK')
}

WebUI.comment('Verify Phone')

not_run: if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Phone', '1234123123213')) {
    WebUI.comment('Phone OK')
} else {
    WebUI.comment('Phone NOTOK')
}

not_run: WebUI.comment('Verify Service Address')

not_run: if (Common.VerifyElementLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/00.Oppotunity Page objects/00.Opportunity Detail - Objects/lblInfoPanel'), 
    'Service Address', '145 Lawton Boulevard')) {
    WebUI.comment('Service Address OK')
} else {
    WebUI.comment('Service Address NOTOK')
}

