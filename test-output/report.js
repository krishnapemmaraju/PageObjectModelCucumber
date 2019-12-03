$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kpemmaraju/eclipse-workspace/PageObjectModelUsingCucumber/src/main/java/com/pom/cucumber/feature/AutomationAddrBookAddNewAddr.feature");
formatter.feature({
  "line": 1,
  "name": "Adding a New Address to logged in Cutomer",
  "description": "",
  "id": "adding-a-new-address-to-logged-in-cutomer",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Adding a New Address"
    },
    {
      "line": 4,
      "value": "#Given User logged in with Valid UserName and Password"
    },
    {
      "line": 5,
      "value": "#Then User Clicks on Address Button to create NewAddress"
    },
    {
      "line": 6,
      "value": "#Then Click on New AddressButton"
    },
    {
      "line": 7,
      "value": "#Then User lands on the NewAddress form Page"
    },
    {
      "line": 8,
      "value": "#Then User Enters valid details and Clicks on Save Address button"
    },
    {
      "line": 9,
      "value": "#                 |firstname|lastname|Address1|Address2|City|State|postcode|BirthDay|Age|MobilePhone|"
    },
    {
      "line": 10,
      "value": "#                 |KrishE|Kiran|TestAddress2|TestAddress2|Bangalore|AK|23423|12/09/1985|32|987878788|"
    },
    {
      "line": 11,
      "value": "#                 |KrishFF|KiranD|TestAddress3|TestAddress3|Bangalore|AK|23432|12/09/1985|32|987878288|"
    },
    {
      "line": 12,
      "value": "#                 |KrishDD|KiranS|TestAddress4|TestAddress4|Bangalore|AK|23213|12/03/1985|32|987178788|"
    },
    {
      "line": 13,
      "value": "#Then Verify the Success Message for the New Address Created"
    },
    {
      "line": 14,
      "value": "#Then Verify First and LastNames are updated correctly"
    },
    {
      "line": 15,
      "value": "#Then Close the MyAccountPage"
    },
    {
      "line": 20,
      "value": "####################### Below is the Example for Data Driven Testing #############################"
    }
  ],
  "line": 21,
  "name": "Adding a New Address",
  "description": "",
  "id": "adding-a-new-address-to-logged-in-cutomer;adding-a-new-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User logged in with Valid UserName and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User Clicks on Address Button to create NewAddress",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on New AddressButton",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User lands on the NewAddress form Page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Enters \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cAddress1\u003e\" ,\"\u003cAddress2\u003e\" ,\"\u003cCity\u003e\" ,\"\u003cState\u003e\" , \"\u003cpostcode\u003e\" \"\u003cBirthDay\u003e\" , \"\u003cAge\u003e\" , \"\u003cMobilePhone\u003e\" and Clicks on Save Address button",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify the Success Message for the New Address Created",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Verify First and LastNames are updated correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Close the MyAccountPage",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "adding-a-new-address-to-logged-in-cutomer;adding-a-new-address;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "Address1",
        "Address2",
        "City",
        "State",
        "postcode",
        "BirthDay",
        "Age",
        "MobilePhone"
      ],
      "line": 32,
      "id": "adding-a-new-address-to-logged-in-cutomer;adding-a-new-address;;1"
    },
    {
      "cells": [
        "KrishE",
        "Kiran",
        "TestAddress2",
        "TestAddress2",
        "Bangalore",
        "AK",
        "23423",
        "12/01/1985",
        "32",
        "987878788"
      ],
      "line": 33,
      "id": "adding-a-new-address-to-logged-in-cutomer;adding-a-new-address;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "Adding a New Address",
  "description": "",
  "id": "adding-a-new-address-to-logged-in-cutomer;adding-a-new-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User logged in with Valid UserName and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User Clicks on Address Button to create NewAddress",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on New AddressButton",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User lands on the NewAddress form Page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Enters \"KrishE\" , \"Kiran\" , \"TestAddress2\" ,\"TestAddress2\" ,\"Bangalore\" ,\"AK\" , \"23423\" \"12/01/1985\" , \"32\" , \"987878788\" and Clicks on Save Address button",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify the Success Message for the New Address Created",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Verify First and LastNames are updated correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Close the MyAccountPage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.user_logged_in_with_Valid_UserName_and_Password()"
});
formatter.result({
  "duration": 13403101300,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.user_Clicks_on_New_Address_Button()"
});
formatter.result({
  "duration": 92668000,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.clickOnNewAddressButton()"
});
formatter.result({
  "duration": 450761500,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.user_lands_on_the_NewAddress_form_Page()"
});
formatter.result({
  "duration": 9941400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "KrishE",
      "offset": 13
    },
    {
      "val": "Kiran",
      "offset": 24
    },
    {
      "val": "TestAddress2",
      "offset": 34
    },
    {
      "val": "TestAddress2",
      "offset": 50
    },
    {
      "val": "Bangalore",
      "offset": 66
    },
    {
      "val": "AK",
      "offset": 79
    },
    {
      "val": "23423",
      "offset": 86
    },
    {
      "val": "12/01/1985",
      "offset": 94
    },
    {
      "val": "32",
      "offset": 109
    },
    {
      "val": "987878788",
      "offset": 116
    }
  ],
  "location": "AddNewAddresstoNewCustomer.user_Enters_and_Clicks_on_Save_Address_button(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2216003600,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.verify_the_Success_Message_for_the_New_Address_Created()"
});
formatter.result({
  "duration": 34064700,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cAddress[s] was successfully cr...\u003e but was:\u003cAddress[] was successfully cr...\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.pom.cucumber.stepdefinitions.AddNewAddresstoNewCustomer.verify_the_Success_Message_for_the_New_Address_Created(AddNewAddresstoNewCustomer.java:60)\r\n\tat ✽.Then Verify the Success Message for the New Address Created(C:/Users/kpemmaraju/eclipse-workspace/PageObjectModelUsingCucumber/src/main/java/com/pom/cucumber/feature/AutomationAddrBookAddNewAddr.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.verify_First_and_LastNames_are_updated_correctly()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddresstoNewCustomer.teardown()"
});
formatter.result({
  "status": "skipped"
});
});