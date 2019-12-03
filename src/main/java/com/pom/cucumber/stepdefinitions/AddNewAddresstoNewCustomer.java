package com.pom.cucumber.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.beust.jcommander.internal.Maps;
import com.pom.cucumber.base.BaseClass;
import com.pom.cucumber.pages.AddrBookHomePage;
import com.pom.cucumber.pages.AddrBookLoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class AddNewAddresstoNewCustomer extends BaseClass {
	AddrBookHomePage addrBookHomePage;
	AddrBookLoginPage addrbookLoginPage;
	
	
	@Given("^User logged in with Valid UserName and Password$")
	public void user_logged_in_with_Valid_UserName_and_Password() throws IOException {
		 BaseClass.initialization();
		 addrBookHomePage = new AddrBookHomePage();
		 addrbookLoginPage = new AddrBookLoginPage();
		 addrBookHomePage = addrbookLoginPage.loginAddrBokwebSite(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Then("^User Clicks on Address Button to create NewAddress$")
	public void user_Clicks_on_New_Address_Button() {
		addrBookHomePage.clickOnAddrsButton();
	}

	@Then("^Click on New AddressButton$")
	public void clickOnNewAddressButton() {
		addrBookHomePage.clickNewAddrButton();
	}
	
	@Then("^User lands on the NewAddress form Page$")
	public void user_lands_on_the_NewAddress_form_Page() {
		Assert.assertEquals("Address Book",addrBookHomePage.getNewAddressPageTitle());
	}
	
/*	// Below method is example for the Data Driven using the Maps Feature
	@Then("^User Enters valid details and Clicks on Save Address button$")
	public void user_Enters_and_Clicks_on_Save_Address_button(DataTable data ) throws Throwable {
		for( Map<String, String> maps : data.asMaps(String.class, String.class)){
		addrBookHomePage.addNewAddressLogCust(maps.get("firstname"),maps.get("lastname"),maps.get("Address1"),maps.get("Address2"),maps.get("City"),maps.get("State"),maps.get("postcode"),maps.get("BirthDay"),maps.get("Age"),maps.get("MobilePhone"));
		}
	}*/
	 //The below method is example for handling the Data Driven Scenario using Examples
	@Then("^User Enters \"(.*)\" , \"(.*)\" , \"(.*)\" ,\"(.*)\" ,\"(.*)\" ,\"(.*)\" , \"(.*)\" \"(.*)\" , \"(.*)\" , \"(.*)\" and Clicks on Save Address button$")
	public void user_Enters_and_Clicks_on_Save_Address_button(String firstname, String lastname, String Address1, String Address2, String City, String State, String postcode ,String Birthday, String age, String MobilePhone ) throws Throwable {
		addrBookHomePage.addNewAddressLogCust(firstname,lastname,Address1,Address2,City,State,postcode,Birthday,age,MobilePhone);
	}

	@Then("^Verify the Success Message for the New Address Created$")
	public void verify_the_Success_Message_for_the_New_Address_Created() {
		Assert.assertEquals("Addresss was successfully created.",addrBookHomePage.getNewAddrSuccessMessage());
		addrBookHomePage.getMainAccAddressPage();
	}

	@Then("^Verify First and LastNames are updated correctly$")
	public void verify_First_and_LastNames_are_updated_correctly()  {
	}
	
	@Then("^Close the MyAccountPage$")
	public void teardown() {
		
	}

}
