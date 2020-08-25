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

WebUI.delay(GlobalVariable.defaultDelayTime)

WebUI.verifyElementVisible(findTestObject('OrangeHRM/loginPage/Homepage Login Panel'))

WebUI.verifyElementVisible(findTestObject('OrangeHRM/loginPage/OrangeHRM Logo'))

WebUI.click(findTestObject('OrangeHRM/loginPage/Username Textbox'))

WebUI.setEncryptedText(findTestObject('OrangeHRM/loginPage/Username Textbox'), GlobalVariable.userNameInput)

WebUI.click(findTestObject('OrangeHRM/loginPage/Password Textbox'))

WebUI.setEncryptedText(findTestObject('OrangeHRM/loginPage/Password Textbox'), GlobalVariable.passwordInput)

WebUI.verifyElementVisible(findTestObject('OrangeHRM/loginPage/Forgot Password Link'))

WebUI.submit(findTestObject('OrangeHRM/loginPage/Login Submit Button'))

WebUI.verifyElementVisible(findTestObject('OrangeHRM/homePage/Homepage Dashboard'))

WebUI.verifyElementVisible(findTestObject('OrangeHRM/homePage/Admin Menu Bar/Admin Menu'))

WebUI.click(findTestObject('OrangeHRM/homePage/Admin Menu Bar/Admin Menu'))

WebUI.click(findTestObject('OrangeHRM/homePage/Admin Menu Bar/User Role Combo Box'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('OrangeHRM/homePage/Admin Menu Bar/User Role Combo Box'), 'ESS', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('OrangeHRM/homePage/Admin Menu Bar/User Role Combo Box'), 'ESS', false, 
    0)

WebUI.delay(GlobalVariable.defaultDelayTime)

WebUI.click(findTestObject('OrangeHRM/homePage/Admin Menu Bar/Status Combo Box'))

WebUI.selectOptionByIndex(findTestObject('OrangeHRM/homePage/Admin Menu Bar/Status Combo Box'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyOptionSelectedByIndex(findTestObject('OrangeHRM/homePage/Admin Menu Bar/Status Combo Box'), 2, 0)

WebUI.delay(GlobalVariable.defaultDelayTime)

WebUI.click(findTestObject('OrangeHRM/homePage/Admin Menu Bar/User Role Combo Box'))

WebUI.selectOptionByValue(findTestObject('OrangeHRM/homePage/Admin Menu Bar/User Role Combo Box'), '0', false)

WebUI.delay(GlobalVariable.defaultDelayTime)

WebUI.closeBrowser()

