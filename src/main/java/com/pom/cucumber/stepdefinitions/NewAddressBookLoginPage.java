package com.pom.cucumber.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.testng.asserts.Assertion;

import com.pom.cucumber.base.BaseClass;
import com.pom.cucumber.pages.AddrBookHomePage;
import com.pom.cucumber.pages.AddrBookLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NewAddressBookLoginPage extends BaseClass {
	 
	AddrBookLoginPage addrbkloginPage;
	AddrBookHomePage addrbkHomePage;
	
	@Given("^User is already on newAddressBookHomePage$")
	public void user_is_already_on_newAddressBookHomePage() throws IOException {
		BaseClass.initialization();
	}
	
	@Then("^User is on LoginPage$")
	public void user_is_on_LoginPage(){
		addrbkloginPage = new AddrBookLoginPage();
		Assert.assertEquals("Welcome to Address Book",addrbkloginPage.getLoginPageText());
		addrbkloginPage.clickOnSignIn();
	}

	@Then("^User Enters Username and Password and Clicks on SignIn Button$")
	public void user_Enters_Username_and_Password_and_Clicks_on_SignIn_Button(){
		addrbkHomePage=addrbkloginPage.loginAddrBokwebSite(prop.getProperty("userName"),prop.getProperty("password"));
	}

	@Then("^MyAccountPage is displayed$")
	public void myaccountpage_is_displayed() {
		Assert.assertEquals("Welcome to Address Book",addrbkloginPage.getLoginPageText());
	}

	@Then("^Validate the MyAccountPage Title$")
	public void validate_the_MyAccountPage_Title() {
		Assert.assertEquals("Address Book",addrbkHomePage.getHomeAddrBookTitle());
	}

	@Then("^Validate the EmailAddress logged in MyAccountPage$")
	public void validate_the_EmailAddress_logged_in_MyAccountPage() {
		Assert.assertEquals(prop.getProperty("userName"),addrbkHomePage.getEmailAddrLoggedIn().trim());
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
