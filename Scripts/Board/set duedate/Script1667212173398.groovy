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

Mobile.delay(18)

Mobile.tap(findTestObject('board/set due date/my team1'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/board2'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/button nisa3'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/edit4'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/due date5'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/next calender6'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/tgl12 7'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/btnoke 8'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('board/set due date/btnoke9'), 0)

