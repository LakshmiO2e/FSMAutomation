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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.deloitte.o2e.automation as o2eAutomation



Mobile.startApplication('/Users/temp/Desktop/Apps/Field Service 228.0.1.ipa', false)

Mobile.comment('##### - Verify if we need to input PassCode or Login info')

//Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/01.Gear Menu/btnGear'), 30)
//Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/01.Gear Menu/lblSelectEnvironment'), 10)
// Verifiy if passcode is being asked
//log.loginfo(GlobalVariable.iOS_PassCode.substring(0,1))
com.deloitte.o2e.automation.EmailKeys.fetchEmailAndValidate()

if (Mobile.verifyElementExist(findTestObject('04.Mobile/01.IOS/01.FSL/01.Login/VerifyPasscodeIOS'), 10, FailureHandling.OPTIONAL)) {
    CustomKeywords.'IOS.EnterPasscode'('4;2;4;2')
} else {
    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/inptUsername'), 10)

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Login/inptUsername'), 'w1dusa.fp@wow1day.delqaapoc', 30)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/inptPassword'), 10)

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Login/inptPassword'), 'fsmQAfun1', 30)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/btnLogIn'), 10, FailureHandling.STOP_ON_FAILURE)
}

