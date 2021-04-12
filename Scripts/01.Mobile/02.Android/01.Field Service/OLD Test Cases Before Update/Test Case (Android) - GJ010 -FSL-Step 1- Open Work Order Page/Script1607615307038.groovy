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

Mobile.startApplication(GlobalVariable.AndroidAppFile, false)

Mobile.delay(5)

CustomKeywords.'Android.EnterCode'(GlobalVariable.androidFSLPasscode)

Mobile.delay(20)

Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'), 
    10)

//Tap Calender picker and Select Target date
//Tap calendar picker
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView - Calendar Picker Xpath'), 
    10)

Mobile.delay(3)

//7 choose 24
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.TextView - 24 Image Btn'), 
    10)

Mobile.delay(3)

Mobile.comment('Click Clock icon go to work order page')

//Click Clock icon go to work order page
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment 1 - Profile Page/android.widget.ImageView-Clock Image Icon'), 
    10)

Mobile.delay(5)

Mobile.closeApplication()

