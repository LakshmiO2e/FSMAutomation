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
import IOS as IOS

CustomKeywords.'IOS.WaitFor'('Book Appointment', 10)

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Book Appointment')

WebUI.comment('###### - Step 1')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/00.Book Appointment - View/00.Step 1/slctWorkType'), 
    slctWorkType)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/00.Book Appointment - View/00.Step 1/btnGetAppointments'), 
    10)

WebUI.comment('###### - Step 2 - Select Date Slot')

CustomKeywords.'IOS.TapHorizontalDate'()

Mobile.comment('###### - Click View Service Appointment')

CustomKeywords.'IOS.WaitFor'('View Service Appointment', 90)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/00.Book Appointment - View/01.Step 2/btnViewServiceAppointment'), 
    10)

Mobile.comment('###### - Select Menu - Change Status')

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/00.Book Appointment - View/00.Step 1/inptAddress'), 
    verifyAddress)) {
    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/00.Book Appointment - View/00.Step 1/btnGetAppointments'), 
        10)

    WebUI.comment('###### - Step 2 - Select Date Slot')

    CustomKeywords.'IOS.TapHorizontalDate'()

    Mobile.comment('###### - Click View Service Appointment')

    CustomKeywords.'IOS.WaitFor'('View Service Appointment', 90)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/00.Book Appointment - View/01.Step 2/btnViewServiceAppointment'), 
        10)

    Mobile.comment('###### - Select Menu - Change Status')

    CustomKeywords.'IOS.WaitFor'('Change Status', 90)

    CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Change Status')

    CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/02.Top Menu Objects/00.Change Status Menu Objects/slctChangeStatus'), 
        status)
} else {
    Mobile.comment('Test Failed. Invalid address found.')
}

Mobile.delay(100, FailureHandling.STOP_ON_FAILURE)

