package com.deloitte.utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.text.DecimalFormat

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

public class StringUtils {


	/**
	 *
	 * @param values
	 * @return
	 */
	public static String concatenateValues(String... values){

		StringBuilder sb = new StringBuilder()

		for (String value : values){
			sb.append(value)
		}

		return sb.toString()
	}

	/**
	 * 
	 * @param text
	 * @return
	 */
	public static Integer extractNumberFromString(String text) {
		def textValue = text.replaceAll("[^0-9]", "")
		def number
		if(textValue == ''){
			number = 0
		}else {
			number = Integer.parseInt(text.replaceAll("[^0-9]", ""))
		}
		return number
	}

	/**
	 * 
	 * @param values
	 * @return
	 */
	public static String logger(String... values){

		String message = concatenateValues(values)

		WebUI.comment(message)
	}

	/**
	 *
	 * @param values
	 * @return
	 */
	public static String loggerMobile(String... values){

		String message = concatenateValues(values)

		Mobile.comment(message)
	}

	private static Double parsePercentToDouble(String percent) {
		return Double.parseDouble(percent.trim().replaceAll("%", ""))
	}

	private static def parseCurrencyToNumber(String currency) {
		def to = currency.replaceAll("[^.0-9]", "")
		Float floatTo =Float.parseFloat(to);
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		to = df.format(floatTo);
		return to
	}

	public static Double convertToPercent(String percent) {
		return parsePercentToDouble(percent)/100
	}

	public static String generateEmail(String firstName = "FirstName", String lastName = "LastName") {
		return "${firstName}.${lastName}@test.com"
	}

	static String randomFirstName() {
		return "KMS"
	}

	static String randomLastName(String testID = "GJ0000") {
		def random = Math.abs(new Random().nextInt() % 10000 + 1) //random range 1-10000
		WebUI.comment("${testID}_${random}")
		return "${testID}_${random}"
	}

	static def getOpportunityNameStd(String firstName, String lastName) {
		WebUI.comment("${firstName} ${lastName}")
		return "${firstName} ${lastName}"
	}

	static def getBusinessInfoStd(String firstName, String lastName) {
		WebUI.comment("${firstName} ${lastName}")
		return "${firstName} ${lastName}"
	}

	static String randomValue(String value = 'abc') {
		def random = Math.abs(new Random().nextInt() % 100000000 + 1) //random range 1-10000
		WebUI.comment("${value}_${random}")
		return "${value}_${random}"
	}

	public def convertStringToDecimal(String value){
		return Integer.parseInt(value.replaceAll("[^.0-9]", ""))
	}

	/**
	 * Convert String to Map type
	 * @param value: "2nd Floor Install - Christmas Lights: 50, 1st Floor/Ground Install - Christmas Lights: 50"
	 * @return : value has Map type
	 */
	static def parseStringToMap(String value) {
		//    value = value.substring(1, value.length()-1)
		String[] keyValuePairs = value.split(",");
		Map<String,String> map = new HashMap<>();

		for(String pair : keyValuePairs)
		{
			String[] entry = pair.split(":");
			map.put(entry[0].trim(), entry[1].trim());
		}
		return map
	}

}
