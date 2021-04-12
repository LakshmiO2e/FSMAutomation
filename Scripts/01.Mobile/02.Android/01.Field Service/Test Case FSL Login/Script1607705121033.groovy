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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

Mobile.delay(1)

if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/login/inptPasscode'), 
    5) == true) {
    // Mobile.setText(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/login/radioInpt'),
    //   GlobalVariable.androidPasscode, 10) //click I Agree and Enter URL to login page
    CustomKeywords.'Android.EnterCode'(passCode)

    CustomKeywords.'Android.EnterCode'(passCode //  CustomKeywords.'Android.tapAllow'()
        //  CustomKeywords.'Android.tapAllow'()
        )
} else {
    Mobile.comment('Does not enter passcode ')

    CustomKeywords.'Android.loginFSL'(inptUser, inptPassword)
}

