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

WebUI.callTestCase(findTestCase('00.Web/00.Common Test Cases/Test Case - Login'), [('url') : url, ('inptUser') : inptUser
        , ('inptPassword') : inptPassword], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('00.Web/02.SalesForce/00.Web/01. Common Test Cases/Test Case - Create Customer'), [('slctAccountType') : slctAccountType
        , ('inptAccountName') : inptAccountName, ('inptFirstName') : inptFirstName, ('inptLastName') : inptLastName, ('slctPreferredLanguage') : slctPreferredLanguage
        , ('inptPhone') : inptPhone, ('inptEmail') : inptEmail, ('inptFullAddress') : inptFullAddress, ('validationFullName') : validationFullName
        , ('slctIndustry') : slctIndustry], FailureHandling.STOP_ON_FAILURE)

