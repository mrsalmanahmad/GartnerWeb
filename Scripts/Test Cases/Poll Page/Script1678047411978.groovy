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

def verifyModel() {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/Connect with a trusted community'), 10)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/li_Ask questions and add polls anonymously'), 10)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/li_Customize your feed to see relevant peer discussions'), 10)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/li_Read verified reviews and share your product knowledge'), 10)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/li_Search our extensive library of insights'), 10)
	//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/Share_btn'), 10,FailureHandling.OPTIONAL)
	//WebUI.click(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/div_DISCUSSION'))
	WebUI.refresh()
}
// Open Poll Page
WebUI.openBrowser(GlobalVariable.PollPageUrl)
WebUI.maximizeWindow()

// Click on share button and then verify model
WebUI.click(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/Share_btn'),
	 FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent("Share a link to this insight via:", false)
WebUI.refresh()
// Verify Model Present on the screen
//verifyModel()

// Click on Comment button and then verify model
WebUI.click(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/Link_btn'),
	FailureHandling.STOP_ON_FAILURE)

// Verify Model Present on the screen
verifyModel()

// Click on Save button and then verify model
WebUI.click(findTestObject('Object Repository/Page_What can be done to help close the wealth gap between millennials and older generations  Post  Gartner Peer Community/span_Save_btn'),
	FailureHandling.STOP_ON_FAILURE)

// Verify Model Present on the screen
verifyModel()

