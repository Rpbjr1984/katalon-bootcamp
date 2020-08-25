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

WebUI.openBrowser(focusUrl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.ExplicitWaitTimeout)

WebUI.waitForElementVisible(findTestObject('Telerik/dragDrop_byObject/Dock Header'), GlobalVariable.ExplicitWaitTimeout)

WebUI.waitForElementVisible(findTestObject('Telerik/dragDrop_byObject/RadDock1Collapse'), GlobalVariable.ExplicitWaitTimeout)

WebUI.waitForElementClickable(findTestObject('Telerik/dragDrop_byObject/SourceElement_Handle_RadDock2'), GlobalVariable.ExplicitWaitTimeout)

WebUI.dragAndDropToObject(findTestObject('Telerik/dragDrop_byObject/SourceElement_Handle_RadDock2'), findTestObject('Telerik/dragDrop_byObject/TargetElement_ContentPlaceholder_Zone2'))

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.waitForElementClickable(findTestObject('Telerik/dragDrop_byObject/SourceElement_Handle_RadDock2'), GlobalVariable.ExplicitWaitTimeout)

WebUI.dragAndDropToObject(findTestObject('Telerik/dragDrop_byObject/SourceElement_Handle_RadDock2'), findTestObject('Telerik/dragDrop_byObject/TragetElement_ContentPlaceholder1_RadDockZone1'))

WebUI.focus(findTestObject('Telerik/Focus/DemoSearch1_SearchBox'))

WebUI.verifyElementClickable(findTestObject('Telerik/Focus/DemoSearch1_SearchBox'))

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.sendKeys(findTestObject('Telerik/Focus/DemoSearch1_SearchBox'), 'The focus is now on search box')

WebUI.delay(GlobalVariable.SetWaitTime)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

