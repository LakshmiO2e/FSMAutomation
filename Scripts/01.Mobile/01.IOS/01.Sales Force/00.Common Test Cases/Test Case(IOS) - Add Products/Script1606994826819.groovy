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

not_run: Mobile.startApplication('/Users/Sebass/Desktop/Apps/Chatter.app', false)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Test Cases - Helpers/Test Case(IOS) - Search For'), [('menu') : 'Menu'
        , ('leftMenu') : 'Opportunities', ('searchBarName') : 'Opportunities', ('valueToSearch') : '1-800-GOT-JUNK? - DummyFSL'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Related')

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Quotes (1)')

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), '00001040')

not_run: Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('##### - Select Products')

CustomKeywords.'IOS.WaitFor'('Products', 30)

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Products')

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Hot Tub - (Starting at) $ 350.00')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'Bike $ 116.00')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnSave'), 10)

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), '2 Seater Sofa $ 99.00')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'BBQ $ 116.00')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnSave'), 10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnEstimateSummary'), 30)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnSave'), 10)

Mobile.comment('##### - Verify Estimate Email')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Email Estimate')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/05.Menu - Opportunities/03.Email Estimate/inptEmailTo'), 'scheregi@deloitte.pt', 
    0)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnConfirm'), 10)

Mobile.comment('##### - Open FSL Mobile App')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/slctOption'), 'To FSL Mobile')

Mobile.delay(1000, FailureHandling.STOP_ON_FAILURE)

