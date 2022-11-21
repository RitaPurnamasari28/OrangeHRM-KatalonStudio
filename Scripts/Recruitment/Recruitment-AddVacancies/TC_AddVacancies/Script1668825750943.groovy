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

WebUI.click(findTestObject('Recruitment-AddVacancies/btn_recruitment'))

WebUI.click(findTestObject('Recruitment-AddVacancies/btn_vacancies'))

WebUI.click(findTestObject('Recruitment-AddVacancies/btn_add'))

WebUI.setText(findTestObject('Recruitment-AddVacancies/field_vacancyname'), 'Intern QA')

WebUI.click(findTestObject('Recruitment-AddVacancies/slc_jobtitle'))

WebUI.click(findTestObject('Recruitment-AddVacancies/slc_qaengineer'))

WebUI.setText(findTestObject('Recruitment-AddVacancies/field_description'), 'Intern')

WebUI.setText(findTestObject('Recruitment-AddVacancies/field_hiringmanager'), 'Paul Collings')

WebUI.setText(findTestObject('Recruitment-AddVacancies/field_numberofpositions'), '3')

WebUI.click(findTestObject('Recruitment-AddVacancies/btn_save'))

WebUI.click(findTestObject('Recruitment-AddVacancies/btn_vacancies'))

WebUI.click(findTestObject('Recruitment-AddVacancies/btn_dashboard'))

