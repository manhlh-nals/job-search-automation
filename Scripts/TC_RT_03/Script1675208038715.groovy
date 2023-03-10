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

WebUI.click(findTestObject('Object Repository/Page_/p_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/a_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/img__Hover_hover__8Ryp6'), 0)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://msi.dev.nals.vn/mypage/history', false)

text = WebUI.getText(findTestObject('Object Repository/Page_/a_'))

WebUI.verifyMatch(text, browsingText, false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/div_'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/div_'), browsingText)

WebUI.closeBrowser()

