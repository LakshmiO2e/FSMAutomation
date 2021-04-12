package com.deloitte.core

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Robot
import java.awt.event.KeyEvent

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.interactions.Actions

import com.deloitte.utils.Constants
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public abstract class BasePage {


	/**
	 * WAIT methods
	 */

	public static void waitUntilPageIsLoaded() {
		WebUI.waitForPageLoad(GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
	}

	public static void waitSectionDisplay(int second) {
		WebUI.delay(second)
	}

	public static void waitForPageScrollDown() {
		TestObject mainPage = new TestObject('MainPage')
		mainPage.setSelectorMethod(SelectorMethod.CSS)
		mainPage.setSelectorValue(SelectorMethod.CSS, 'main:not([style*="margin-top"])')
		WebUI.waitForElementPresent(mainPage, GlobalVariable.G_max_timeout, FailureHandling.STOP_ON_FAILURE)
	}

	public static void waitElementByCss(TestObject to, String styleValue) {
		WebUI.waitForElementAttributeValue(to, 'style', styleValue, GlobalVariable.G_min_timeout)
	}

	public static def superWait(TestObject to, int defaultWait = GlobalVariable.G_functionTimeout, isWaitVisible = true) {
		for (int j = 0; j <= defaultWait; j++) {
			if (WebUI.waitForElementNotPresent(to, 1, FailureHandling.OPTIONAL) == false) {
				WebUI.comment("Button is ready: ${to.getObjectId()} and xpath: ${to.findPropertyValue('xpath')}")
				WebUI.waitForElementPresent(to, GlobalVariable.G_functionTimeout, FailureHandling.OPTIONAL)
				if(isWaitVisible) {
					WebUI.waitForElementVisible(to, GlobalVariable.G_functionTimeout, FailureHandling.OPTIONAL)
				}
				WebUI.waitForElementClickable(to, GlobalVariable.G_functionTimeout, FailureHandling.OPTIONAL)
				break
			} else {
				WebUI.comment("Button is still not ready. Wait. ${to.findPropertyValue('xpath')}")
				WebUI.delay(1)
			}
		}
	}


	/**
	 * Get Actual Driver
	 * @return
	 */
	public static WebDriver getActualDriver(){
		return DriverFactory.getWebDriver()
	}

	/*
	 * FIND TEST OBJECT
	 */
	public static TestObject findTestObjectByLabel(String testObjectId, String label) {
		TestObject newTestObject = new TestObject()
		newTestObject = findTestObject(testObjectId, ['label':label])
		return newTestObject
	}

	public static TestObject findTestObjectByLabelAndValue(String testObjectId, String label,String value) {
		TestObject newTestObject = new TestObject()
		newTestObject = findTestObject(testObjectId, ['label':label,'value':value])
		return newTestObject
	}
	public static TestObject findTestObjectByLabelValueandPosition(String testObjectId, String label,String value, String position) {
		TestObject newTestObject = new TestObject()
		newTestObject = findTestObject(testObjectId, ['label':label,'value':value,'position':position])
		return newTestObject
	}

	public static WebElement findWebElement(String xpath){

		WebUI.delay(2)
		WebDriver driver = getActualDriver()
		try{
			return driver.findElement(By.xpath(xpath))
		}catch(WebDriverException e){

			return null
		}
	}

	public static List<WebElement> findWebElements(String xpath){

		WebDriver driver = getActualDriver()
		try{
			return driver.findElements(By.xpath(xpath))
		}catch(WebDriverException e){
			return null
		}
	}

	/*
	 * VERIFY
	 */

	public static boolean verifySelectedItem(TestObject field, String expectedItem) {
		Select select = new Select(WebUiCommonHelper.findWebElement(field, GlobalVariable.G_max_timeout))
		WebElement option = select.getFirstSelectedOption()
		String defaultItem = option.getText()
		WebUI.verifyMatch(defaultItem, expectedItem, false)
	}

	/*
	 * COMMON ACTIONS
	 */
	public static String getText(TestObject to) {
		//    superWait(to)
		WebUI.scrollToElement(to, GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
		return WebUI.getText(to, FailureHandling.STOP_ON_FAILURE)
	}

	public static void click(TestObject to) {
		//    superWait(to)
		WebUI.scrollToElement(to, GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
		WebUI.click(to, FailureHandling.STOP_ON_FAILURE)
		waitUntilPageIsLoaded()
	}

	def selectAvailDayNextMonth(){
		def btnNextMonth = findTestObject('01.GJOBE/Step 2 - Screen/00.CalendarObjects/00.CalendarObjects/btnCalentarNextMonth')
		superWait(btnNextMonth)
		click(btnNextMonth)
	}

	//Wait icon loading after user selected date
	def waitForIconCalendarLoading(){
		def icnCalendarLoading = findTestObject('01.GJOBE/02.Create new Appointment/Step 2 - Screen/00.CalendarObjects/icn_calendarLoading')
		WebUI.waitForElementAttributeValue(icnCalendarLoading, 'style', 'display: none;', GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
		WebUI.waitForPageLoad(GlobalVariable.G_max_timeout, FailureHandling.OPTIONAL)
	}

	/*
	 * ROBOT Keys press
	 */

	/**
	 * This method use Java Robot in order to perform a Key Event
	 * @param keyEvent
	 * @return
	 */
	public static void robotPressKey(int keyEvent){

		Robot robot = new Robot()
		robot.keyPress(keyEvent)
		robot.keyRelease(keyEvent)

	}

	/**
	 * 
	 * @param xpath
	 */
	public static void javaExecutorClick(String xpath){

		WebDriver driver = getActualDriver()

		JavascriptExecutor js = (JavascriptExecutor) driver

		WebElement element = driver.findElement(By.xpath(xpath))

		new Actions(driver).moveToElement(element).perform()

		js.executeScript(Constants.JS_EXECUTOR_CLICK, element)

	}

	public static void javaExecutorClickElement(WebElement element){

		WebDriver driver = getActualDriver()

		JavascriptExecutor js = (JavascriptExecutor) driver

		new Actions(driver).moveToElement(element).perform()

		js.executeScript(Constants.JS_EXECUTOR_CLICK, element)

	}

	public static void waitElementInvisible(int seconds, String xpath){

		WebDriverWait wait = new WebDriverWait(getActualDriver(), seconds)

		try{
			wait.until(ExpectedConditions.invisibilityOf(By.xpath(xpath)))

		}catch(Exception e){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by))
		}
	}

	public static void mouseHouver(WebElement element){

		Actions action = new Actions(getActualDriver());
		action.moveToElement(element).perform();
	}

	public static void rightClick(WebElement element){

		Actions action = new Actions(getActualDriver());
		action.contextClick(element).perform();
	}

	public static void scrollToElement(WebElement element){

		WebDriver driver = getActualDriver()
		JavascriptExecutor js = (JavascriptExecutor) driver

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void waitElementVisible(int seconds, WebElement element){

		WebDriverWait wait = new WebDriverWait(getActualDriver(), seconds)

		try{
			wait.until(ExpectedConditions.visibilityOf(element))

		}catch(Exception e){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by))
		}
	}

	public static void dragAndDrop(WebElement from, WebElement to){

		try{
			Actions action = new Actions(getActualDriver());

			//action.clickAndHold(from).moveToElement(to).release(to).build().perform()

			action.dragAndDrop(from, to).perform()
		}catch(StaleElementReferenceException e){
			//
		}

	}

	public static void doubleClick(WebElement element){

		Actions action = new Actions(getActualDriver())

		action.doubleClick(element).build().perform();
	}

}
