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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://msi.dev.nals.vn/')

WebUI.setText(findTestObject('Object Repository/Page_Signin/input_Username_username'), 'msi-dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_Password_password'), 'RVO4XLX7AjLtcFqtCbcD1A==')

WebUI.click(findTestObject('Object Repository/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/section_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/section_img alt sizes100vw srcSetindexcat01_3b2ed2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/section_IT'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/section_IT_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/section_OK  20'), 0)

