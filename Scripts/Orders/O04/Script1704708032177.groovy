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
WebUI.navigateToUrl('https://www.demoblaze.com/')
WebUI.click(findTestObject('Object Repository/a_Cart'))
WebUI.click(findTestObject('Object Repository/btn_PlaceOrder'))
WebUI.setText(findTestObject('Object Repository/input_Name'),'Vu Nguyen')
WebUI.setText(findTestObject('Object Repository/input_Country'),'Viet Nam')
WebUI.setText(findTestObject('Object Repository/input_City'), 'Hue')
WebUI.setText(findTestObject('Object Repository/input_CreditCard'),'078654621134')
WebUI.setText(findTestObject('Object Repository/input_Month'), '1')
WebUI.setText(findTestObject('Object Repository/input_Year'), '2024')
WebUI.click(findTestObject('Object Repository/btn_Purchase'))
