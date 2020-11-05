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

WebUI.openBrowser('kitabisa.com')

WebUI.waitForPageLoad(11)

WebUI.scrollToElement(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Campaign_Bantu Palestina Lewati Musim Dingin Mematikan'), 
    11)

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Campaign_Jariyah Bantu Pembangunan Masjid (Pahala Mengalir)'))

WebUI.waitForElementVisible(findTestObject('Page_Jariyah Bantu Pembangunan Masjid (Pahala Mengalir)/button_Donasi sekarang'), 
    11)

WebUI.click(findTestObject('Page_Jariyah Bantu Pembangunan Masjid (Pahala Mengalir)/button_Donasi sekarang'))

WebUI.waitForElementVisible(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/10k Donasi'), 11)

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/10k Donasi'))

WebUI.waitForElementVisible(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Transfer BCA'), 11)

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Transfer BCA'))

WebUI.setText(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Nama Lengkap'), 'test')

WebUI.setText(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Ponsel atau Email'), 'test@test.com')

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/button_Lanjut pembayaran'))

WebUI.waitForElementVisible(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Close Banner button'), 
    11)

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Close Banner button'))

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/button_Kembali ke penggalangan'))

WebUI.waitForElementVisible(findTestObject('Page_Jariyah Bantu Pembangunan Masjid (Pahala Mengalir)/Back Arrow'), 
    11)

WebUI.click(findTestObject('Page_Jariyah Bantu Pembangunan Masjid (Pahala Mengalir)/Back Arrow'))

