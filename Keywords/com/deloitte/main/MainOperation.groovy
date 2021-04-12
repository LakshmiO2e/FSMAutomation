package com.deloitte.main
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.deloitte.o2e.automation.GjobeWebsite
import com.deloitte.o2e.automation.ShackShineWebsite
import com.deloitte.o2e.automation.SalesForceWebsite
import com.deloitte.o2e.automation.W1DayWebsite
import com.deloitte.o2e.automation.AndroidKeys
import com.deloitte.o2e.automation.IosKeys
import com.deloitte.o2e.automation.EmailKeys
import com.deloitte.core.MobileBase
import com.deloitte.o2e.automation.CommonKeys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MainOperation{



	/**
	 * ##########################################################################################
	 * Call all the GJOBE AU keywords
	 * ##########################################################################################
	 */

	/**
	 * 
	 */
	public static void gjobeSelectDayAndTime(){

		new GjobeWebsite().selectDayAndTime()
	}

	public static void gjobeSelectGantTimeline(String value){
		new GjobeWebsite().selectGantTimeLine(value)
	}

	public static void gjobeDragGanttAppointmentToToday(TestObject object,String teamName, String serviceNumber,String statusValue){
		new GjobeWebsite().dragGanttAppointmentToToday(object, teamName, serviceNumber, statusValue)
	}


	/**
	 * ##########################################################################################
	 * Call all the ShackShine keywords
	 * ##########################################################################################
	 */
	/**
	 * 
	 * @param serviceCategory
	 * @param serviceName
	 * @param optionalNumber
	 */
	public static void shackShineSelectService(String serviceCategory, String serviceName, String optionalNumber){

		new ShackShineWebsite().selectService(serviceCategory, serviceName, optionalNumber)
	}

	public static void shackSelectDayAndTime(){

		new ShackShineWebsite().selectDayAndTime()
	}

	public static void w1DaySelectDayAndTime(){

		new W1DayWebsite().selectDayAndTime()
	}

	/**
	 * ##########################################################################################
	 * Call all the GJOBE AU keywords
	 * ##########################################################################################
	 */

	/**
	 * ##########################################################################################
	 * Call all the SalesForce keywords
	 * ##########################################################################################
	 */

	public static void salesForceSelectApp(String appName){

		new SalesForceWebsite().selectApp(appName)
	}

	public static void salesForceSelectAppMenu(String appMenu){

		new SalesForceWebsite().selectAppMenu(appMenu)
	}


	/**
	 * ##########################################################################################
	 * Call all the Common keywords
	 * ##########################################################################################
	 */

	public static void commonAddressAutoComplete(TestObject object, String fullAddress){
		new CommonKeys().addressAutocomplete(object, fullAddress)
	}

	public static boolean commonVerifyElementLabel(TestObject object, String objectParent, String valueToMatch){
		new CommonKeys().verifyElementLabel(object, objectParent, valueToMatch)
	}

	public static void commonClick(TestObject object){
		new CommonKeys().clickElement(object)
	}

	public static void commonSelectValue(TestObject object, String value){
		new CommonKeys().selectValue(object, value)
	}

	public static boolean commonValidateEmailContent(String username, String password,String gmailHost, String emailKeyWords,List<String> valuesToValidate){
		return new EmailKeys().validateEmailContent(username, password, gmailHost, emailKeyWords,valuesToValidate)
	}

	public static boolean commonOpenPdfAcceptURL(String username, String password,String gmailHost, String emailKeyWords){
		return new EmailKeys().ValidateEmailPDF(username, password, gmailHost, emailKeyWords)
	}

	/**
	 * ##########################################################################################
	 * Call all the IOS keywords
	 * ##########################################################################################
	 */

	public static void iosSelectMenu(TestObject object, String menuName){
		new IosKeys().selectMenu(object, menuName)
	}

	public static void iosSelectOption(TestObject object, String menuName){
		new IosKeys().selectOption(object, menuName,false)
	}

	public static void iosSelectDropdownValue(TestObject object, String option){
		new IosKeys().selectDropdownValue(object, option)
	}

	public static void iosAddressAutoComplete(TestObject object, String address){
		new IosKeys().selectAddressAutoComplete(object, address)
	}

	public static void iosSearchFor(TestObject object,String serachBarName, String value){
		new IosKeys().searchFor(object, serachBarName, value)
	}

	public static void iosSelectDate(TestObject object, String monthAndDay){
		new IosKeys().selectDate(object, monthAndDay)
	}

	public static void iosSelectSwitch(String value){
		new IosKeys().selectSwitch(value)
	}

	public static boolean iosVerifyValue(TestObject object, String valueToVerify){
		new IosKeys().verifyValue(object, valueToVerify)
	}

	public static void iosTapHorizontalDate(){
		new IosKeys().tapHorizontalDate()
	}

	public static void iosScroll(String direction){
		MobileBase.scroll(direction)
	}

	public static void iosIncludeOptions(String forArea, String inptValue){
		new IosKeys().includeOptions(forArea, inptValue)
	}

	public static void iosEnterPasscode(String passCode){
		new IosKeys().enterPasscode(passCode)
	}

	public static void iosWaitFor(String value, int timeOut){
		new IosKeys().waitFor(value,timeOut)
	}

	public static void iosUploadPhoto(int photoNumber){
		new IosKeys().uploadPhoto(photoNumber)
	}

	public static void iosSetSpecialTextInput(String value, int positionOnScreen){
		new IosKeys().setSpecialText(value, positionOnScreen)
	}

	public static void iosDrawSignature(TestObject object){
		new IosKeys().drawDefaultSignature(object)
	}

	public static void iosSpecialDropDown(TestObject object){
		new IosKeys().specialDropDown(object)
	}


	/**
	 * ##########################################################################################
	 * Call all the Android keywords
	 * ##########################################################################################
	 */



	public static void loginFSL(String username,String password){
		new AndroidKeys().loginFSL(username,password)
	}

	public static void tapAllow(){
		new AndroidKeys().tapAllow()
	}


	public static void androidEnterPasscodeForFSLApp(String code){
		new AndroidKeys().enterPasscodeForFSLApp(code)
	}

	public static void tapCalendarIcon(){
		new AndroidKeys().tapCalendarIcon()
	}

	public static void tapCalendarIconAndTap1Date(){
		new AndroidKeys().tapCalendarIconAndTap1Date()
	}

	public static void clickClockIconGotoWorkOrderPage(){
		new AndroidKeys().clickClockIconGotoWorkOrderPage()
	}

	public static void tapIAgree(){
		new AndroidKeys().tapIAgree()
	}

	public static void tapWait(){
		new AndroidKeys().tapWait()
	}

	public static void refreshPage(){
		new AndroidKeys().refreshPage()
	}

	public static void takeAPicAndUpload(){
		new AndroidKeys().takeAPicAndUpload()
	}

	public static void tapCalendarIconAndTap3Date(){
		new AndroidKeys().tapCalendarIconAndTap3Date()
	}
}