package com.deloitte.utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate
import java.time.format.DateTimeFormatter

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

public class DateTimeUtils {

	public static String getCurrentMonthString() {
		LocalDate localDate = LocalDate.now()
		return DateTimeFormatter.ofPattern("MMMM").format(localDate)
	}

	public static String getCurrentDateDay() {
		LocalDate localDate = LocalDate.now()
		return DateTimeFormatter.ofPattern("dd").format(localDate)
	}


	public static String getCurrentMMDDYYYY() {
		LocalDate localDate = LocalDate.now()
		return DateTimeFormatter.ofPattern("MM/dd/yyyy").format(localDate)
	}

	//get 30-Nov-2020 format date
	public static String getTomorrowFormatDate() {
		Calendar calendar = Calendar.getInstance();

		// get a date to represent "today"
		Date today = calendar.getTime();

		// add one day to the date/calendar
		calendar.add(Calendar.DAY_OF_YEAR, 1);

		// now get "tomorrow" 's short month format
		Date tomorrow = calendar.getTime();
		String dateStr = tomorrow.toString();
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		DateFormat formatterDone = new SimpleDateFormat("dd-MMM-yyyy");
		String tomorrowStr = "";
		try {
			tomorrowStr = formatterDone.format(formatter.parse(dateStr));
		} catch (ParseException e) {
			println(e);
		}
		println(tomorrowStr);
		return tomorrowStr;
	}

	public static String getCurrentDDMMYYYYByTimezone(String timezone) {
		final String DATE_FORMAT = "dd/MM/yyyy"
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT)
		formatter.setTimeZone(TimeZone.getTimeZone(timezone))
		Calendar currentTime = Calendar.getInstance()
		String timeStr = formatter.format(currentTime.getTime())
		return timeStr
	}

	public static String getCurrentYYYYMMDDByTimezone(String timezone) {
		final String DATE_FORMAT = "yyyy/MM/dd"
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT)
		formatter.setTimeZone(TimeZone.getTimeZone(timezone))
		Calendar currentTime = Calendar.getInstance()
		String timeStr = formatter.format(currentTime.getTime())
		return timeStr
	}

	public static String getCurrentMMMddyyyyByTimezone(String timezone) {
		final String DATE_FORMAT = "MMM/dd/yyyy"
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT)
		formatter.setTimeZone(TimeZone.getTimeZone(timezone))
		Calendar currentTime = Calendar.getInstance()
		String timeStr = formatter.format(currentTime.getTime())
		return timeStr
	}

	public static String getCurrentMonthNumber() {
		LocalDate localDate = LocalDate.now()
		return DateTimeFormatter.ofPattern("MM").format(localDate)
	}

	public static String getCurrentDayOfMonth() {
		LocalDate localDate = LocalDate.now()
		return DateTimeFormatter.ofPattern("EEEE").format(localDate)
	}

	public static String getTomorrowDatePattern(String pattern) {
		LocalDate today = LocalDate.now()
		LocalDate tomorrow = today.plusDays(1);
		return DateTimeFormatter.ofPattern(pattern).format(tomorrow)
	}

	public static String getYesterdayDatePattern(String pattern) {
		LocalDate today = LocalDate.now()
		LocalDate yesterday = today.minusDays(1);
		return DateTimeFormatter.ofPattern(pattern).format(yesterday)
	}

	public static String getCurentDatePattern(String pattern) {
		LocalDate today = LocalDate.now()
		return DateTimeFormatter.ofPattern(pattern).format(today)
	}

	public static String convertDateByPattern(String pattern, String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		def d_date = dateFormat.parse(date);
		def strDate = dateFormat.format(d_date);
		return strDate
	}

	public static String getDatePattern(String pattern, int days = 0, int months = 0) {
		LocalDate today = LocalDate.now();
		LocalDate changeMonth = today.plusMonths(months);
		LocalDate changeDay = changeMonth.plusDays(days);
		return DateTimeFormatter.ofPattern(pattern).format(changeDay);
	}

	public static String convertMonthFromStringToInt(String month) {
		def intMonth
		switch(month.toLowerCase()) {
			case "january":
			case "jan":
				intMonth = "1";
				break;

			case "february":
			case "feb":
				intMonth = "2";
				break;

			case "march":
			case "mar":
				intMonth = "3";
				break;

			case "april":
			case "apr":
				intMonth = "4";
				break;

			case "may":
				intMonth = "5";
				break;

			case "june":
			case "jun":
				intMonth = "6";
				break;

			case "july":
			case "jul":
				intMonth = "7";
				break;

			case "august":
			case "aug":
				intMonth = "8";
				break;

			case "september":
			case "sep":
			case "sept":
				intMonth = "9";
				break;

			case "october":
			case "oct":
				intMonth = "10";
				break;

			case "november":
			case "nov":
				intMonth = "11";
				break;

			case "december":
			case "dec":
				intMonth = "12";
				break;
		}
		return intMonth
	}

	public static String convert24hTo12h(String time24h) {
		SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
		SimpleDateFormat _12HourSDF = new SimpleDateFormat("h:mm a");
		Date _24HourDt = _24HourSDF.parse(time24h);
		def time12h = _12HourSDF.format(_24HourDt)
		System.out.println(_24HourDt);
		System.out.println(_12HourSDF.format(_24HourDt));
		return time12h
	}

	public static convertamToAM(String timeInfo) {
		if (timeInfo.contains('am')){
			timeInfo = timeInfo.replaceAll('am', 'AM')
		}
		if (timeInfo.contains('pm')){
			timeInfo = timeInfo.replaceAll('pm', 'PM')
		}
		return timeInfo
	}

	public static String convertMMMMtoMM(String month) {
		def monthMM
		switch(month.toLowerCase()) {
			case "january":
				monthMM = "Jan";
				break;

			case "february":
				monthMM = "Feb";
				break;

			case "march":
				monthMM = "Mar";
				break;

			case "april":
				monthMM = "Apr";
				break;

			case "may":
				monthMM = "May";
				break;

			case "june":
				monthMM = "Jun";
				break;

			case "july":
				monthMM = "Jul";
				break;

			case "august":
				monthMM = "Aug";
				break;

			case "september":
				monthMM = "Sep";
				break;

			case "october":
				monthMM = "Oct";
				break;

			case "november":
				monthMM = "Nov";
				break;

			case "december":
				monthMM = "Dec";
				break;
		}
		return monthMM
	}

	public static String convertMonthFromStringToInt2Numbers(String month) {
		def intMonth
		switch(month.toLowerCase()) {
			case "january":
			case "jan":
				intMonth = "01";
				break;

			case "february":
			case "feb":
				intMonth = "02";
				break;

			case "march":
			case "mar":
				intMonth = "03";
				break;

			case "april":
			case "apr":
				intMonth = "04";
				break;

			case "may":
				intMonth = "05";
				break;

			case "june":
			case "jun":
				intMonth = "06";
				break;

			case "july":
			case "jul":
				intMonth = "07";
				break;

			case "august":
			case "aug":
				intMonth = "08";
				break;

			case "september":
			case "sep":
			case "sept":
				intMonth = "09";
				break;

			case "october":
			case "oct":
				intMonth = "10";
				break;

			case "november":
			case "nov":
				intMonth = "11";
				break;

			case "december":
			case "dec":
				intMonth = "12";
				break;
		}
		return intMonth
	}

	public static String getPlusDatePattern(String pattern, int plusDay) {
		LocalDate today = LocalDate.now()
		LocalDate plusday = today.plusDays(plusDay);
		WebUI.comment(plusday.toString())
		def afterFormat = DateTimeFormatter.ofPattern(pattern).format(plusday)
		WebUI.comment(afterFormat.toString())
		return afterFormat.toString()
	}
}
