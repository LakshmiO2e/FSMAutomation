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
import Common as Common

WebUI.openBrowser('https://fsmqa-auto-gj-na-obe.pantheonsite.io/onlinebooking')

WebUI.maximizeWindow()

//WebUI.delay(10)

WebUI.comment('##### - Step 1')

WebUI.waitForElementPresent(findTestObject('01.GJOBE/02.Create new Appointment/Step 1 - Screen/inptZipCode'), 30)

WebUI.waitForElementClickable(findTestObject('01.GJOBE/02.Create new Appointment/Step 1 - Screen/inptZipCode'), 30)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 1 - Screen/inptZipCode'), zipCode)

WebUI.click(findTestObject('01.GJOBE/02.Create new Appointment/Step 1 - Screen/btnGO'))

WebUI.comment('##### - Step 2')

WebUI.waitForElementNotVisible(findTestObject('01.GJOBE/00.CommonObjects/loadingSpinner'), 0)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 1 - Screen/txtDescription'), 'Test Automation Residential NA Junk removal ')

CustomKeywords.'GJOBE.SelectDayAndTime'()

WebUI.click(findTestObject('00.Common Objects/btnNextPickUpAddress-Continue'))

WebUI.waitForElementNotVisible(findTestObject('01.GJOBE/00.CommonObjects/loadingSpinner'), 0)

WebUI.comment('##### - Step 3')

if (bookingFor == 'My home') {
    WebUI.click(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/rbtnBookingForMyHome'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/rbtnBookingForABusiness'), FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'Common.AddressAutoComplete'(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptAddress'), 
    address)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptUnit'), unit)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptFirstName'), firstName)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptLastName'), lastName)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptEmail'), email)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptNumberPrefix'), phonePrefix)

WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptPhoneNr'), phoneNr)

//WebUI.click(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/chkboxPromoCode'))

//WebUI.setText(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptPromocode'), 'QAEARLPERCDISCGJ')

//WebUI.selectOptionByValue(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/slctPhoneType'), phoneType, 
  //  false)

WebUI.comment('##### - Step 4')

WebUI.click(findTestObject('00.Common Objects/btnNextPickUpAddress-Continue'))

WebUI.comment('##### - Validation')

WebUI.click(findTestObject('00.Common Objects/btnNextPickUpAddress-Continue'))

if (Common.VerifyElementLabel(findTestObject('01.GJOBE/02.Create new Appointment/Step 4 - Screen/lblConfirmation'), '', 
    'Your job has been confirmed!')) {
    WebUI.comment('Job confirmed!' /* if (Common.ValidateEmailContent('delqaapoc@gmail.com', 'fsmQAfun1', GlobalVariable.GMAL_HOST, '', [validationEmailPhone
            , validationEmailName])) {
        WebUI.comment('Email Validation pass with all values validated')
    } else {
        WebUI.comment('Fail to validate one or more values')
    }*/ )
} else {
    WebUI.comment('Fail to confirm Job!')
}

WebUI.delay(5)

WebUI.closeBrowser()

