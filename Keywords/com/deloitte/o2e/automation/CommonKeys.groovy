package com.deloitte.o2e.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.deloitte.core.BasePage
import com.deloitte.utils.StringUtils
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
import java.awt.event.KeyEvent
import com.kms.katalon.core.exception.StepFailedException

import internal.GlobalVariable

public class CommonKeys extends BasePage {

	public void addressAutocomplete(TestObject object, String fullAddress){

		String xpath = object.getProperties().get(0).getValue()

		WebElement element = findWebElement(xpath)
		StringUtils.logger(xpath)
		StringUtils.logger(fullAddress)

		try{
			WebUI.setText(object, fullAddress)
			WebUI.delay(2)
			WebElement elementToSelect = findWebElement("//div[@class='slds-p-horizontal_x-small slds-p-vertical_xx-small' and text()='" +fullAddress+ "']")
			elementToSelect.click()
		}catch(Exception e){
			try{
				WebUI.setText(object, fullAddress)
				WebUI.delay(2)
				WebElement elementToSelect = findWebElement("//div[@class='pac-item needsclick']")
				elementToSelect.click()
			}catch(NullPointerException ee){
				//Shack shine Version
				WebUI.setText(object, fullAddress)
				WebUI.delay(2)
				WebElement elementToSelect = findWebElement("//div[@class='pac-item']/span[@class='pac-item-query']")
				elementToSelect.click()

			}
		}

		WebUI.delay(2)

		/*
		 robotPressKey(KeyEvent.VK_TAB)
		 robotPressKey(KeyEvent.VK_TAB)
		 robotPressKey(KeyEvent.VK_ENTER)*/
	}


	public boolean verifyElementLabel(TestObject object,String objectParent, String valueToMatch){

		String xpath = object.getProperties().get(0).getValue()

		if(!objectParent.isEmpty()){
			xpath = xpath.replace('${label}',objectParent)
		}else{
			xpath = xpath.replace('${label}',valueToMatch)
		}

		StringUtils.logger("Object ID- ", xpath)

		WebElement element = findWebElement(xpath)

		if(element == null){
			throw new StepFailedException("Impossible to verify Element value")
		}

		StringUtils.logger("Value to found - ", valueToMatch)
		StringUtils.logger("Value found - ", element.getText())

		return (element.getText().contains(valueToMatch))
	}

	public void clickElement(TestObject object){

		String xpath = object.getProperties().get(0).getValue()

		javaExecutorClick(xpath)
	}


	public void selectValue(TestObject object, String value){

		TestObject foundObject = findTestObjectByLabel(object.getObjectId(), value)

		/*
		 String xpath = foundObject.getProperties().get(0).getValue()
		 WebUI.switchToFrame(findTestObject("Object Repository/01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/iFrameBookAppointment"),30)
		 xpath = xpath.replace('${label}',value)
		 javaExecutorClick(xpath)
		 */

		javaExecutorClick(foundObject.getProperties().get(0).getValue())

		//WebUI.click(foundObject)
	}
}
