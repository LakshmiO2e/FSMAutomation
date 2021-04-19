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
import Common as Common
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('https://request.shackshine.com/onlinebooking')

WebUI.maximizeWindow()

WebUI.comment('##### - Step 1 - Get an Estimate and Schedule a service')

WebUI.delay(3)

WebUI.setText(findTestObject('02.ShackShine/00.Main Page/inptZipPostalCode'), inptZipCode)

CustomKeywords.'Common.SelectValue'(findTestObject('02.ShackShine/00.Main Page/slctShackSize'), slctShackSize)

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 2 - Choose Your Service')

//CustomKeywords.'SSHOBE.SelectService'(slctServiceCategory, slectServiceName, inptOptionalNumber)
WebUI.click(findTestObject('02.ShackShine/01.Estimate Details/Justin SSH/Page_Shack Shine  Online Booking Engine/label_Exterior Window Washing'))

WebUI.click(findTestObject('02.ShackShine/01.Estimate Details/Justin SSH/Page_Shack Shine  Online Booking Engine/Page_Shack Shine  Online Booking Engine/div_Window and Glass Cleaning'))

WebUI.click(findTestObject('02.ShackShine/01.Estimate Details/Justin SSH/Page_Shack Shine  Online Booking Engine/button_Continue'))

WebUI.comment('##### - Step 3 - Book an onsite estimate')

CustomKeywords.'SSHOBE.SelectDayAndTime'()

WebUI.click(findTestObject('02.ShackShine/01.Estimate Details/Justin SSH/Page_Shack Shine  Online Booking Engine/button_Continue'))

WebUI.comment('##### - Step 4 - Your contact details')

not_run: WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptCity'), 'City')

not_run: WebUI.selectOptionByValue(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/slctState'), 
    'British', false)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptFirstName'), inptFirstName)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptLastName'), inptLastName)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptPhone'), inptPhone)

CustomKeywords.'Common.AddressAutoComplete'(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptAddress'), 
    inptFullAddress)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptEmail'), inptEmail)

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 5 - Review and Confirm booking')

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 6 - Thank you Page')

WebUI.waitForElementClickable(findTestObject('02.ShackShine/btnContinue'), 20)

if (Common.VerifyElementLabel(findTestObject('02.ShackShine/01.Estimate Details/04.Step 5 - Confirmation Page/lblConfirmationShackShine'), 
    '', verifyPageConfirmation)) {
    WebUI.comment('Booking is complete!')
} else {
    WebUI.comment('Some error occured when trying to book a appointment')
}

WebUI.delay(5)

