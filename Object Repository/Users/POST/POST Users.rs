<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST Users</name>
   <tag></tag>
   <elementGuidId>aa755e85-453a-4ffe-9414-b4522620cf4d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;Berlin Chaniago\&quot;,\n    \&quot;username\&quot;: \&quot;Berchan\&quot;,\n    \&quot;email\&quot;: \&quot;berchan@gmail.co.id\&quot;,\n    \&quot;address\&quot;: {\n      \&quot;street\&quot;: \&quot;Victor Plains\&quot;,\n      \&quot;suite\&quot;: \&quot;Suite 879\&quot;,\n      \&quot;city\&quot;: \&quot;Wisokyburgh\&quot;,\n      \&quot;zipcode\&quot;: \&quot;90566-7771\&quot;,\n      \&quot;geo\&quot;: {\n        \&quot;lat\&quot;: \&quot;-43.9509\&quot;,\n        \&quot;lng\&quot;: \&quot;-34.4618\&quot;\n      }\n    },\n    \&quot;phone\&quot;: \&quot;010-680-6593 x09125\&quot;,\n    \&quot;website\&quot;: \&quot;berlin.net\&quot;,\n    \&quot;company\&quot;: {\n      \&quot;name\&quot;: \&quot;Deckow-Crist\&quot;,\n      \&quot;catchPhrase\&quot;: \&quot;Proactive didactic contingency\&quot;,\n      \&quot;bs\&quot;: \&quot;synergize scalable supply-chains\&quot;\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>4ae32880-0806-4e90-b1d2-db72595daf87</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://jsonplaceholder.typicode.com/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
