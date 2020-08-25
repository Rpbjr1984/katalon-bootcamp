package com.oranghrmLoginPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginPanel {

	@Keyword
	public void logIn(){

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/loginPage/OrangeHRM Logo'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/loginPage/Homepage Login Panel'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/loginPage/Login Submit Button'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.focus(findTestObject('OrangeHRM/loginPage/Username Textbox'))

		WebUI.delay(GlobalVariable.SetWaitTime)

		WebUI.setEncryptedText(findTestObject('OrangeHRM/loginPage/Username Textbox'), GlobalVariable.userNameInput)

		WebUI.focus(findTestObject('OrangeHRM/loginPage/Password Textbox'))

		WebUI.delay(GlobalVariable.SetWaitTime)

		WebUI.setEncryptedText(findTestObject('OrangeHRM/loginPage/Password Textbox'), GlobalVariable.passwordInput)

		WebUI.verifyElementClickable(findTestObject('OrangeHRM/loginPage/Login Submit Button'))

		WebUI.click(findTestObject('OrangeHRM/loginPage/Login Submit Button'))

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/homePage/Homepage Dashboard'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/homePage/Welcome Admin Link'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.verifyElementVisible(findTestObject('OrangeHRM/homePage/Homepage Dashboard'))

		WebUI.verifyElementClickable(findTestObject('OrangeHRM/homePage/Welcome Admin Link'))
	}
}
