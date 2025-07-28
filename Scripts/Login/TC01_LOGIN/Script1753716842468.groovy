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

WebUI.navigateToUrl('http://localhost:8000/login')

WebUI.setText(findTestObject('Object Repository/Page_Laravel App/input_Email_email'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel App/input_Password_password'), 'niryFAemGQD5E5LqyJQwdw==')

WebUI.click(findTestObject('Object Repository/Page_Laravel App/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Laravel App/div_Email wajib diisi'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Laravel App/input_Email_email'), 'aceng@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel App/input_Password_password'), '5tHno492bPA=')

WebUI.click(findTestObject('Object Repository/Page_Laravel App/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Laravel App/div_Email atau password salah'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Laravel App/input_Email_email'), 'aceng@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel App/input_Password_password'), 'niryFAemGQD5E5LqyJQwdw==')

WebUI.click(findTestObject('Object Repository/Page_Laravel App/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Laravel App/button_MahasiswaApp_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/Page_Laravel App/button_Logout'))

WebUI.verifyElementPresent(findTestObject('Page_Laravel App/div_Email wajib diisi'), 0)

