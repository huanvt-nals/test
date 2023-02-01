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

WebUI.navigateToUrl('https://msi.auth.ap-northeast-1.amazoncognito.com/login?client_id=1382qr28574upmt7j93tcn1dh6&redirect_uri=https%3A%2F%2Fmsi.dev.nals.vn%2Foauth2%2Fidpresponse&response_type=code&scope=openid&state=CmrH1kPYCZFEHz5hnzAxRVx%2FnQj0RcFPW3MSu3OKm3YTke%2FViLEko47FbrD5UxLREQMakssybRtcHIB6ufiODObStFi3cNt0qi4234r7rFfOlzzf82tbyKqeyjJJ9KBhFdQjWOd23z2dkuagicN7E%2FYTOE74jQ7zO9lcTK2ce4MNenHG7Hk7VceGuBmj%2FgSbJNZWh+s+hVo%3D')

WebUI.setText(findTestObject('Object Repository/Page_Signin/input_Username_username'), 'msi-dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_Password_password'), 'RVO4XLX7AjLtcFqtCbcD1A==')

WebUI.click(findTestObject('Object Repository/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.closeBrowser()

