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

response = WS.sendRequest(findTestObject('Todos/GET/GET Todos All'))

WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)

assert response.getStatusCode() == 200

WS.verifyElementPropertyValue(response, '[0].userId', '1')

WS.verifyElementPropertyValue(response, '[0].id', '1')

WS.verifyElementPropertyValue(response, '[0].title', 'delectus aut autem')

WS.verifyElementPropertyValue(response, '[0].completed', 'false')

WS.verifyElementPropertyValue(response, '[1].userId', '1')

WS.verifyElementPropertyValue(response, '[1].id', '2')

WS.verifyElementPropertyValue(response, '[1].title', 'quis ut nam facilis et officia qui')

WS.verifyElementPropertyValue(response, '[1].completed', 'false')

WS.verifyElementPropertyValue(response, '[2].userId', '1')

WS.verifyElementPropertyValue(response, '[2].id', '3')

WS.verifyElementPropertyValue(response, '[2].title', 'fugiat veniam minus')

WS.verifyElementPropertyValue(response, '[2].completed', 'false')

WS.verifyElementPropertyValue(response, '[3].userId', '1')

WS.verifyElementPropertyValue(response, '[3].id', '4')

WS.verifyElementPropertyValue(response, '[3].title', 'et porro tempora')

WS.verifyElementPropertyValue(response, '[3].completed', 'true')

WS.verifyElementPropertyValue(response, '[4].userId', '1')

WS.verifyElementPropertyValue(response, '[4].id', '5')

WS.verifyElementPropertyValue(response, '[4].title', 'laboriosam mollitia et enim quasi adipisci quia provident illum')

WS.verifyElementPropertyValue(response, '[4].completed', 'false')

WS.verifyElementPropertyValue(response, '[5].userId', '1')

WS.verifyElementPropertyValue(response, '[5].id', '6')

WS.verifyElementPropertyValue(response, '[5].title', 'qui ullam ratione quibusdam voluptatem quia omnis')

WS.verifyElementPropertyValue(response, '[5].completed', 'false')

WS.verifyElementPropertyValue(response, '[6].userId', '1')

WS.verifyElementPropertyValue(response, '[6].id', '7')

WS.verifyElementPropertyValue(response, '[6].title', 'illo expedita consequatur quia in')

WS.verifyElementPropertyValue(response, '[6].completed', 'false')

WS.verifyElementPropertyValue(response, '[7].userId', '1')

WS.verifyElementPropertyValue(response, '[7].id', '8')

WS.verifyElementPropertyValue(response, '[7].title', 'quo adipisci enim quam ut ab')

WS.verifyElementPropertyValue(response, '[7].completed', 'true')

WS.verifyElementPropertyValue(response, '[8].userId', '1')

WS.verifyElementPropertyValue(response, '[8].id', '9')

WS.verifyElementPropertyValue(response, '[8].title', 'molestiae perspiciatis ipsa')

WS.verifyElementPropertyValue(response, '[8].completed', 'false')

WS.verifyElementPropertyValue(response, '[9].userId', '1')

WS.verifyElementPropertyValue(response, '[9].id', '10')

WS.verifyElementPropertyValue(response, '[9].title', 'illo est ratione doloremque quia maiores aut')

WS.verifyElementPropertyValue(response, '[9].completed', 'true')

