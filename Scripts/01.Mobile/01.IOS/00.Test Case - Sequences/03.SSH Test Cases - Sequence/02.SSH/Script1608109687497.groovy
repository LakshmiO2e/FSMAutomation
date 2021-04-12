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

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Login'), [('startAppPath') : startAppPath
        , ('slctEnvironment') : slctEnvironment, ('inptUser') : inptUser, ('inptPassword') : inptPassword, ('passCode') : passCode], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/LoginFSL'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Select Appointment'), 
    [('slctAppointmentHour') : slctAppointmentHour], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('##### - SSH016')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuCallAhead], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Call Ahead'), 
    [('slctCallOutcome') : slctCallOutcome, ('inptComments') : inptComments], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('Status On Route')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus1], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('Status On Site')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus2], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('##### - SSH017')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookViewQuote], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Verify Quote Lines and Generate Quote Lines'), 
    [('verifyQuoteLinesProduct1') : verifyQuoteLinesProduct1SSH017], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.comment('# - Verify Quote Status')

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Verify Quote Status'), 
    [('verifyQuoteStatus') : verifyQuoteStatusSSH017], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

not_run: Mobile.comment('##### - SSH018')

not_run: Mobile.comment('##### - SSH019')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookFollowUp], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('# - Open Salesforce app by previous Step')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Book Detailing Touch-Up Appointment'), 
    [('inptComments') : inptCommentsWorkOrder], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Logout'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Login'), 
    [('startAppPath') : '', ('slctEnvironment') : slctEnvironment, ('inptUser') : inptUser2, ('inptPassword') : inptPassword2
        , ('passCode') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Create Book Appointment'), 
    [('slctWorkType') : slctWorkType], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('##### - SSH020')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuCallAhead], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Call Ahead'), 
    [('slctCallOutcome') : slctCallOutcome, ('inptComments') : inptComments], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('##### - Same data as SSH016')

not_run: Mobile.comment('Status On Route')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus1], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('Status On Site')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookViewQuote], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Docs 2 and Send Email'), 
    [('docName1') : docName1, ('docName2') : docName2], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'To FSL Mobile')

not_run: Mobile.comment('##### - SSH021')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuMakePayment], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuServiceReport], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Make Payment'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Create Service Report'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.comment('##### - SSH022')

not_run: Mobile.comment('##### - Same data as SSH016')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Select Appointment'), 
    [('slctAppointmentHour') : slctAppointmentHour], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuCallAhead], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Call Ahead'), 
    [('slctCallOutcome') : slctCallOutcome, ('inptComments') : inptComments], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('Status On Route')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus1], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('Status On Site')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus2], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('##### - SSH023')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookViewQuote], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Verify Quote Lines and Generate Quote Lines'), 
    [('verifyQuoteLinesProduct1') : verifyQuoteLinesProduct1], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

Mobile.comment('##### - SSH024')

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctStatus3], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookFollowUp], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - View Candidates Crew availability'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Create Book Appointment'), 
    [('slctWorkType') : slctWorkType2], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnBack'), 10)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

Mobile.comment('##### - SSH025')

Mobile.comment('# En Route')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctChangeStatusEnRouteSSH025], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('# On Site')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctStatus') : slctChangeStatusOnSiteSSH025], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('# View Quote - Open Salesforce App')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookViewQuote], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('# Generate Line Items')

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Line Items'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('# Open Field Service app')

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Make Payment'), 
    [('slctPaymentType') : slctPaymentTypeSSH025], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Create Service Report'), 
    [('inptSignatureName') : inptSignatureName], FailureHandling.CONTINUE_ON_FAILURE)

