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

Mobile.comment('###### - Create Opportunity')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 'Create Opportunity')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/00.Menu - Accounts/00.Contact View/00.Create Opportunity/slctOpportunityType'), 
    slctType)

CustomKeywords.'IOS.SelectDate'(findTestObject('04.Mobile/01.IOS/00.Main Page/00.Menu - Accounts/00.Contact View/slctDate'), 
    slctCloseDate)

Mobile.comment('###### - Job Information')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/00.Menu - Accounts/00.Contact View/00.Create Opportunity/slctLocationType'), 
    slctLocationType)

CustomKeywords.'IOS.SelectRadioButton'(slctArea)

Mobile.comment('###### - If Comercial')

if (slctType == 'Commercial') {
    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)

    Mobile.comment('###### - Verify - If we select Interior or Exterior')

    if (IOS.VerifyValue(findTestObject('04.Mobile/01.IOS/00.Common Objects/04. Verify Objects/verifyStaticText'), 'Please indicate Interior and/or Exterior for Commercial Jobs')) {
        CustomKeywords.'IOS.SelectRadioButton'(slctArea)

        Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)
    }
} else {
    CustomKeywords.'IOS.SelectRadioButton'(slctArea)

    Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 10)
}

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common - Validations/Test Case - Validation Opportunity Info'), 
    [('validationOpportunityStatus') : validationOpportunityStatus, ('validationOpportunityType') : validationOpportunityType], 
    FailureHandling.STOP_ON_FAILURE)

