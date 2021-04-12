package com.deloitte.o2e.automation


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.interactive.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.action.PDAction;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.deloitte.emailvalidation.ValidateEmail
import com.deloitte.utils.StringUtils
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.exception.StepFailedException

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class EmailKeys {


	/*
	 public static void Test(){
	 ValidateEmail email = new ValidateEmail();
	 String username = "delqaapoc@gmail.com";// change accordingly
	 String password = "fsmQAfun1";// change accordingly
	 String GmailHost = "imap.gmail.com";
	 String emailKeyWords = "12345";
	 String  urlStr = email.fetchConfirmEmailGetBodyContent(GmailHost,username,password,emailKeyWords);
	 System.out.println(urlStr)
	 }
	 */


	public static boolean ValidateEmailPDF(String username, String password,String gmailHost, emailKeyWords){

		try{

			ValidateEmail email = new ValidateEmail();

			StringUtils.logger("Start fetch email ");
			String urlStr = email.fetchEmailPDFAttachment(gmailHost,username,password,emailKeyWords);
			StringUtils.logger("Get URL is: ",urlStr);
			StringUtils.logger("Start opening the URL ",urlStr);

			WebUI.navigateToUrl(urlStr)

			StringUtils.logger("Wait for some seconds...");
			Mobile.delay(10)

			return WebUI.verifyTextPresent("Thank You!", false)
		}catch(Exception e){
			throw new StepFailedException("Impossible to verify PDF URL " + e.message)
		}


		return true
	}


	/**
	 * This method will search for values into email content
	 * if one of the values to validade do not match with email info
	 * then the method will return false because it will only pass
	 * if we have all the values into the email content
	 * @param username
	 * @param password
	 * @param gmailHost
	 * @param emailKeyWords
	 * @param valuesToValidate
	 * @return
	 */
	public static boolean validateEmailContent(String username, String password,String gmailHost, String emailKeyWords,List<String> valuesToValidate){

		ValidateEmail email = new ValidateEmail();

		//		String username = "delqaapoc@gmail.com";// change accordingly
		//		String password = "fsmQAfun1";// change accordingly
		//		String GmailHost = "imap.gmail.com";
		//		String emailKeyWords = "12345"; //Extension of receiver

		StringUtils.logger("Start fetch email ");
		String contentStr = email.fetchConfirmEmailGetBodyContent(gmailHost,username,password,emailKeyWords);

		boolean emailContent = true

		if(valuesToValidate.size()>0){

			for(String value : valuesToValidate){
				StringUtils.logger("Value to found in email: " + value);
				if(!contentStr.contains(value)){
					throw new StepFailedException("Impossible to verify email Content ")
				}else{
					StringUtils.logger("Value found in email: " + value);
				}
			}
		}

		return emailContent
	}
}



