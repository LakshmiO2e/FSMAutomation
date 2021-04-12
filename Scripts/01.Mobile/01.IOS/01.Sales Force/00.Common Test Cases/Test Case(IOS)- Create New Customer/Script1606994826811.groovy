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

Mobile.comment('Select Account Type')

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/00. Step 1 - Choose Account Type/slctAccountType'), 
    slctAccountType)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 0)

Mobile.comment('Account and Contact Details')

if (slctAccountType == 'Business') {
    Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/inptAccountName'), 
        inptAccountName, 10)
}

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/inptFirstName'), 
    inptFirstName, 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/inptLastName'), 
    inptLastName, 0)

CustomKeywords.'IOS.SelectDropdownValue'(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/slctPreferredLanguage'), 
    slctPreferredLanguage)

if (slctAccountType == 'Business') {
    CustomKeywords.'IOS.SetSpecialText'(inptPhone, 4)
} else {
    CustomKeywords.'IOS.SetSpecialText'(inptPhone, 3)
}

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnHideKeyword'), 0)

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/inptEmail'), 
    inptEmail, 10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnHideKeyword'), 0)

CustomKeywords.'IOS.Scroll'('down')

CustomKeywords.'IOS.AddressAutoComplete'(findTestObject('04.Mobile/01.IOS/00.Main Page/07. Menu - Create Customer/01. Step 2 - Account and Contact Details/slctAddress'), 
    inptFullAddress)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnNext'), 0)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common - Validations/Test Case - Validation Customer Info'), 
    [('validationFullName') : validationFullName], FailureHandling.STOP_ON_FAILURE)

