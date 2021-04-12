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

Mobile.comment('##### - Verify if we need to input PassCode or Login info')

if (passCode != '') {
    CustomKeywords.'IOS.EnterPasscode'('4242' //Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnDone'), 10)
        //Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnDone'), 10)
        //Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Login/inptUsername'), inptUser, 30)
        //Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Login/inptPassword'), inptPassword, 30)
        )
} else {
    CustomKeywords.'IOS.WaitFor'('choose connection button', 10)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/01.Gear Menu/btnGear'), 10, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), slctEnvironment)

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Login/inptUsername'), inptUser, 30)

    Mobile.waitForElementPresent(findTestObject('04.Mobile/01.IOS/00.Login/inptPassword'), 10)

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Login/inptPassword'), inptPassword, 10)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/btnLogIn'), 10, FailureHandling.STOP_ON_FAILURE)

    Mobile.comment('##### - Verify if we need click Allow')

    if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 'Allow Access?')) {
        Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/00.Allow Access View/btnAllow'), 20, FailureHandling.STOP_ON_FAILURE)
    }
}

