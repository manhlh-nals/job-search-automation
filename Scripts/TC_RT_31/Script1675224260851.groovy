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

WebUI.navigateToUrl('https://msi.auth.ap-northeast-1.amazoncognito.com/login?client_id=1382qr28574upmt7j93tcn1dh6&redirect_uri=https%3A%2F%2Fmsi.dev.nals.vn%2Foauth2%2Fidpresponse&response_type=code&scope=openid&state=AL%2F0Mq1405TVHItGlPSJBnEuWCCUj6QCxT%2FMp3YB0fBDkfrNWA%2FQ44fOv%2FrA2YYBG8NDZ4F5ffOxn2R1BHrUO9pFqTLlgRxyq9ECZ+HebqX6ZiTwbJEkb0H7sloVrHLA6F3xySj%2FHs0128qegNX+asE4AkbkxvonMehXt0Wp0qWB%2FHz50Sg%2Fkd4CvZ5mHQToGz3suZdx1ak%3D')

WebUI.setText(findTestObject('Object Repository/Page_Signin/input_Username_username'), 'msi-dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_Password_password'), 'RVO4XLX7AjLtcFqtCbcD1A==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Signin/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.rightClick(findTestObject('Object Repository/Page_/a_'))

WebUI.rightClick(findTestObject('Object Repository/Page_/a_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/a_IT'), 0)

WebUI.verifyElementText(findTestObject('Page_/a_IT'), first)

WebUI.closeBrowser()

