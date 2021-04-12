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

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Start Application'), [('startAppPath') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Login'), [('inptUser') : '', ('inptPassword') : ''
        , ('passCode') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Open Overview'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Open Work Order'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Open Service Appointment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Show Action'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Update Status'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/02.Android/01.Field Service/Test Case FSL Close Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

