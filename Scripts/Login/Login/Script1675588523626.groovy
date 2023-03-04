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

WebUI.openBrowser(GlobalVariable.URL, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/Page_Peer-Insights  Gartner Peer Insights/div_Join  Log in_ MAINPAGE BTN'),FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Homepage  Gartner Peer Insights/div_Join  Sign In'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/a_Log in'), 10)

WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/a_Log in'),
	FailureHandling.STOP_ON_FAILURE)

// Click on Login button
WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/a_Log in with password instead'),
	 FailureHandling.STOP_ON_FAILURE)

// Click on Input Email field area so we can enter email
WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/input_Email_email'),
	FailureHandling.STOP_ON_FAILURE)

// Enter Email 
WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/input_Email_email'),
	 GlobalVariable.Email, FailureHandling.STOP_ON_FAILURE)

// Click on Input Password field area so we can enter email
WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/input_Password_password'),
	FailureHandling.STOP_ON_FAILURE)

// Enter Password
WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/input_Password_password'),
	 GlobalVariable.Password, FailureHandling.STOP_ON_FAILURE)

// Wait for the get Passcode button to be enable so we can click on it
//WebUI.waitForElementClickable(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/button_Get passcode'), 20)

// Click on get passcode btn
//WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/button_Get passcode'),
//	FailureHandling.STOP_ON_FAILURE)

// After you entered the passcode click on login btn
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/button_Log in'),
	 20, FailureHandling.STOP_ON_FAILURE)

// After you entered the passcode click on login btn
WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/button_Log in'),
	FailureHandling.STOP_ON_FAILURE)

