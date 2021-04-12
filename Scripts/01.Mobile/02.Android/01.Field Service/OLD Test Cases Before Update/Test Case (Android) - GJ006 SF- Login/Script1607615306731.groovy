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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(androidFileApp, false)

Mobile.delay(5)

//click I Agree and Enter URL to login page
Mobile.setText(findTestObject('Object Repository/04.Mobile/02.Android/android.view.View - Username'), GlobalVariable.variableUsername, 
    30)

Mobile.delay(3)

WebUI.setText(findTestObject('04.Mobile/02.Android/00.Login/android.view.View - Password'), GlobalVariable.variablePassword)

Mobile.tap(findTestObject('04.Mobile/02.Android/00.Login/android.widget.Button - Log In to Sandbox'), 10)

Mobile.tap(findTestObject('04.Mobile/02.Android/00.Connection/android.widget.TextView - I AGREE'), 10)

Mobile.closeApplication()

