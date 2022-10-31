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

Mobile.tap(findTestObject('board/add label/myteam1'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/add label/buttonborad2'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/add label/boardnisa3'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/add label/labelplus4'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/add label/name'), 0)

Mobile.delay(7)

Mobile.setText(findTestObject('board/add label/namefield'), 'nisa', 0)

Mobile.pressBack()

Mobile.delay(7)

Mobile.tap(findTestObject('board/add label/button submite8'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/add label/setcolor7'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('board/add label/button submite8'), 0)

