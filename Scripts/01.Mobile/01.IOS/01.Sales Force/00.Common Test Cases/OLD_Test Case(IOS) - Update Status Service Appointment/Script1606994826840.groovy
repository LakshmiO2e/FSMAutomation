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

Mobile.startApplication('/Users/temp/Desktop/SalesForceAppIOS/Chatter.app', false)

Mobile.comment('Choose Menu')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnBottomMenu'), 
    'Menu')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnLeftMenu'), 
    'Service Appointments')

Mobile.comment('Search Appointment')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/01.Service Appointments/srchBarServiceAppointment'), 'SA-5320', 
    30)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/01.Service Appointments/srchResult'), 3)

Mobile.comment('Create new Post - Comments')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 
    'Post')

Mobile.setText(findTestObject('04.Mobile/01.IOS/00.Main Page/01.Service Appointments/00.Service Appointments Info View/02. Post View/inptPostComment'), 
    'This is an Automation comment post.', 2)

Mobile.comment('Change Status')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 
    'Change Status')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Main Page/01.Service Appointments/00.Service Appointments Info View/03. Change Status/btnChangeStatus'), 
    'En Route')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnSave'), 10)

Mobile.comment('Change Status')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 
    'Change Status')

CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Main Page/01.Service Appointments/00.Service Appointments Info View/03. Change Status/btnChangeStatus'), 
    'On Site')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnSave'), 10)

