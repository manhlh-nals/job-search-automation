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

WebUI.callTestCase(findTestCase('Login'), [('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_/input'), '北海道')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_/div_OK2431OK'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/a_'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/a_'), '北海道')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/span_'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/span_'), '北海道')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input__sub-side-location-text'), 0)

subSideText = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__sub-side-location-text'), 'value')

WebUI.verifyMatch(subSideText, '北海道', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input'), 0)

//textbox = WebUI.getAttribute(findTestObject('Object Repository/Page_/input'), 'value')
//
//WebUI.verifyMatch(textbox, '北海道', false)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://msi.dev.nals.vn/search/prefecture%E5%8C%97%E6%B5%B7%E9%81%93', false)

WebUI.closeBrowser()

