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

Mobile.comment('Verify - If Service Appointments Info are Ok')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Details')

Mobile.comment('Verify - Appointment Status')

if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 'Please indicate Interior and/or Exterior for Commercial Jobs')) {
    CustomKeywords.'IOS.SelectRadioButton'('Interior')

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)
}

