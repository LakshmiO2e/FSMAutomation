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

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/LoginFSL'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('##### - Select Appointment')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'IOS.Scroll'('down')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/slctScheduledAppointment'), 
    '18:30')

Mobile.comment('###################################')

CustomKeywords.'IOS.WaitFor'('OVERVIEW', 10)

Mobile.comment('##### - Action Menu')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/btnActions'), 0)

Mobile.comment('##### - Upload Frist Photo')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'Upload File')

CustomKeywords.'IOS.UploadPhoto'(1)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnDone'), 0)

Mobile.comment('##### - Step 1')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnNext'), 10)

Mobile.comment('##### - Step 2')

CustomKeywords.'IOS.SelectRadioButton'('Yes  ')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnNext'), 0)

Mobile.comment('##### - Upload Frist Photo')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'Upload File')

CustomKeywords.'IOS.UploadPhoto'(1)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnDone'), 0)

Mobile.comment('##### - Step 1')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnNext'), 10)

Mobile.comment('##### - Step 2')

CustomKeywords.'IOS.SelectRadioButton'('No  ')

Mobile.comment('##### - Verify - If we get Success message for upload photos')

if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'Upload File Completed!')) {
    Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnFinish'), 0)

    Mobile.comment('Upload File Copleted!')
} else {
    Mobile.comment('Error: Can\'t upload photos.')
}

Mobile.delay(100, FailureHandling.STOP_ON_FAILURE)

