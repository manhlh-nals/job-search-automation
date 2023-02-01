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

WebUI.setText(findTestObject('Object Repository/Page_/input'), '新黒部駅')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_/div_OK2431OK'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/a__1_2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/a__1_2'), '黒部市')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/a__1_2_3'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/a__1_2_3'), '新黒部駅')

WebUI.rightClick(findTestObject('Object Repository/Page_/div_OK2431OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input__sub-side-location-text'), 0)

subSideText = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__sub-side-location-text'), 'value')

WebUI.verifyMatch(subSideText, '黒部市 新黒部駅', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/span__1_2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/span__1_2'), '黒部市 新黒部駅')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input'), 0)

//textbox = WebUI.getAttribute(findTestObject('Object Repository/Page_/input'), 'value')
//
//WebUI.verifyMatch(textbox, '黒部市 新黒部駅', false)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://msi.dev.nals.vn/search/city%E9%BB%92%E9%83%A8%E5%B8%82/station%E6%96%B0%E9%BB%92%E9%83%A8%E9%A7%85', false)

WebUI.closeBrowser()
