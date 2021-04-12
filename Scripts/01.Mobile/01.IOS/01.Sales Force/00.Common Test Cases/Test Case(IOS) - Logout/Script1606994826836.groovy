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

Mobile.comment('Tap on top icon -  User Profile')

CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnBottomMenu'), 'Menu')

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnProfileMenu'), 10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/00.Top - User Profile/btnUserProfileMenus'), 10)

Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Main Page/00.Top - User Profile/btnLogOut'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

