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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//WebUI.callTestCase(findTestCase('00.Web/00.Common Test Cases/Test Case - Login'), [('url') : 'https://delqaapoc-o2e.cs97.force.com/1800GOTJUNK'
//      , ('inptUser') : 'gjcan.fp@1800gotjunk.delqaapoc', ('inptPassword') : 'fsmQAfun2'], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(3)

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnRelatedLists'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('01.GJOBE/01.Flows/03.Add Products to Estimate/titleEstimates'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/lnkServiceAppointment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnChangeStatus'), 0)

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnChangeStatus'))

WebUI.waitForElementVisible(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnDispatchedStatus'), 0)

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnDispatchedStatus'))

WebUI.waitForElementVisible(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnSaveServiceAppointment'), 
    0)

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnSaveServiceAppointment'))

WebUI.delay(5)

/*WebUI.scrollToElement(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/LnkAssignedResources'), 0)

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnActionShowMoreAssignedResources'))

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnEditAssigned Resource'))

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnDeleteServiceResource'))

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/txtServiceResourceEnter'))

WebUI.sendKeys(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/txtServiceResourceEnter'), 'GJ CAN Truck Team Member #3')

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/searchResultServiceResource'))

WebUI.click(findTestObject('01.GJOBE/01.Flows/03.Service Appointment Details/btnSaveServiceResource'))
*/
