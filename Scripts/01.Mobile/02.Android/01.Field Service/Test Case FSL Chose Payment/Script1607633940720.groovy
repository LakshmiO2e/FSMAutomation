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

//Select Payment type
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Generate Report/android.view.ViewGroup-Payment Type Dropdown List Btn'),
	4)

Mobile.delay(5)

//Select Visa as Payment Type
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Generate Report/android.view.ViewGroup-Visa Radio Btn'),
	4)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Generate Report/android.widget.TextView - Next Btn in Step2 GR Page'),
	4)

Mobile.delay(5)

//Select ResidentialNo Singature Radio Btn
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Generate Report/android.view.ViewGroup-ResidentialNoSignature Radio Btn'))

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Generate Report/android.widget.TextView - Next- Botton Btn Step3'),
	4)

Mobile.delay(4)

//in Step 4 just click next button
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Generate Report/android.widget.TextView - Next- Botton Btn Step3'),
	4)

Mobile.delay(4)
//
//def isOK = Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Finish Btn'))
//
//if (isOK == true) {
//	Mobile.comment('passed')
//
//	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Finish Btn'),
//		4)
//}