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

WebUI.setText(findTestObject('Object Repository/Page_/input'), '!@#')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/div_OK2431OK'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input__sub-side-freeword-text'), 0)

subSideFreeword = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__sub-side-freeword-text'), 'value')

WebUI.verifyMatch(subSideFreeword, '!@#', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/span_'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/span_'), '!@#')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input_1'), 0)

textbox= WebUI.getAttribute(findTestObject('Object Repository/Page_/input_1'), 'value')

WebUI.verifyMatch(textbox, '!@#', false)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://msi.dev.nals.vn/search/freeword%21%40%23', false)

WebUI.closeBrowser()

