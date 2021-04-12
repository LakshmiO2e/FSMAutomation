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

public final class ConstantsGJOBE {

	public static final String JS_EXECUTOR_CLICK = "arguments[0].click();"
	public static final String LBL_DAY1_INFO_END = " availabilityTableDayFirst']"
	public static final String LBL_DAY2_INFO_END = " day2']"
	public static final String LBL_DAY3_INFO_END = " day3']"

	public static final String LBL_DAY_AVAILABLE_FIELDSET = "//fieldset[@class='form-wrapper']"

	public static final String LBL_DAY_MORNING = "//div[@class='obeAvailabilityToggle obeAvailabilityToggleMorning']"
	public static final String LBL_DAY_AFTERNOON = "//div[@class='obeAvailabilityToggle obeAvailabilityToggleAfternoon']"
	public static final String LBL_DAY_EVENING = "//div[@class='obeAvailabilityToggle obeAvailabilityToggleEvening']"
	public static final String XPATH_ATRB_TEXT = "/text()"

	public static final String XPATH_CHANGE_STATUS_MENU = "//tr[@class='sub_item']/td/div[text()='Change status']"
	public static final String XPATH_CHANGE_STATUS_VALUE = "//tr[@class='sub_item']/td/div[text()='value']"
	public static final String XPATH_GANTT_USER_TO_SEARCH = "//div[@class='dhx_cal_data']/div/div/div[@class='dhx_timeline_label_col']/div[@class='dhx_timeline_label_row dhx_row_item']"

	public static final String XPATH_GANTT_MAIN = "//div[@id='serviceExpertApp']"
	public static final String XPATH_GANTT_TOOLTIP_INFO = "//div[@class='tooltipLine']/b"

	public static final String XPATH_GANTT_BTN_FEED = "//button[@class='InnerLightboxTab' and text()='Feed']"

	public static final String XPATH_GANTT_RDBTN_SENDEMAIL_CHECK = "//input[@class='quickActionCheckboxFieldElement' and @value='1']"
	public static final String XPATH_GANTT_BTN_UPDATE = "//input[@id='publishersharebutton' and @title='Update']"

	public static final String XPATH_GANTT_IFRAME_POPUP_WINDOW = "//iframe[@class='SubTabsIframe']"
}
