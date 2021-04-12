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

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Related')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Quotes (1)')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), '00001033')

Mobile.comment('Build Space - Start Here')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Build Space')

Mobile.comment('Build Space - Step 1')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctSpaceType'), 
    'Standard')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctName'), 
    'Office')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctArea'), 
    'Exterior')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptSides'), 
    '30 40', 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptHeight'), 
    '50', 0)

not_run: if (true) {
    Mobile.comment('Space Type Standard we have 2 inputs')

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptSides'), 
        '20 20', 0)

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptHeight'), 
        '10', 0)
}

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctSetupCleanupRate'), 
    '+1hr / 8hr')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctSuppliesRate'), 
    '$2 / hr')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptNewPaintName'), 
    'Paint Name', 0)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnHideKeyword'), 0)

CustomKeywords.'IOS.Scroll'('down')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.comment('Step 2 - Space Includs')

not_run: CustomKeywords.'com.deloitte.o2e.automation.IosKeys.includeOptions'('Baseboard;Ceiling;Crown Mouling;Wall')

CustomKeywords.'IOS.IncludeOptions'('Exterior', 'Preparation;Stair;Wall;Window')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Step 3 - Baseboard Details')

Mobile.comment('Note we need do replicate the page steps as many Included we have')

Mobile.comment('Preparation')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    '################# - Caulking')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    '30 40', 10)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedSecond'), 
    '1', 10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('################# - Stair')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    '10', 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    'Riser and Tread')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintCost'), 
    '2')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedSecond'), 
    '1', 10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('################# - Wall')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    '30 40', 10)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedSecond'), 
    '50', 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    'Wall / Siding')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintApplication'), 
    'Roll')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintCost'), 
    '2')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('################# -  Window')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    '20', 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    'Shutter Large')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedSecond'), 
    '1', 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctDificulty'), 
    'Hard')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintCost'), 
    '2')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('Step - Space Summary')

CustomKeywords.'IOS.Scroll'('down')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/04.Step - Space Summary/slctPaintDetails'), 
    'Generic Paint 01 / $60')

CustomKeywords.'IOS.Scroll'('up')

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.delay(100)

