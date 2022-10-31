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

Mobile.startApplication(GlobalVariable.G_cicle, false)

Mobile.delay(15)

Mobile.tap(findTestObject('group chat/copy message delete/myteam1'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('group chat/copy message delete/chat2'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('group chat/copy message delete/message3'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('group chat/copy message delete/copy4'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('group chat/copy message delete/text5'), 0)

Mobile.delay(7)

Mobile.tapAndHold(findTestObject('group chat/copy message delete/settext6'), 0, 0)

Mobile.delay(7)

Mobile.tap(findTestObject('group chat/copy message delete/paste7'), 0)

