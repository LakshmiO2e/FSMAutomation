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

Mobile.comment('Open Quote and switch to SA app')

//Tap Open Quote
//Mobile.verifyElementExist(findTestObject('null'), 5)
if (Mobile.verifyElementExist(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Actions Page/android.widget.TextView - Open Quote Btn Xpath'),
	5)) {
	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Actions Page/android.widget.TextView - Open Quote Btn Xpath'),
		5)
} else {
	CustomKeywords.'Android.refreshPage'()

	Mobile.delay(15)

	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Actions Page/android.widget.TextView - Open Quote Btn Xpath'),
		5)
}

////////////////////////////////Open Quote Process done ONLY for DEBUG TODO REMOVED ///////////////
Mobile.delay(40)

Mobile.comment('Refresh Page ')

//CustomKeywords.'Android.refreshPage'()
//Tap Product
Mobile.comment('Add Product')

if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Products Icon Btn Xpath'),
	10)) {
	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Products Icon Btn Xpath'),
		10 // TODO Sometimes Products button not display need to go back to FSL app close SA app and redo tap lightning buton
		) //    ) //    CustomKeywords.'Android.refreshPage'()
	//
	//) //) //    Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.TextView - To FSL Mobile Xpath'),
	//        5)
	//
	//    Mobile.delay(20)
	//
	//    Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Actions Page/android.widget.TextView - Open Quote Btn Xpath'),
	//        5)
	//	Mobile.pressBack()
	//	Mobile.delay(10)
} else {
	Mobile.delay(10)

	CustomKeywords.'Android.refreshPage'()

	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Products Icon Btn Xpath'),
		10)
}

/*
if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Products Icon Btn Xpath'),
	10)) {
	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Products Icon Btn Xpath'),
		5)
} else {
	Mobile.delay(6)

	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Products Icon Btn Xpath'),
		5)
}
*/
Mobile.delay(15)

//Go to Rate Card Page
//'Scroll to details text'
Mobile.scrollToText('Charge', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.view.View - Min Charge Xpath'),
	5)

Mobile.delay(15)

//Tap Save btn
if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.webkit.WebView-Save Xpath'),
	10)) {
	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.webkit.WebView-Save Xpath'),
		5)
} else {
	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.view.View- Save Btn Xpath'),
		5)
}

Mobile.delay(30)

Mobile.comment('go back to previous page')

//Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.Button - Back Btn In Rate Card Page'), 5)
//Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)
// 33. go back
if (!(Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.view.View-Estimate Summary Xpath'),
	10))) {
	Mobile.pressBack()

	Mobile.delay(20)

	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.view.View Estimate Summary UiS'),
		5) //    Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.Button - Back Btn In Rate Card Page'),
	//        5)
} else {
	Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.view.View-Estimate Summary Xpath'),
		5)
}

Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Save button to save
Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.Button - Save - Bottom Btn'),
	10)

Mobile.delay(30)

//If popup Confirm Alert Window then tap OK button in Confirm page
if (Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.TextView - Confirm Title Text'),
	5)) {
	//Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.Button - Confirm Page OK Btn Id'), 5)
	Mobile.delay(20)
} else {
	Mobile.comment('No Confirm Alert Window popuo, doesn\'t need to tap OK button')
}

//Tap Back btn need do next step TODO
//Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.Button - Back Btn'), 5)
//Mobile.delay(6)
/*Confirm Page click OK
Mobile.verifyElementVisible(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.TextView - Confirm Title Text'),
	3)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Rate Card Page/android.widget.Button - OK Btn'),
	2)

Mobile.delay(4)
*/
//Confirm Page back to Open Quote page , tap email estimate btn
//Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Open Quote/android.widget.ImageView- Email Estimate Image Btn'),
//    2)
//
//Mobile.delay(4)

Mobile.comment('Add products done! ')