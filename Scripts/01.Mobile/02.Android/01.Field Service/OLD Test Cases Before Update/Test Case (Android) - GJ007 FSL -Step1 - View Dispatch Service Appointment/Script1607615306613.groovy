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

/*
 * GJ007 login to FSL app

select calender select Calender picker btn 
(1)tap calender picker btn 

select appointment data 

(2)tap one date

in Overview Page 

(3)tap service appointment Item 

go to work order page 

Tap service appoint item again will show all the details (But only view , can not modify )

Tap Action lightning button , go to Actions Page

*/
Mobile.delay(5)

CustomKeywords.'Android.EnterCode'(GlobalVariable.androidFSLPasscode)

Mobile.comment('Select appointment')

//CustomKeywords.'Android.clickClockIcon'()
Mobile.delay(5)

CustomKeywords.'Android.tapCalendarIcon'()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Go to work order page')

CustomKeywords.'Android.clickClockIcon'()

Mobile.delay(10)

Mobile.comment('View service Appointment')

