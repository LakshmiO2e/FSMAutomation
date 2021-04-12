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
import Common as Common

WebUI.waitForElementPresent(findTestObject('01.GJOBE/00.CommonObjects/imgUser'), 20)

WebUI.comment('##### - Select Menu for Creating new Customer')

WebUI.click(findTestObject('01.GJOBE/00.CommonObjects/btnMenuSales'))

CustomKeywords.'Common.Click'(findTestObject('01.GJOBE/00.CommonObjects/btnBookNewCustomer'))

WebUI.comment('##### - Step 1')

WebUI.selectOptionByLabel(findTestObject('03.SalesForce/00.Common Objects/slctDropdown'), slctAccountType, false)

WebUI.click(findTestObject('00.Common Objects/btnNext'))

WebUI.comment('##### - Step 2')

if (slctAccountType == 'Business') {
    WebUI.setText(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/00.inptAccountName'), 
        inptAccountName)
}

//WebUI.selectOptionByLabel(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/slctIndustry'), 
  //  slctIndustry, false)

WebUI.setText(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/01.inptFirstName'), inptFirstName)

WebUI.setText(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/02.inptLastName'), inptLastName)

WebUI.selectOptionByLabel(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/slctPreferredLanguage'), 
    slctPreferredLanguage, false)

WebUI.setText(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/04.inptPhone'), inptPhone)

WebUI.setText(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/06.inptEmail'), inptEmail)

CustomKeywords.'Common.AddressAutoComplete'(findTestObject('01.GJOBE/01.Flows/00.Create Customer/01.Step 2 - Account Details/inptAddress'), 
    inptFullAddress)

WebUI.click(findTestObject('00.Common Objects/btnNext'))

WebUI.callTestCase(findTestCase('00.Web/02.SalesForce/00.Web/00.Common - Validations/Test Case - Validation Contact Infos'), 
    [('validationFullName') : validationFullName], FailureHandling.STOP_ON_FAILURE)

