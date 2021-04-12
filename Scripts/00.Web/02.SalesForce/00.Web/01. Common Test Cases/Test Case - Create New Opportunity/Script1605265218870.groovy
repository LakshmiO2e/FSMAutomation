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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

/*WebUI.comment('Open the Browser with the URL')

WebUI.openBrowser('delqaapoc-o2e.cs195.force.com/1800GOTJUNK/s/contact/00302000004sAHmAAM/french-house?filterName')

WebUI.delay(2)

WebUI.setText(findTestObject('00.Common Objects/01.Login Page/inptUsername'), 'gjcan.fp@1800gotjunk.delqaapoc')

WebUI.setEncryptedText(findTestObject('00.Common Objects/01.Login Page/inptPassword'), 'afFXGqQDhLfCtwRO1mNvYw==')

WebUI.click(findTestObject('00.Common Objects/01.Login Page/btnLogIn'))

WebUI.delay(2)
*/
WebUI.comment('Wait for the page to Load')

WebUI.waitForElementPresent(findTestObject('01.GJOBE/00.CommonObjects/imgUser'), 20)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/btnCreateOpportunity'))

WebUI.waitForPageLoad(2)

//WebUI.selectOptionByLabel(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/01.Step - Create Opportunity/slctType'), 
  //  slctType, false)

//WebUI.setText(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/01.Step - Create Opportunity/inptCloseDate'), slctCloseDate)

//WebUI.click(findTestObject('00.Common Objects/btnNext'))

