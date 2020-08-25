package com.orangehrm.profilePhotoUpload

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

public class photoUpload {

	@Keyword
	public void uploadProfilePic(){

		WebUI.verifyElementPresent(findTestObject('OrangeHRM/profileFotoUpload/My Info Menu'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.click(findTestObject('OrangeHRM/profileFotoUpload/My Info Menu'), FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(GlobalVariable.SetWaitTime)

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/profileFotoUpload/Image Pic Change Photo'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.click(findTestObject('OrangeHRM/profileFotoUpload/Image Pic Change Photo'))

		WebUI.delay(GlobalVariable.SetWaitTime)

		WebUI.waitForElementVisible(findTestObject('OrangeHRM/profileFotoUpload/Choose File Btn'), GlobalVariable.ExplicitWaitTimeout)

		WebUI.verifyElementVisible(findTestObject('OrangeHRM/profileFotoUpload/Choose File Btn'))

		WebUI.uploadFile(findTestObject('OrangeHRM/profileFotoUpload/Choose File Btn'), 'C:\\Users\\ric\\Desktop\\wallpaper\\northernLights.jpg')

		WebUI.delay(GlobalVariable.SetWaitTime)

		WebUI.click(findTestObject('OrangeHRM/profileFotoUpload/Save button'))

		WebUI.delay(GlobalVariable.SetWaitTime)

		WebUI.verifyElementVisible(findTestObject('OrangeHRM/profileFotoUpload/ToastMsg Upload Success'))

		WebUI.delay(GlobalVariable.SetWaitTime)
	}
}
