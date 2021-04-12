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

Mobile.delay(2)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.ImageView - Calander'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Tomorrow'), 0)

Mobile.comment('Show Service Appointment')

//Mobile.scrollToText('TestAutomation Account 61', FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.waitForElementPresent(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.widget.TextView - ETA not available Text'), 
    15)

Mobile.tap(findTestObject('04.Mobile/02.Android/01.FS.GJ-FieldServicesActions/Service Appointment Work Order Page/android.widget.TextView - ETA not available Text'), 
    10)

Mobile.delay(10)
*/
Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.view.ViewGroup-Open ServiceAppointment'), 5)

Mobile.delay(3)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Actions'), 3)

Mobile.delay(3)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Call Ahead'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Spoke to Customer'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.EditText-CallAheadComments'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

Mobile.sendKeys(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.EditText-CallAheadComments'), 'Test Automation')

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAheadFinish'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Actions'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Change Status'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - En Route'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAheadFinish'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Actions'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Change Status'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - On Site'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAheadFinish'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Actions'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Open Quote'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Products'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - ProductLoad'), 0)

Mobile.delay(5)

//Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.EditText - ProductQuantity'), 0)
//Mobile.delay(5)
//Mobile.sendKeys(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.EditText - ProductQuantity'), '1')
//Mobile.delay(5)
Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.Button - SaveProduct'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.view.View - Estimate Summary Banner'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.Button - SaveQuote'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - To FSL Mobile Hyperlink'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Actions'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Generate Service Report'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Call Ahead'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - PaymentType-ListNone'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView -Payment Type Visa (Revenue)'), 
    0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - Residential No Signature'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAhead-Next'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('04.Mobile/02.Android/FSL-TTM-Estimate/android.widget.TextView - CallAheadFinish'), 0)

Mobile.delay(5)

