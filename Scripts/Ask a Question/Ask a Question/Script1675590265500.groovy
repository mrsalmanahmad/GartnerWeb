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

// Call login testcase login and the perform ask Question
WebUI.callTestCase(findTestCase('Test Cases/Login/Login'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_My Account  Gartner Peer Insights/GETSTARTED'), 
	FailureHandling.OPTIONAL)

// Click on ask a question btn
WebUI.click(findTestObject('Object Repository/Page_Homepage  Gartner Peer Insights/div_Ask a Question'),
	 FailureHandling.STOP_ON_FAILURE)

// Verify Ask Question heading present
WebUI.verifyElementPresent(findTestObject('Object Repository/Ask Community Section/div_Ask a question'), 10)

// Verify Investment heading present
WebUI.verifyElementPresent(findTestObject('Object Repository/Ask Community Section/div_Investment  100 points (Balance 300 points)'), 10)

// Select Post Department
WebUI.click(findTestObject('Object Repository/Ask Community Section/Select Post Departments'), FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()
WebUI.click(findTestObject('Object Repository/Ask Community Section/Everyone'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Ask Community Section/div_Continue'), FailureHandling.STOP_ON_FAILURE)

// Click on type area and type anything
WebUI.click(findTestObject('Object Repository/Page_Homepage  Gartner Peer Insights/div_Start typing_pulse-editor'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Page_Homepage  Gartner Peer Insights/div_Start typing_pulse-editor'),
	 "@Roshni P", FailureHandling.STOP_ON_FAILURE)

// Select Tagged person
WebUI.callTestCase(findTestCase('Test Cases/Core/Click by Xpath'), 
	[('xpath'):'//*[@id="react-app"]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div'], 
	FailureHandling.STOP_ON_FAILURE)

// Select Tags
WebUI.click(findTestObject('Object Repository/Ask Community Section/Open Tags Dropdwon'), 
	FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/Core/Click by Xpath'),
	[('xpath'):'//*[@id="react-app"]/div/div/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[3]/div/div[1]/div/div[1]/div/div[1]/div[1]'],
	FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Ask Community Section/div_Update Tags btn'),
	FailureHandling.STOP_ON_FAILURE)


