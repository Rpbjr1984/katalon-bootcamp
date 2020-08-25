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

WebUI.openBrowser(jsAlertUrl)

WebUI.waitForPageLoad(GlobalVariable.ExplicitWaitTimeout)

WebUI.maximizeWindow()

WebUI.click(findTestObject('W3school/winAlertMethod/alertPopUp/Alert Try it Yourself link'))

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(GlobalVariable.ExplicitWaitTimeout)

WebUI.switchToFrame(findTestObject('W3school/winAlertMethod/alertPopUp/alertPopUp_iFrame'), GlobalVariable.SetWaitTime)

WebUI.waitForElementVisible(findTestObject('W3school/winAlertMethod/alertPopUp/alert_iFrameTryItLink'), GlobalVariable.ExplicitWaitTimeout)

WebUI.click(findTestObject('W3school/winAlertMethod/alertPopUp/alert_iFrameTryItLink'))

WebUI.waitForAlert(GlobalVariable.ExplicitWaitTimeout)

WebUI.acceptAlert()

WebUI.verifyAlertNotPresent(GlobalVariable.ExplicitWaitTimeout, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

