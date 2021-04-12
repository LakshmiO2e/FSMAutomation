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

Mobile.startApplication(GlobalVariable.AndroidAppFile, false)

Mobile.delay(10)

//Tap Calendar picker and Select Target date
Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'), 
    10)

//Tap calendar picker
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'), 
    10)

Mobile.waitForElementPresent(findTestObject('Object Repository/04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Month Back Arrow Btn Xpath'), 
    10)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Calendar/android.widget.TextView - 3'), 10)

Mobile.delay(5)

Mobile.closeApplication()

