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

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Login'), 
    [('startAppPath') : startAppPath, ('slctEnvironment') : slctEnvironment, ('inptUser') : inptUser, ('inptPassword') : inptPassword
        , ('passCode') : passCode], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Test Cases - Helpers/Test Case(IOS) - Select Menu'), 
    [('menu') : menu, ('leftMenu') : leftMenu], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS)- Create New Customer'), 
    [('slctAccountType') : slctAccountType, ('inptAccountName') : inptAccountName, ('inptFirstName') : inptFirstName, ('inptLastName') : inptLastName
        , ('slctPreferredLanguage') : slctPreferredLanguage, ('inptPhone') : inptPhone, ('inptEmail') : inptEmail, ('inptFullAddress') : inptFullAddress
        , ('validationFullName') : validationFullName], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Create Opportunity'), 
    [('slctType') : slctType, ('slctCloseDate') : slctCloseDate, ('slctLocationType') : slctLocationType, ('slctArea') : slctArea], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Create Book Appointment with Change Status'), 
    [('slctWorkType') : slctWorkType, ('verifyAddress') : verifyAddress, ('slctChangeStatus') : status], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS-6) - Build residencial space and add space details'), 
    [('slctSpaceType') : '', ('slctName') : '', ('inptCustomName') : '', ('inptSides') : '', ('inptHeight') : '', ('slctSetupCleanRate') : ''
        , ('slctSuppliesRate') : '', ('slctDefaultPaint') : '', ('inptNotes') : '', ('typeOfMultiSelection') : '', ('includeMultipleSpaces') : ''
        , ('includeSpace1_sides') : '', ('includeSpace1_type') : '', ('includeSpace1_paintApplication') : '', ('includeSpace1_paintCost') : ''
        , ('includeSpace2_sides') : '', ('includeSpace2_type') : '', ('includeSpace2_paintApplication') : '', ('includeSpace2_paintCost') : ''
        , ('includeSpace3_sides') : '', ('includeSpace3_type') : '', ('includeSpace3_paintApplication') : '', ('includeSpace3_paintCost\n') : ''
        , ('includeSpace4_sides') : '', ('includeSpace4_height') : '', ('includeSpace4_type') : '', ('includeSpace4_paintCost') : ''
        , ('slctPaintDetails\n') : ''], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Docs 2 and Send Email'), 
    [('docName1') : '', ('docName2') : ''], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Login'), 
    [('startAppPath') : startAppPath, ('slctEnvironment') : slctEnvironment, ('inptUser') : inptUser, ('inptPassword') : inptPassword
        , ('passCode') : passCode], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('##### - W1D007')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuSetJobProgress], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Docs 2 and Send Email'), 
    [('docName1') : docName1ForW1D007, ('docName2') : docName2ForW1D007], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('# Change Status in FSL app')

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusCompleted], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('##### - W1D009')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Line Items'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - View Franchise Capacity'), 
    [('inptHourDays') : inptHourDaysW1D009, ('inptNumberDays') : inptNumberDaysW1D009, ('slctStartDate') : slctStartDateW1D009
        , ('verifyAppointmentMessage') : verifyAppointmentMessageW1D009], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

Mobile.comment('##### - W1D014')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuSetJobProgress], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Docs 2 and Send Email'), 
    [('docName1') : docName1ForW1D014, ('docName2') : docName2ForW1D014], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('# Change Status in FSL app')

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusCompleted], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('##### - W1D016')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Line Items'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - View Franchise Capacity'), 
    [('inptHourDays') : inptHourDaysW1D016, ('inptNumberDays') : inptNumberDaysW1D016, ('slctStartDate') : slctStartDateW1D016
        , ('verifyAppointmentMessage') : verifyAppointmentMessageW1D016], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

Mobile.comment('##### - W1D022')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuSetJobProgress], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Docs 2 and Send Email'), 
    [('docName1') : docName1ForW1D022, ('docName2') : docName2ForW1D022], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('# Change Status in FSL app')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusCompleted], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('# Return to SF app to Generate Copy Doc')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuViewQuote], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate SDoc for Work Side Copy'), 
    [('docNameCopy') : docNameCopyForW1D022, ('verifyDocNameCopy') : verifyDocNameCopy], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

Mobile.comment('##### - W1D023')

Mobile.comment('# Set Job - In Progress')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuSetJobProgress], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Set Job Progress'), 
    [('slctStatus') : slctFirstJobProgress, ('verifyIfStatusChange') : verifyJobStatusMessage], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('##### - W1D023')

Mobile.comment('# Set Job - Completed')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuSetJobProgress], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Set Job Progress'), 
    [('slctStatus') : slctSecondJobProgress, ('verifyIfStatusChange') : verifyJobStatusMessage], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('# Change Status')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusCompleted], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('##### - W1D024')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookFollowUp], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.comment('# - Open Salesforce app by previous Step')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Book Detailing Touch-Up Appointment'), 
    [('inptComments') : inptCommentsWorkOrder], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'IOS.SelectMenu'(findTestObject('04.Mobile/01.IOS/00.Common Objects/00.Menu Objects/btnTopMenu'), 
    'More')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Create Book Appointment'), 
    [('slctWorkType') : ''], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnBack'), 10)

not_run: Mobile.tap(findTestObject('04.Mobile/01.IOS/00.Common Objects/03. Button Objects/btnGoToFSLMobile'), 10)

Mobile.comment('##### - W1D025')

not_run: Mobile.comment('# Status Call Ahead')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusCallAhead], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.comment('# Status En Route')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusEnRoute], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.comment('# Status On Site')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuChangeStatus], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Change Status'), 
    [('slctChangeStatus') : slctStatusOnSite], FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.comment('# Generate docs and send email')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuBookViewQuote], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/01.Sales Force/00.Common Test Cases/Test Case(IOS) - Generate Docs 2 and Send Email'), 
    [('docName1') : docName1, ('docName2') : docName2], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'IOS.SelectOption'(findTestObject('04.Mobile/01.IOS/00.Common Objects/lblGeneric'), 'To FSL Mobile')

Mobile.comment('##### - W1D026')

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsMenuMakePayment], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Make Payment'), 
    [('slctPaymentType') : slctPaymentTypeW1D026], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Test Cases - Helpers/Test Case(IOS) - Action Menu'), 
    [('slctActionsMenu') : slctActionsCreateServiceReport], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01.Mobile/01.IOS/02.Field Service/00.Common Test Cases/Test Case(IOS) - Create Service Report'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

