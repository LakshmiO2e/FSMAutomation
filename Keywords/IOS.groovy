import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.deloitte.main.MainOperation
import com.deloitte.utils.ConstantsIOS
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

public class IOS {

	@Keyword
	public static void SelectMenu(TestObject object, String menuName){
		MainOperation.iosSelectMenu(object,menuName)
	}

	@Keyword
	public static void SelectOption(TestObject object, String menuName){
		MainOperation.iosSelectOption(object,menuName)
	}

	@Keyword
	public static void SelectDropdownValue(TestObject object, String option){
		MainOperation.iosSelectDropdownValue(object, option)
	}

	@Keyword
	public static void AddressAutoComplete(TestObject object, String address){
		MainOperation.iosAddressAutoComplete(object, address)
	}

	@Keyword
	public static void SearchFor(TestObject object, String serachBarName, String value){
		MainOperation.iosSearchFor(object, serachBarName, value)
	}

	@Keyword
	public static void SelectDate(TestObject object, String monthAndDay){
		MainOperation.iosSelectDate(object, monthAndDay)
	}

	@Keyword
	public static void SelectRadioButton(String value){
		MainOperation.iosSelectSwitch(value)
	}

	@Keyword
	public static boolean VerifyValue(TestObject object, String valueToVerify){
		MainOperation.iosVerifyValue(object, valueToVerify)
	}

	@Keyword
	public static void TapHorizontalDate(){
		MainOperation.iosTapHorizontalDate()
	}

	@Keyword
	public static void Scroll(String direction){
		MainOperation.iosScroll(direction)
	}

	@Keyword
	public static void IncludeOptions(String forArea, String inptValue){
		MainOperation.iosIncludeOptions(forArea, inptValue)
	}

	@Keyword
	public static void EnterPasscode(String passcode){
		MainOperation.iosEnterPasscode(passcode)
	}

	@Keyword
	public static void WaitFor(String value, int timeOut){
		MainOperation.iosWaitFor(value, timeOut)
	}

	@Keyword
	public static void UploadPhoto(int photoNumber){
		MainOperation.iosUploadPhoto(photoNumber)
	}

	@Keyword
	public static void SetSpecialText(String value, int positionOnScreen){
		MainOperation.iosSetSpecialTextInput(value, positionOnScreen)
	}

	@Keyword
	public static void DrawSignature(TestObject object){
		MainOperation.iosDrawSignature(object)
	}

	@Keyword
	public static void SpecialDropDown(TestObject object){
		MainOperation.iosSpecialDropDown(object)
	}
}
