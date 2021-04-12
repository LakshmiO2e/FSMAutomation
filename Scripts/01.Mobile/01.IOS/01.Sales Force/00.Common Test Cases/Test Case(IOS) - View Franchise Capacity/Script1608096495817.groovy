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
import IOS as IOS

Mobile.comment('##### - Select Menu - View Franchise Capacity')

CustomKeywords.'IOS.WaitFor'('More', 30)

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'More')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'View Franchise Capacity')

Mobile.comment('##### - Screen 1')

CustomKeywords.'IOS.SetSpecialText'(inptHourDays, 1)

CustomKeywords.'IOS.SetSpecialText'(inptNumberDays, 2)

CustomKeywords.'IOS.SpecialDropDown'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/05.View Franchise Capacity/00.Screen 1/slctWokType'))

CustomKeywords.'IOS.SelectDate'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/05.View Franchise Capacity/00.Screen 1/slctDate'), 
    slctStartDate)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.comment('##### - Screen 2 ')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/05.View Franchise Capacity/01.Screen 2 - Availability/slctAvailabilityCheckDate1'), 
    20)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/05.View Franchise Capacity/01.Screen 2 - Availability/slctAvailabilityCheckDate2'), 
    20)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), verifyAppointmentMessage)) {
    Mobile.comment(verifyAppointmentMessage)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnFinish'), 10)
} else {
    Mobile.comment('Error with Appointment - View Franchise Capacity')
}

Mobile.delay(90, FailureHandling.CONTINUE_ON_FAILURE)

