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

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), '00001023')

Mobile.comment('Build Space - Start Here')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Build Space')

Mobile.comment('Build Space - Step 1')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctSpaceType'), 
    slctSpaceType)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctName'), 
    slctName)

not_run: CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctArea'), 
    'Interior')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptSides'), 
    inptSides, 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptHeight'), 
    inptHeight, 0)

not_run: if (true) {
    Mobile.comment('Space Type Standard we have 2 inputs')

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptSides'), 
        '20 20', 0)

    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptHeight'), 
        '10', 0)
}

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctSetupCleanupRate'), 
    slctSetupCleanRate)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/slctSuppliesRate'), 
    slctSuppliesRate)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/00.Step 1 - Space Details/inptNewPaintName'), 
    slctDefaultPaint, 0)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnHideKeyword'), 0)

CustomKeywords.'IOS.Scroll'('down')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.comment('Step 2 - Space Includs')

CustomKeywords.'IOS.IncludeOptions'(typeOfMultiSelection, includeMultipleSpaces)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Step 3 - Baseboard Details')

Mobile.comment('Note we need do replicate the page steps as many Included we have')

Mobile.comment('##### - Baseboard')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    includeSpace1_sides, 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    includeSpace1_type)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintApplication'), 
    includeSpace1_paintApplication)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('##### - Ceiling')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    includeSpace2_sides, 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    includeSpace2_type)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintApplication'), 
    includeSpace2_paintApplication)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintCost'), 
    includeSpace2_paintCost)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('##### - Crow')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    includeSpace3_sides, 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    includeSpace3_type)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintApplication'), 
    includeSpace3_paintApplication)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintCost'), 
    includeSpace3_paintCost
)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('##### - Wall')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedFirst'), 
    includeSpace4_sides, 10)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/inptGeneralizedSecond'), 
    includeSpace4_height, 10)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctType'), 
    includeSpace4_type)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/02.Step 3 - BaseBoard Details/slctPaintCost'), 
    includeSpace4_paintCost)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnAddANDNext'), 10)

Mobile.comment('Step - Space Summary')

CustomKeywords.'IOS.Scroll'('down')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/01.Quotes - View/00.Build Space - View/04.Step - Space Summary/slctPaintDetails'), 
    slctPaintDetails
)

CustomKeywords.'IOS.Scroll'('up')

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

Mobile.delay(100)

