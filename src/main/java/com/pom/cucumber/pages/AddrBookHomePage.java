package com.pom.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.cucumber.Utils.TestUtils;
import com.pom.cucumber.base.BaseClass;

public class AddrBookHomePage extends BaseClass {
	
	@FindBy(xpath="//*[@id='navbar']/div[2]/span")
    WebElement getEmailAddrData;
	
	@FindBy(linkText="Addresses")
	WebElement addrBookAddressLink;
	
	@FindBy(linkText="New Address")
	static
	WebElement addrBookNewAddrLink;
	
	@FindBy(id="address_first_name")
	WebElement newAddrFirstName;
	
	@FindBy(id="address_last_name")
	WebElement newAddrLastName;
	
	@FindBy(id="address_street_address")
	WebElement newAddrStreetAddr;
	
	@FindBy(id="address_secondary_address")
	WebElement newAddrSecondaryAddr;
	
	@FindBy(id="address_city")
	WebElement newAddrCity;
	
	@FindBy(id="address_state")
	WebElement newAddrState;
	
	@FindBy(id="address_zip_code")
	WebElement newAddrZipCode;
	
	@FindBy(id="address_country_us")
	WebElement newAddrCntry;
	
	@FindBy(id="address_birthday")
	WebElement newAddrBirthDay;
	
	@FindBy(id="address_age")
	WebElement newAddrAge;
	
	@FindBy(id="address_phone")
	WebElement newAddrPhone;
	
	@FindBy(id="address_interest_dance")
	WebElement newAddrCommInterest;
	
	@FindBy(xpath="//input[@value='Create Address']")
	WebElement newAddressCreate;
	
	@FindBy(xpath="//div[@class='alert alert-notice']")
	WebElement newAddrSuccessMessage;
	
	// Click on the Address Link Again and perform assertions
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td[1]")
	WebElement getFirstNameAddrBook;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td[2]")
	WebElement getLastNameAddrBook;
	
	public AddrBookHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//this method is to get the Title of the MyAccount page 
	public String getHomeAddrBookTitle() {
		return driver.getTitle();
	}
	
	//Method to get the email used for login 
	public String getEmailAddrLoggedIn() {
		return getEmailAddrData.getText();
	}
	
	//Click on the  AddrButton to create New Address
	public void clickOnAddrsButton() {
		addrBookAddressLink.click();
	}
	
	//Click on the New Address Button 
	public static void clickNewAddrButton() {
		addrBookNewAddrLink.click();
	}
	
	//Get the Title of the NewAddress Page
	public String getNewAddressPageTitle() {
		return driver.getTitle();
	}
	
	//Create a New Address for the logged in Customer
	public void addNewAddressLogCust(String firstname,String lastname,String Address1,String Address2,String City,String State,String postcode,String Birthday,String Age,String MobilePhone) {
		newAddrFirstName.sendKeys(firstname);
		newAddrLastName.sendKeys(lastname);
		newAddrStreetAddr.sendKeys(Address1);
		newAddrSecondaryAddr.sendKeys(Address2);
		newAddrCity.sendKeys(City);
		TestUtils.SelectData(newAddrState, "value",State);
		newAddrZipCode.sendKeys(postcode);
		newAddrCntry.click();
		newAddrBirthDay.sendKeys(Birthday);
		newAddrAge.sendKeys(Age);
		newAddrPhone.sendKeys(MobilePhone);
		newAddrCommInterest.click();
		newAddressCreate.click();
	}
	
	//Method to get the Success Message
	public String getNewAddrSuccessMessage() {
		return newAddrSuccessMessage.getText();
	}
	
	//Method to getBack to the main AddressPage
	public void getMainAccAddressPage() {
		addrBookAddressLink.click();
	}
	
	//Method to Verify the New Address Created 
	public String getFirstLastNameSaveDAddress() {
		return getFirstNameAddrBook.getText() + " " + getLastNameAddrBook.getText();
	}
}
