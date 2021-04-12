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

Mobile.comment("Start Update Status ")
Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.widget.TextView - Change Status'),
	60)

//Tap Update Status
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.widget.TextView - Change Status'),
	10)

Mobile.delay(5)

//Tap Actions
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.view.Change Status - Call Ahead Select Option Radio Btn'),
	10)

//Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.view.Change Status - Next Arrow Btn'),10)

Mobile.delay(5)

//validate if the finish msg is shown
//Mobile.verifyElementExist(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.widget.Change Status - Finish - Btn'),5)