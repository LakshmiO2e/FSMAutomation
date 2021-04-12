import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.deloitte.main.MainOperation
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Common {

	@Keyword
	public static void AddressAutoComplete(TestObject object, String fullAddress){
		MainOperation.commonAddressAutoComplete(object, fullAddress)
	}

	@Keyword
	public static boolean VerifyElementLabel(TestObject object, String objectParent, String valueToMatch){

		return MainOperation.commonVerifyElementLabel(object,objectParent,valueToMatch)
	}

	@Keyword
	public static void Click(TestObject object){
		MainOperation.commonClick(object)
	}

	@Keyword
	public static void SelectValue(TestObject object, String value){
		MainOperation.commonSelectValue(object, value)
	}

	@Keyword
	public static boolean ValidateEmailContent(String username, String password,String gmailHost, String emailKeyWords, List<String> valuesToValidate){
		return MainOperation.commonValidateEmailContent(username, password, gmailHost, emailKeyWords,valuesToValidate)
	}

	@Keyword
	public static boolean VerifyAcceptPDFUrl(String username, String password,String gmailHost, String emailKeyWords){
		return MainOperation.commonOpenPdfAcceptURL(username,password,gmailHost, emailKeyWords)
	}
}
