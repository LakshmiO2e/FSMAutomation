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

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Related')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Quotes (1)')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), '00001023')

Mobile.comment('###### - Generate Doc Menu - Start Here')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Generate Docs')

Mobile.comment('###### - Step 1 - Choose Documents')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/00.Step1 - Choose Document/slctAllCategories'), 
    'Quote')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/00.Step1 - Choose Document/slctDocEmailEstimate'), 
    10)

Mobile.checkElement(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/00.Step1 - Choose Document/slctComercialProposal'), 
    10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNextStep'), 10)

Mobile.comment('###### - Step 2 - View Documents')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/01.Step 2 - View Documents/btnEmailSelectedDocs'), 
    10)

Mobile.comment('###### - Step 3 - Email Documents')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'IOS.VerifyValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/02.Generate Docs/01.Step 3 - Email Documents/inptToEmail'), 
    'TESTE')

Mobile.delay(200, FailureHandling.STOP_ON_FAILURE)

