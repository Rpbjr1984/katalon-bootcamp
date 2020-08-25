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

WebUI.openBrowser(autoSuggestUrl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.ExplicitWaitTimeout)

WebUI.waitForElementVisible(findTestObject('Telerik/autoSuggest/AutoCompleteBox_header'), GlobalVariable.ExplicitWaitTimeout)

WebUI.waitForElementVisible(findTestObject('Telerik/autoSuggest/input_Text mode'), GlobalVariable.ExplicitWaitTimeout)

WebUI.click(findTestObject('Telerik/autoSuggest/input_Text mode'))

WebUI.sendKeys(findTestObject('Telerik/autoSuggest/input_Text mode'), inputText)

WebUI.waitForElementPresent(findTestObject('Telerik/autoSuggest/li_Andrew'), GlobalVariable.ExplicitWaitTimeout)

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.click(findTestObject('Telerik/autoSuggest/li_Andrew'))

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.closeBrowser()

