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
import IOS as IOS

not_run: Mobile.startApplication('/Users/Sebass/Desktop/Apps/Chatter.app', false)

not_run: Mobile.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'IOS.WaitFor'('Candidates', 0)

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Candidates')

Mobile.comment('Step 1 - Candidates')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/03.Menu - Work Orders/00.Candidate - View/00.Step 1/slctServiceAppointment'), 
    'Create a new Service Appointment')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/03.Menu - Work Orders/00.Candidate - View/00.Step 1/btnGetCandidates'), 
    0)

Mobile.comment('Step 2 - Candidates')

Mobile.comment('Step 2 - Verify date for Crew')

if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'Starting')) {
    CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'ROMI\'S CREW')

    CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), '100/100')

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnCancel'), 5)
}

