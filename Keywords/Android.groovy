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

public class Android {


	@Keyword
	public static void loginFSL(String username,String password){
		MainOperation.loginFSL(username,password)
	}

	@Keyword
	public static void tapAllow(){
		MainOperation.tapAllow()
	}

	@Keyword
	public static void tapWait(){
		MainOperation.tapWait()
	}


	@Keyword
	public static void EnterCode(String code){
		MainOperation.androidEnterPasscodeForFSLApp(code)
	}

	@Keyword
	public static void tapCalendarIcon(){
		MainOperation.tapCalendarIcon()
	}

	@Keyword
	public static void tapCalendarIconAndTap1Date(){
		MainOperation.tapCalendarIconAndTap1Date()
	}

	@Keyword
	public static void clickClockIcon(){
		MainOperation.clickClockIconGotoWorkOrderPage()
	}

	@Keyword
	public static void tapIAgree(){
		MainOperation.tapIAgree()
	}

	@Keyword
	public static void refreshPage(){
		MainOperation.refreshPage()
	}

	@Keyword
	public static void takeAPicAndUpload(){
		MainOperation.takeAPicAndUpload()
	}

	@Keyword
	public static void tapCalendarIconAndTap3Date(){
		MainOperation.tapCalendarIconAndTap3Date()
	}
}
