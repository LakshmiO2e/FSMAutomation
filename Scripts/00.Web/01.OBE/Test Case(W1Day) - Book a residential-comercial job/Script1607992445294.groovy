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

WebUI.openBrowser('https://fsm-w1d-obe.pantheonsite.io/onlinebooking')

WebUI.maximizeWindow()

WebUI.comment('##### - Step 1 - Please enter your ZIP or Postal code to book your consulation')

WebUI.setText(findTestObject('05.W1Day/00.Step 1 - Enter Zip code/inptZipCode'), inptZipCode)

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 2 - Book your Free Consultation')

CustomKeywords.'Common.SelectValue'(findTestObject('05.W1Day/01.Step 2 - Book your free consultation/rdBtnValue'), slctPropertyType)

CustomKeywords.'Common.SelectValue'(findTestObject('05.W1Day/01.Step 2 - Book your free consultation/rdBtnValue'), slctWhatToPaint)

CustomKeywords.'Common.SelectValue'(findTestObject('05.W1Day/01.Step 2 - Book your free consultation/rdBtnValue'), slctConsultationPrefer)

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 2 - Book your Free Consultation')

CustomKeywords.'W1Day.SelectDayAndTime'()

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 3 - Contact Details')

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptFirstName'), inptFirstName)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptLastName'), inptLastName)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptPhone'), inptPhone)

WebUI.setText(findTestObject('02.ShackShine/01.Estimate Details/03.Step 4 - Your contact details/inptEmail'), inptEmail)

CustomKeywords.'Common.AddressAutoComplete'(findTestObject('01.GJOBE/02.Create new Appointment/Step 3 - Screen/inptAddress'), 
    inptFullAddress)

WebUI.click(findTestObject('02.ShackShine/btnContinue'))

WebUI.comment('##### - Step 4 - Page Verification')

WebUI.closeBrowser()

