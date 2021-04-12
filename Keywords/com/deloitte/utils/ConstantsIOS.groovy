package com.deloitte.utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public final class ConstantsIOS {

	public static final String MENU_BTN_IOSPREDICATE = "type == 'XCUIElementTypeButton' AND enabled == 1 AND label == 'firstValue' AND name == 'firstValue'"

	public static final String MENU_BTN_IOSPREDICATE_SPECIAL = "type == 'XCUIElementTypeButton' AND enabled == 1 AND label == 'firstValue' AND name == 'secondValue'"

	public static final String MENU_STATICTXT_IOS_PREDICATE = "type == 'XCUIElementTypeStaticText' AND enabled == 1 AND label == 'firstValue' AND name == 'firstValue' AND name == 'firstValue'"

	public static final String MENU_PROFILE_IOS_NAME =   "ProfileMenuUtilityCellLabel_firstValue"

	public static final String MENU_PROFILE_SECOND_VALUE_BEGIN = "ProfileMenuUtilityCellLabel_"

	public static final String ADDRESS_AUITO_COMPLETE_IOS_PREDICATE = "type == 'XCUIElementTypeLink' AND enabled == 1 AND label == 'firstValue' AND name == 'firstValue'"

	public static final String SEARCH = "Search "

	public static final String PICKER_WHEEL_IOS_CLASS= "XCUIElementTypePickerWheel"

	public static final String SWITCH_IOS_CLASS_CHAIN = "**/XCUIElementTypeSwitch[`enabled == 1 AND label == 'firstValue' AND name == 'firstValue' AND value == '0'`]"

	public static final String VERIFY_TEXT_FIELD_IOS_CLASS_CHAIN = "**/XCUIElementTypeTextField[`enabled == 1 AND value == 'firstValue'`]"

	public static final String VERIFY_STATIC_TEXT_IOS_CLASS_CHAIN = "**/XCUIElementTypeStaticText[`enabled == 1 AND label == 'firstValue' AND name == 'firstValue' AND value == 'firstValue'`]"

	//public static final String VERIFY_TEXT_FIELD_QUOTE_STATUS = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]"

	public static final String VERTICAL_TIME_SLOT_XPATH = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeStaticText[2]"

	public static final String VERTICAL_TIME_SLOT_HELPER_IOS_PREDICATE = "type == 'XCUIElementTypeOther' AND enabled == 1 AND label == 'accessibility title' AND name == 'accessibility title'"

	public static final String INCLUDE_OPTION_IOS_EXPATH = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[position]/XCUIElementTypeButton[1]"

	public static final String MORE_ACTION_OPTIONS = "salesforce1:actionBarHalfsheet:cell:firstValue"

	public static final String UPLOAD_IMAGES_IOS_NAME = "Upload File Cancel Take Photo Clear Select Photo"

	public static final String UPLOAD_IMAGES_TABLE_CELL_CLASS ="XCUIElementTypeCell"

	public static final String DATE_IDEAL = "Ideal"

	/**
	 * This will return the mapped values for the test Build Space - Step 2 where we need to
	 * Include several options
	 * 
	 * Version = 1 indicates that is Interior 
	 * Version = 2 indicates that is Exterior
	 */
	public static final Map<String,String> getSpaceTypeToInclude(String forArea){

		Map<String,String> mapValues = new LinkedHashMap<String,String>()

		if(forArea.equals(forArea.toLowerCase())){
			mapValues.put("Baseboard","14")
			mapValues.put("Cabinet","17")
			mapValues.put("Ceiling","20")
			mapValues.put("Closet","23")
			mapValues.put("Crown Mouling","26")
			mapValues.put("Door","29")
			mapValues.put("Preparation","32")
			mapValues.put("Stair","35")
			mapValues.put("Wall","38")
			mapValues.put("Window","41")
		}else{	// version 2 - Exterior

			mapValues.put("Deck","14")
			mapValues.put("Door","17")
			mapValues.put("Fascia","20")
			mapValues.put("Fence","23")
			mapValues.put("Other","26")
			mapValues.put("Preparation","29")
			mapValues.put("Presure Wash","32")
			mapValues.put("Soffit","35")
			mapValues.put("Stair","38")
			mapValues.put("Wall","41")
			mapValues.put("Window","44")
		}




		return mapValues


	}
}
