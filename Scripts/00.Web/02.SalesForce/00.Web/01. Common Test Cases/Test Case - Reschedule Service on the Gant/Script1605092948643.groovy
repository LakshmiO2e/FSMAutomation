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

WebUI.callTestCase(findTestCase('00.Web/00.Common Test Cases/Test Case - Login'), [('url') : 'https://delqaapoc-o2e.cs97.force.com/1800GOTJUNK'
        , ('inptUser') : 'gjcan.fp@1800gotjunk.delqaapoc', ('inptPassword') : 'fsmQAfun2'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('01.GJOBE/00.CommonObjects/imgUser'), 20)

WebUI.comment('Select Menu - Field Service')

WebUI.waitForElementClickable(findTestObject('01.GJOBE/00.CommonObjects/btnMenuFieldService'), 30)

CustomKeywords.'Common.Click'(findTestObject('01.GJOBE/00.CommonObjects/btnMenuFieldService'))

WebUI.waitForElementVisible(findTestObject('01.GJOBE/00.CommonObjects/imgFiledServiceLoading'), 30)

WebUI.waitForElementNotPresent(findTestObject('01.GJOBE/00.CommonObjects/imgFiledServiceLoading'), 30)

CustomKeywords.'GJOBE.SelectGantTimeline'(inptGanttDays)

CustomKeywords.'GJOBE.DragGanttAppointmentToToday'(findTestObject('01.GJOBE/01.Flows/02.Reschedule Service Gant/ganttAppointment'), 
    teamName, serviceName, statusValue)

WebUI.delay(90)

WebUI.click(findTestObject('01.GJOBE/01.Flows/02.Reschedule Service Gant/btnsDragServiceAppointment-src'))

WebUI.dragAndDropToObject(findTestObject('01.GJOBE/01.Flows/02.Reschedule Service Gant/btnsDragServiceAppointment-src'), 
    findTestObject('01.GJOBE/01.Flows/02.Reschedule Service Gant/btnDropServiceAppointmentToday-target'))

