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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/lakshmi.kandikuppa/Downloads/Chatter.app', false)

//WebUI.acceptAlert()
//Mobile.tap(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeButton - choose connection button'), 0)
//Mobile.tap(findTestObject('02.ShackShine/SSH-FP/XCUIElementTypeButton - Add'), 0)
//Mobile.delay(0, FailureHandling.CONTINUE_ON_FAILURE)
//Mobile.tap(findTestObject('02.ShackShine/SSH-FP/XCUIElementTypeButton - Host URL'), 0)
//Mobile.setText(findTestObject('02.ShackShine/SSH-FP/XCUIElementTypeButton - Host URL'), 'https://fsmsqatrai-o2e.cs78.force.com/shackshine',
//  0)
//Mobile.setText(findTestObject('02.ShackShine/SSH-FP/XCUIElementTypeTextField - Label'), 'SSH FP', 0)
//Mobile.tap(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeButton - Done'), 0)
//Mobile.tap(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeTextField-Uname'), 0)
//Mobile.setText(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeTextField-Uname'), 'sshcan.fp@shackshine.fsmsqatrai', 
//  0)
//Mobile.setText(findTestObject('02.ShackShine/SSH-FP/XCUIElementTypeSecureTextField-Password'), 'fsmQAfun2', 0)
Mobile.tap(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeButton - menu'), 0)

Mobile.tap(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeStaticText - Create Customer'), 0)

//Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/00. Step 1 - Choose Account Type/slctAccountType'), 
    0)

Mobile.tap(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeStaticText - Residential'), 0)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 0)

//Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/inptAccountName'), 
//  'Test Automation SSHFP 00', 0)
Mobile.setText(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeTextField -  First Name'), 'Test FN 02', 
    0)

Mobile.setText(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeTextField -  Last Name'), 'Test LN 02', 
    0)

Mobile.setText(findTestObject('Object Repository/02.ShackShine/SSH-FP/XCUIElementTypeTextField -Phone'), '1111111111', 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/inptEmail'), 
    'Email@email.com', 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/slctAddress', 
        [('variable') : '']), '8888 University Drive West, Burnaby BC, Canada', 0)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/searchResultAddressLookup'), 
    0)

CustomKeywords.'IOS.Scroll'('down')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/btnCreate Opportunity'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/btnNextOpportunityPage'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/btnBookAppointment'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/ddWorkType'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/selctdd-SSH - Estimate - Commercial'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/btnGet Appointments'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/lnkTimeSlot'), 
    0)

Mobile.tap(findTestObject('Object Repository/04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/Create Opportunity-Book Appointment/XCUIElementTypeButton - Cancel'), 
    0)

