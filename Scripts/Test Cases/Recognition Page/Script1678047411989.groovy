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

// Open Poll Page
WebUI.openBrowser(GlobalVariable.RecognitionPageUrl)
WebUI.maximizeWindow()

// Verify Heading Present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_Andrew Kagan'), 10, FailureHandling.STOP_ON_FAILURE)

// Verify Heading Present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_Chris Oehlerking'), 10, FailureHandling.STOP_ON_FAILURE)

// Verify Heading Present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_Get the recognition you deserve'), 10, FailureHandling.STOP_ON_FAILURE)

// Verify Top 3
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_Kamal Sharma'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/Heading 2'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/Heading 3'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_Previously Recognized Executives'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_The Worlds Top Technology Executives'), 10, FailureHandling.STOP_ON_FAILURE)

// Click on Create Account btn and verify the page opened
WebUI.click(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/div_Create account_btn'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Recognition  Gartner Peer Community/h1_Free to join. Free to use'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()