import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('GJ.SC/01.Create Lead/btnCreateLead'))

WebUI.selectOptionByLabel(findTestObject('03.SalesForce/00.Common Objects/slctDropdown'), slctAccountType, false)

WebUI.click(findTestObject('00.Common Objects/btnNext'))

WebUI.setText(findTestObject('GJ.SC/01.Create Lead/txtboxZipcodeResidentialLead'), zipCode)

WebUI.clearText(findTestObject('GJ.SC/01.Create Lead/txtboxFirstname-Residential'))

WebUI.setText(findTestObject('GJ.SC/01.Create Lead/txtboxFirstname-Residential'), firstName)

WebUI.click(findTestObject('00.Common Objects/btnNext'))

WebUI.click(findTestObject('GJ.SC/01.Create Lead/btnMinimizeCreateLead'))

WebUI.click(findTestObject('GJ.SC/01.Create Lead/btnEditAddressOnLead'))

CustomKeywords.'Common.AddressAutoComplete'(findTestObject('GJ.SC/01.Create Lead/inputAddress-LeadSC'), inptFullAddress)

WebUI.click(findTestObject('GJ.SC/01.Create Lead/btnSave'))

WebUI.waitForElementVisible(findTestObject('GJ.SC/02.convertLead/btnConvertLead'), 10)

WebUI.click(findTestObject('GJ.SC/02.convertLead/btnConvertLead'))

WebUI.waitForElementPresent(findTestObject('GJ.SC/01.Create Lead/statusNew'), 0)

WebUI.scrollToElement(findTestObject('GJ.SC/03.ApplyPromoCode/programcodeheader'), 0)

WebUI.click(findTestObject('GJ.SC/03.ApplyPromoCode/inputEnterPromoCode'), FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'Common.AddressAutoComplete'(findTestObject('GJ.SC/03.ApplyPromoCode/inputEnterPromoCode'), inptPromoCode)

WebUI.scrollToElement(findTestObject('GJ.SC/04.BookAppointment/btnbookappointment'), 0)

WebUI.click(findTestObject('GJ.SC/04.BookAppointment/btnbookappointment'))

WebUI.selectOptionByLabel(findTestObject('GJ.SC/04.BookAppointment/slctWorkType'), slctWorkType, false)

WebUI.click(findTestObject('GJ.SC/04.BookAppointment/btnGetAppointments'))

WebUI.waitForElementPresent(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/btnIdealTime'), 
    10)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/slctTimeFirstSpot'))

//CustomKeywords.'Common.SelectValue'(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/slctTime'), 
//  '9:30PM')
WebUI.waitForElementPresent(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/01.Step - Book Appointment - Choose Time/txtAppointmentBooked'), 
    20)

WebUI.click(findTestObject('01.GJOBE/01.Flows/01. New Opportunity/02.Step - Book Appointment/02.Step - View Service Appointment/btnCloseBookAppointmentWindow'))

WebUI.click(findTestObject('GJ.SC/04.BookAppointment/btnConfirmBookingSC'))

