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
import IOS as IOS

Mobile.comment('##### - Call Ahead - Menu')

CustomKeywords.'IOS.SelectRadioButton'(slctCallOutcome)

Mobile.tapAndHold(findTestObject('04.Mobile/01.IOS/01.FSL/02.Call Ahead - View/inptCallAheadComments'), 1, 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/01.FSL/02.Call Ahead - View/inptCallAheadComments'), inptComments, 0)

CustomKeywords.'IOS.Scroll'('up')

Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnNext'), 0)

Mobile.comment('##### - Step 2 ')

if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 'Success!')) {
    Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnNext'), 0)

    Mobile.comment('##### - Verify if Call Ahead is Completed')

    if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 'Call Ahead Completed!')) {
        Mobile.tap(findTestObject('04.Mobile/01.IOS/01.FSL/00.Common Objects/00.Button Objects/btnFinish'), 0)
    } else {
        Mobile.comment('Error validate Call Ahead')
    }
} else {
    Mobile.comment('Error validate Call Ahead')
}

