package com.deloitte.core

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.RemoteWebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.ios.IOSElement
import io.appium.java_client.touch.offset.PointOption
import io.appium.java_client.AppiumDriver

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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public abstract class MobileBase {


	public static void selectDateFromDatePicker(String monthAndDay){

		String[] dateSplit = monthAndDay.split(";")
		List<WebElement> elements = getDriver().findElements(MobileBy.className(ConstantsIOS.PICKER_WHEEL_IOS_CLASS))


		elements.get(0).sendKeys(dateSplit[0])
		elements.get(0).sendKeys(Keys.TAB)
		elements.get(1).sendKeys(dateSplit[1]);

		Mobile.tap(findTestObject("Object Repository/04.Mobile/01.IOS/00.Common Objects/main"), 2)

		/*
		 AppiumDriver mobileDriver = MobileDriverFactory.getDriver()
		 HashMap<String, Object> scrollObject = new HashMap<String, String>();
		 scrollObject.put("order", "next")
		 scrollObject.put("offset", 0.15)
		 scrollObject.put("element", ((RemoteWebElement) elements.get(0)).getId())
		 def driver =  MobileDriverFactory.getDriver()
		 driver.executeScript("mobile: selectPickerWheelValue", scrollObject);
		 */
	}

	public static AppiumDriver getDriver(){
		return  MobileDriverFactory.getDriver()
	}

	public static void scroll(String direction){

		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", direction.toLowerCase())
		getDriver().executeScript("mobile: scroll", scrollObject)

		try{
			Mobile.tap(findTestObject("Object Repository/04.Mobile/01.IOS/00.Common Objects/main"),5)
		}catch(Exception e){
			//do nothing we do not need to click we are using FSL app
		}
	}

	public static void waitForUntil(int seconds, By by){

		WebDriverWait wait = new WebDriverWait(getDriver(), seconds)

		try{
			//wait.until(ExpectedConditions.presenceOfElementLocated(by));
			wait.until(ExpectedConditions.visibilityOfElementLocated(by))
			wait.until(ExpectedConditions.elementToBeClickable(by))
		}catch(Exception e){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by))
		}
	}

	public static void waitForUntilPresent(int seconds, By by, String text){

		WebDriverWait wait = new WebDriverWait(getDriver(), seconds)

		try{
			ExpectedConditions.textToBePresentInElementLocated(by, text)
		}catch(Exception e){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by))
		}
	}


	public static void tapElementBy(String value){

		getDriver().findElement(MobileBy.name(value)).click()
	}

	public static void waitForElementName(String value, int timeOut){

		WebDriverWait wait = new WebDriverWait(getDriver(), (timeOut = 0) ? 10 : timeOut)


		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.name(value)))
	}

	/**
	 * 
	 * @param value
	 * @param positionOnScreen
	 */
	public static void setSpecialText(String value,int positionOnScreen){

		List<MobileElement> list = getDriver().findElements(MobileBy.className("XCUIElementTypeTextField"))

		if(!list.isEmpty()){
			list.get(positionOnScreen-1).clear()
			list.get(positionOnScreen-1).sendKeys(value)
		}
	}

	/**
	 * 
	 * @param name
	 */
	public static void drawSignature(String name){

		def driver =  getDriver()

		MobileElement element = driver.findElement(MobileBy.name(name))

		element.click()

		def x = element.getLocation().getX()
		def y = element.getLocation().getY()

		HashMap<String, Object> drawing = new HashMap<String, String>();

		for(int i = 10;i<30;i++){
			drawing.put("duration", 0.5)
			drawing.put("fromX", x*2)
			drawing.put("fromY", y*2+i*2)
			drawing.put("toX", x*2+i*2)
			drawing.put("toY", y*2+i*2)

			driver.executeScript("mobile: dragFromToForDuration", drawing);
			drawing.clear()
		}
	}



	public static void specialDropDownForW1Day(String xpath){

		MobileElement dropDown = getDriver().findElement(MobileBy.xpath(xpath))
		dropDown.sendKeys(Keys.chord(Keys.ARROW_DOWN))
	}
}
