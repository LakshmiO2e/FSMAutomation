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

Mobile.comment('##### - Create Service Report')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnGetSignature'), 30)

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnGetSignatureDefault'), 30)

Mobile.comment('##### - Step 1')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnSignAndConfirm'), 30)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnGetSignature3Dots'), 
    10)

Mobile.comment('##### - Step 2')

Mobile.setText(findTestObject('04.Mobile/01.IOS/01.FSL/03.Generate Service Report - View/00.SignAndConfirm - View/inptNameSignature'), 
    inptSignatureName, 0)

CustomKeywords.'IOS.DrawSignature'(findTestObject('04.Mobile/01.IOS/01.FSL/03.Generate Service Report - View/00.SignAndConfirm - View/inptSingnature'))

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnSave'), 30)

Mobile.comment('##### - Generate Report')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnGenerateServiceReport'), 30)

