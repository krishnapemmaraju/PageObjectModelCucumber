package com.pom.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.cucumber.base.BaseClass;

public class AddrBookLoginPage extends BaseClass {
	
	@FindBy(id="session_email")
	WebElement emailAddr;
	
	@FindBy(id="session_password")
	WebElement emailpasswd;
	
	@FindBy(xpath="//input[@type='submit' and @name = 'commit']")
	WebElement addrSubmitButton;
	
	@FindBy(linkText="Sign in")
	WebElement SignInAddrBook;
	
	@FindBy(xpath="//div[@class='text-center']/h1")
	WebElement getAddrBookHomePageText;
	
	@FindBy(xpath="//*[@id='navbar']/div[2]/span")
    WebElement getEmailAddrData;
	
	public AddrBookLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnSignIn() {
		SignInAddrBook.click();
	}
	
	public boolean isEmailAddrDisplayedAddBook() {
		return getEmailAddrData.isDisplayed();
	}
	
	public String getLoginPageText() {
		return getAddrBookHomePageText.getText();
	}
	
	public AddrBookHomePage loginAddrBokwebSite(String userName , String password) {
		SignInAddrBook.click();
		emailAddr.sendKeys(userName);
		emailpasswd.sendKeys(password);
		addrSubmitButton.click();
		return new AddrBookHomePage();
	}
   
}
