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
import Common as Common

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Related')

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Quotes (1)')

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), '00001023')

CustomKeywords.'IOS.WaitFor'('Generate Docs', 0)

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Generate Docs')

Mobile.comment('Step 1 - Select Docs')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/00.Step1 - Choose Document/inptDocToSearch'), 
    docNameCopy, 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/00.Step1 - Choose Document/slctDoc'), 
    10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNextStep'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 'The following S-Docs have been created')) {
    Mobile.comment('The following S-Docs have been created - OK')

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnBack'), 10)

    CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Related')

    CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Notes & Attachments (3+)')

    if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), verifyDocNameCopy)) {
        Mobile.comment('Document Copy exist inside Notes & Attachments')

        Mobile.comment('Need to return to Quote Page')

        Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnBack'), 10)

        Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnBack'), 10)
    } else {
        Mobile.comment('Enable to find Document Copy version')
    }
} else {
    Mobile.comment('Doc were not generate')
}

Mobile.delay(90, FailureHandling.STOP_ON_FAILURE)

