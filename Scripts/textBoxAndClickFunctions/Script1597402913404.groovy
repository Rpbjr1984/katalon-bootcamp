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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.baseURL)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('OrangeHRM/loginPage/OrangeHRM Logo'))

WebUI.verifyElementVisible(findTestObject('OrangeHRM/loginPage/Homepage Login Panel'))

WebUI.click(findTestObject('OrangeHRM/loginPage/Username Textbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('OrangeHRM/loginPage/Username Textbox'), GlobalVariable.userNameInput)

WebUI.click(findTestObject('OrangeHRM/loginPage/Password Textbox'))

WebUI.setEncryptedText(findTestObject('OrangeHRM/loginPage/Password Textbox'), GlobalVariable.passwordInput)

WebUI.verifyElementClickable(findTestObject('OrangeHRM/loginPage/Forgot Password Link'))

WebUI.click(findTestObject('OrangeHRM/loginPage/Login Submit Button'))

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.verifyElementVisible(findTestObject('OrangeHRM/homePage/Homepage Dashboard'))

WebUI.verifyElementVisible(findTestObject('OrangeHRM/homePage/Welcome Admin Link'))

WebUI.closeBrowser()

