package com.deloitte.o2e.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return

import com.deloitte.core.MobileBase
import com.deloitte.utils.ConstantsIOS
import com.deloitte.utils.StringUtils
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


import org.openqa.selenium.By
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.touch.TouchActions
import org.openqa.selenium.remote.RemoteWebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement
import io.appium.java_client.AppiumDriver


import internal.GlobalVariable

public class IosKeys extends MobileBase {

	/**
	 * 
	 * @param object
	 * @param menuName
	 */
	public void selectMenu(TestObject object, String menuName){

		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		String iosPredicate = ""

		try{

			mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.IOS_PREDICATE_STRING)

			mobileObject.setMobileLocator(menuSpecialTreatment(menuName))

			StringUtils.loggerMobile(menuSpecialTreatment(menuName))

			Mobile.tap(mobileObject, 5,FailureHandling.STOP_ON_FAILURE)
		}catch(Exception e){
			//if fails means that the type is STATIC TXT and not Button

			leftMenu(object, menuName)
		}
	}

	/**
	 * This method will use a different CONSTANT depending on the value
	 * because the IOS ID for bottom menu "Menu"
	 * the id is different use UpperCase and the LowerCase
	 * So for that to only create one global keyword we need this validation first
	 * 
	 * @param value
	 * @return
	 */
	private String menuSpecialTreatment(String value){

		String iosPredicate = ConstantsIOS.MENU_BTN_IOSPREDICATE_SPECIAL

		if(value.equals("Menu")){

			return iosPredicate.replace("firstValue", value).replace("secondValue", value.toLowerCase())
		}

		iosPredicate = ConstantsIOS.MENU_BTN_IOSPREDICATE

		return iosPredicate.replaceAll("firstValue", value)
	}

	/**
	 * This method will try and click for the left menu
	 * depending on the input value
	 * This method is different because internally the IOS ID is a type STATIC TXT
	 * and the other ones are type = button
	 * @param value
	 * @return
	 */
	private void leftMenu(TestObject object, String value){

		String iosPredicate = ""
		try{
			iosPredicate = ConstantsIOS.MENU_STATICTXT_IOS_PREDICATE

			tapOnSpecificPredicateByValue(iosPredicate, value)
		}catch(Exception e){
			iosPredicate = ConstantsIOS.MENU_PROFILE_IOS_NAME

			tapOnSpecificPredicateByValue(iosPredicate, value)
		}
	}

	/**
	 * We don't need the object ID because at this moment
	 * we create the object internally
	 * In the future this method could change if there is a need for that
	 * otherwise will remain like this
	 * @param object
	 * @param iosPredicate
	 * @param value
	 */
	private void tapOnSpecificPredicateByValue(String iosPredicate, String value){

		MobileTestObject mobileObject =  new MobileTestObject("IOS Object")

		iosPredicate = iosPredicate.replaceAll("firstValue", value)

		StringUtils.loggerMobile(iosPredicate)

		mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.IOS_PREDICATE_STRING)
		mobileObject.setMobileLocator(iosPredicate)

		Mobile.tap(mobileObject, 2, FailureHandling.STOP_ON_FAILURE)
	}

	/**
	 * 
	 * @param object
	 * @param option
	 */
	public void selectOption(TestObject object, String option, Boolean repeat){

		try{

			MobileTestObject mobileObject = findTestObject(object.getObjectId())

			mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.NAME)

			StringUtils.loggerMobile("Value to select ", option)
			By byTimeSlot = null

			if(mobileObject.getMobileLocator().contains("salesforce1")){
				mobileObject.setMobileLocator(ConstantsIOS.MORE_ACTION_OPTIONS.replace("firstValue", option))
				byTimeSlot = MobileBy.name(ConstantsIOS.MORE_ACTION_OPTIONS.replace("firstValue", option))
			}else{
				mobileObject.setMobileLocator(option)
				byTimeSlot = MobileBy.name(option)
			}

			waitForUntil(10, byTimeSlot)

			//Mobile.tapAndHold(mobileObject, 1, 10)

			if (repeat) {
				Mobile.doubleTap(mobileObject, 5,FailureHandling.STOP_ON_FAILURE)
			}else{
				Mobile.tap(mobileObject, 5,FailureHandling.STOP_ON_FAILURE)
			}
		}catch(Exception e){

			StringUtils.loggerMobile("Value to select ", option)

			tapElementBy(option)
		}
	}

	/**
	 * This method will be used only for "dropdown" look alike objects
	 * 
	 * @param object
	 * @param option
	 */
	public void selectDropdownValue(TestObject object, String option){

		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		Mobile.tap(mobileObject, 30,FailureHandling.STOP_ON_FAILURE)

		(((CharSequence)option).contains(";")) ? isMultipleOptions(mobileObject,option) : selectOption(object, option,false)
	}

	private void isMultipleOptions(TestObject object, String option){

		String[] multipleOptions = option.split(";")

		for(String values : multipleOptions){
			selectOption(object, values,false)
		}
	}

	public void selectAddressAutoComplete(TestObject object, String address){

		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		String iosPredicate = ConstantsIOS.ADDRESS_AUITO_COMPLETE_IOS_PREDICATE

		Mobile.setText(mobileObject, address, 30)

		Mobile.delay(2)

		tapOnSpecificPredicateByValue(iosPredicate, address)

		scroll("down")
	}

	/**
	 * 
	 * @param object
	 * @param value
	 * @return
	 */
	public void searchFor(TestObject object, String serachBarName, String value){

		//first click on search and add the text
		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.NAME)

		mobileObject.setMobileLocator(StringUtils.concatenateValues(ConstantsIOS.SEARCH,serachBarName))

		Mobile.setText(mobileObject, value,10,FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(3)

		//now we will select the first element with that name

		Mobile.tap(findTestObject("Object Repository/04.Mobile/01.IOS/00.Common Objects/01.Search Bar Objects/srchResult"),10,FailureHandling.STOP_ON_FAILURE)
	}


	public void selectDate(TestObject object, String monthAndDay){

		MobileTestObject mobileObject = findTestObject(object.getObjectId())
		Mobile.tap(mobileObject,10)

		selectDateFromDatePicker(monthAndDay)
	}

	public void selectSwitch(String value){
		MobileTestObject mobileObject = new MobileTestObject("Object type Switch")

		try{
			//for the original IOS radio button
			String iosClassChain = ConstantsIOS.SWITCH_IOS_CLASS_CHAIN.replaceAll("firstValue", value)

			mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.IOS_CLASS_CHAIN)

			mobileObject.setMobileLocator(iosClassChain)

			StringUtils.loggerMobile(iosClassChain)

			Mobile.tap(mobileObject,5)
		}catch(Exception e ){
			//try to use a normal id

			StringUtils.loggerMobile(value)

			tapElementBy(value)
			//Mobile.tap(mobileObject,5,FailureHandling.STOP_ON_FAILURE)
		}
	}

	public boolean verifyValue(TestObject object, String valueToVerify){

		try{
			MobileTestObject mobileObject = findTestObject(object.getObjectId())

			whichLocatorStrategy(mobileObject)

			whichMobileLocator(mobileObject,valueToVerify)

			By byName = MobileBy.name(valueToVerify)
			waitForUntil(10, byName)

			String value = Mobile.getText(mobileObject, 3)

			StringUtils.loggerMobile("Value to find: ",valueToVerify)
			StringUtils.loggerMobile("Value found: ",value)
		}catch(Exception e){

			//wee need this for FSL App
			try{
				String value1 = getDriver().findElements((MobileBy.name(valueToVerify))).get(0).getText()
				StringUtils.loggerMobile("Value to find: ",valueToVerify)
				StringUtils.loggerMobile("Value found: ",value1)
			}catch(Exception ee){
				throw new Exception("Failed to verify values from excel with value from UI")
			}
		}

		return true
	}

	/**
	 * Define Locator Strategy for a specific mobile object
	 * @param mobileObject
	 */
	private void whichLocatorStrategy(MobileTestObject mobileObject){

		switch (mobileObject.getMobileLocator()){

			case MobileLocatorStrategy.IOS_CLASS_CHAIN:
			//xpath = ConstantsIOS.VERIFY_TEXT_FIELD_IOS_CLASS_CHAIN
				mobileObject.getMobileLocator().equals(MobileLocatorStrategy.IOS_CLASS_CHAIN)

			case MobileLocatorStrategy.XPATH:
			//xpath = ConstantsIOS.VERIFY_STATIC_TEXT_IOS_CLASS_CHAIN
				mobileObject.getMobileLocator().equals(MobileLocatorStrategy.XPATH)

		}
	}

	/**
	 * Define the locator for the specific object at the moment we only use
	 * static text and text filed input
	 * @param mobileObject
	 */
	private void whichMobileLocator(MobileTestObject mobileObject, String valueToVerify){

		if(mobileObject.getMobileLocator().contains("**/XCUIElementTypeTextField")){
			mobileObject.setMobileLocator(ConstantsIOS.VERIFY_TEXT_FIELD_IOS_CLASS_CHAIN.replaceAll("firstValue", valueToVerify))
		}else if(mobileObject.getMobileLocator().contains("**/XCUIElementTypeStaticText")){
			mobileObject.setMobileLocator(ConstantsIOS.VERIFY_STATIC_TEXT_IOS_CLASS_CHAIN.replaceAll("firstValue", valueToVerify))
		}
	}

	public void tapHorizontalDate(){

		MobileTestObject mobileObject = new MobileTestObject("Object type tap horizontal date")

		By byTitle = MobileBy.name("accessibility title")
		waitForUntilPresent(30, byTitle,"accessibility title")
		mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.IOS_PREDICATE_STRING)
		mobileObject.setMobileLocator(ConstantsIOS.VERTICAL_TIME_SLOT_HELPER_IOS_PREDICATE)
		Mobile.tap(mobileObject,5,FailureHandling.STOP_ON_FAILURE)

		//By byTimeSlot = MobileBy.xpath(ConstantsIOS.VERTICAL_TIME_SLOT_XPATH)
		By byTimeSlot = MobileBy.xpath(ConstantsIOS.DATE_IDEAL)
		waitForUntilPresent(30, byTimeSlot,ConstantsIOS.DATE_IDEAL)

		//tapElementBy(ConstantsIOS.VERTICAL_TIME_SLOT_XPATH)
		tapElementBy(ConstantsIOS.DATE_IDEAL)

		/*
		 mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)
		 mobileObject.setMobileLocator(ConstantsIOS.VERTICAL_TIME_SLOT_XPATH)
		 Mobile.doubleTap(mobileObject,30,FailureHandling.STOP_ON_FAILURE)
		 */

		/*
		 int count = 0;
		 boolean clicked = false;
		 while (count < 20 && !clicked) {
		 try {
		 mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.IOS_PREDICATE_STRING)
		 mobileObject.setMobileLocator(ConstantsIOS.VERTICAL_TIME_SLOT_HELPER_IOS_PREDICATE)
		 Mobile.tap(mobileObject,30)
		 Mobile.tap(mobileObject,30)
		 mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)
		 mobileObject.setMobileLocator(ConstantsIOS.VERTICAL_TIME_SLOT_XPATH)
		 Mobile.doubleTap(mobileObject,10)
		 clicked = true;
		 }
		 catch (StaleElementReferenceException e) {
		 StringUtils.loggerMobile("Wait for time slot to be available")
		 count = count+1;
		 Mobile.delay(1)
		 }
		 }
		 */
	}

	public static void includeOptions(String forArea, String inptValue){
		MobileTestObject mobileObject = new MobileTestObject("Object type include object")

		mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

		String iosXpath = ConstantsIOS.INCLUDE_OPTION_IOS_EXPATH

		if(((CharSequence)inptValue).contains(";")){
			String[] values = inptValue.split(";")
			for (String value: values){
				iosXpath = ConstantsIOS.INCLUDE_OPTION_IOS_EXPATH

				String pos = ConstantsIOS.getSpaceTypeToInclude(forArea).get(value)
				iosXpath = iosXpath.replace("position",pos)

				waitForUntil(30, MobileBy.xpath(iosXpath))

				mobileObject.setMobileLocator(iosXpath)
				Mobile.tap(mobileObject,30,FailureHandling.STOP_ON_FAILURE)
			}
		}else{
			String pos = ConstantsIOS.getSpaceTypeToInclude(forArea).get(inptValue)
			iosXpath = iosXpath.replace("position",pos)

			mobileObject.setMobileLocator(iosXpath)

			waitForUntil(30, MobileBy.xpath(iosXpath))
			Mobile.tap(mobileObject,30,FailureHandling.STOP_ON_FAILURE)
		}
	}

	/**
	 * This method is user in FSL app in order to tap the login 
	 * pass code
	 * @param passCode
	 */
	public static void enterPasscode(String passCode){
		String[] values = passCode.split(";")

		MobileTestObject mobileObject = new MobileTestObject("PassCode Object")
		mobileObject.setMobileLocatorStrategy(MobileLocatorStrategy.NAME)

		for (String value : values){
			mobileObject.setMobileLocator(value)
			Mobile.tap(mobileObject, 10)
		}
	}

	public static void waitFor(String value, int timeOut){

		StringUtils.logger(value)

		waitForElementName(value,timeOut)
	}


	public static void uploadPhoto(int photoNumber){

		try{
			List<MobileElement> elements = getDriver().findElements(MobileBy.name(ConstantsIOS.UPLOAD_IMAGES_IOS_NAME))

			if(!elements.isEmpty()){
				//click button upload photo
				elements[0].click()
			}

			List<MobileElement> images = getDriver().findElements(MobileBy.className(ConstantsIOS.UPLOAD_IMAGES_TABLE_CELL_CLASS))

			if(!images.isEmpty()){

				if (photoNumber > 0){
					images.get(photoNumber-1).click()
				}else{
					//click at the first image that exist in library
					images.get(0).click()
				}
			}
		}catch(Exception e){
			throw new Exception("A problem occured when trying to upload an photo")
		}
	}

	public static void setSpecialTextInput(String value,int positionOnScreen){

		setSpecialText(value, positionOnScreen)
	}


	public static void drawDefaultSignature(TestObject object){

		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		String nameLocator = mobileObject.getMobileLocator()

		drawSignature(nameLocator)

	}

	/**
	 * At this moment this keyword only works with W1Day - View Franchise Capacity
	 * @param object
	 */
	public static void specialDropDown(TestObject object){

		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		Mobile.tap(mobileObject, 5,FailureHandling.STOP_ON_FAILURE)

		specialDropDownForW1Day(mobileObject.getMobileLocator())
	}
}
