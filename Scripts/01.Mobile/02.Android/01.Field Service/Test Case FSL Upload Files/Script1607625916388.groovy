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

//Tap upload file option
if (Mobile.verifyElementExist(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/uploadFile'), 
    10)) {
    //Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Actions Page/android.widget.TextView - Open Quote Btn Xpath'),5)
    Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/uploadFile'), 
        10)
} else {
    Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.widget.TextView - Actions Lightning Btn'), 
        10)

    Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/uploadFile'), 
        10)

    Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/uploadFile'), 
        10)
}

Mobile.delay(20)

Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/BtnTakePhoto'), 
    60)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/BtnTakePhoto'), 
    10)

Mobile.delay(10)

CustomKeywords.'Android.takeAPicAndUpload'()

/*////////////TODO can't not select photo from Emulator, so using take a photo to get a photo upload
'Tap on Camera icon'
*/
def isOK = Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Finish Btn'), 
    20)

if (isOK == true) {
    Mobile.comment('Test Case Passed' //Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment - Upload File Page/android.widget.TextView - Finish Btn'),9)
        )
} else {
    Mobile.comment('Test Case Failed')
}

