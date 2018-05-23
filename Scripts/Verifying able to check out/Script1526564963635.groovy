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

WebUI.callTestCase(findTestCase('Searching-NokiaLumiaand Adding to Cart'), [('serarchnokialumia') : 'nokia lumia 1020'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('checking out an order successfuly/Link-ShoppingCart'))

WebUI.click(findTestObject('checking out an order successfuly/Checkbox-Terms of Service'))

WebUI.click(findTestObject('checking out an order successfuly/Checkbox-Checkout'))

WebUI.click(findTestObject('checking out an order successfuly/Billing Address/CheckBox-ShippingToThe same address'))

WebUI.delay(3)

WebUI.click(findTestObject('checking out an order successfuly/Billing Address/Input-Country'))

WebUI.delay(3)

WebUI.setText(findTestObject('checking out an order successfuly/Billing Address/Input-BillingCity'), shippingcity)

WebUI.setText(findTestObject('checking out an order successfuly/Billing Address/Input-BillingAddress1'), shippingaddress1)

WebUI.setText(findTestObject('checking out an order successfuly/Billing Address/Input-BillingAddress2'), shippingaddress2)

WebUI.setText(findTestObject('checking out an order successfuly/Billing Address/Input-BillingPostalCode'), postalshipping)

WebUI.setText(findTestObject('checking out an order successfuly/Billing Address/Input-BillingPhoneNumber'), phonenumber)

WebUI.setText(findTestObject('checking out an order successfuly/Billing Address/Input-BillingFaxNumber'), faxnumber)

WebUI.click(findTestObject('checking out an order successfuly/Billing Address/Button-Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('checking out an order successfuly/ShippingMethod/button shipping method'))

WebUI.delay(2)

WebUI.click(findTestObject('checking out an order successfuly/ShippingMethod/Radio-ShippingMethod'))

WebUI.click(findTestObject('checking out an order successfuly/ShippingMethod/Button-Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('checking out an order successfuly/PaymentMethod/RadioButton-paymentMethod'))

WebUI.delay(2)

WebUI.click(findTestObject('checking out an order successfuly/PaymentMethod/Button-Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('PaymentInformation/Button-Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('PaymentInformation/Button-Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('PaymentInformation/Button-Confirm'))

WebUI.delay(2)

WebUI.closeBrowser()

