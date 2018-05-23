import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://demo.nopcommerce.com')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Account-Registsration/Link-Register'))

WebUI.click(findTestObject('Account-Registsration/RadioButton-Gender', [('gender') : genderoption]))

WebUI.setText(findTestObject('Account-Registsration/Input-Firstname'), firstname)

WebUI.setText(findTestObject('Account-Registsration/Input-Lastname'), lastname)

WebUI.selectOptionByValue(findTestObject('Account-Registsration/Input-Date of Birth-date'), '6', false)

WebUI.selectOptionByValue(findTestObject('Account-Registsration/Input-Date of birth-month'), '1', false)

WebUI.selectOptionByValue(findTestObject('Account-Registsration/Input-Date of Birth-Year'), '1995', false)

WebUI.setText(findTestObject('Account-Registsration/Input-Email'), inputemail)

WebUI.setText(findTestObject('Account-Registsration/Input-CompanyDetails'), inputcompanydetails)

WebUI.click(findTestObject('Account-Registsration/Checkbox-newsletter'))

WebUI.setText(findTestObject('Account-Registsration/Input-Password'), inputpassword)

WebUI.setText(findTestObject('Account-Registsration/Input-ConfirmPassword'), confirmpassword)

WebUI.click(findTestObject('Account-Registsration/Button-Register'))

not_run: WebUI.verifyElementPresent(findTestObject('Account-Registsration/Verification-message'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Account-Registsration/Button-continue'))

