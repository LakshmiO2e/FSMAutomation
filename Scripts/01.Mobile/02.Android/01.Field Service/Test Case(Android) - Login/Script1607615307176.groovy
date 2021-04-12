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

Mobile.startApplication(GlobalVariable.AndroidAppFile, false)

WebUI.delay(10)

Mobile.tap(findTestObject('04.Mobile/02.Android/00.Connection/android.widget.Button - I AGREE'), 30)

Mobile.delay(5)



/*Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/01.Gear Menu/btnGear'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/01.Gear Menu/lblIOSOBE'), 10)
*/


Mobile.setText(findTestObject('04.Mobile/02.Android/00.Login/android.view.View - Username'), GlobalVariable.variableUsername, 
    30)

Mobile.setText(findTestObject('04.Mobile/02.Android/00.Login/android.view.View - Password'), GlobalVariable.variablePassword, 
    30)

Mobile.tap(findTestObject('04.Mobile/02.Android/android.widget.TextView - httpslogin.salesforce.com'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Allow Access - View')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Login/00.Allow Access View/btnAllow'), 30, FailureHandling.STOP_ON_FAILURE)

