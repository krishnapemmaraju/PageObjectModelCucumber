Feature: Login Vaidation For NewAddressBook Automation Website 

Scenario: Validate LoginFeature for NewAddressBook WebSite 
	Given User is already on newAddressBookHomePage
	Then User is on LoginPage 
	Then User Enters Username and Password and Clicks on SignIn Button 
	Then MyAccountPage is displayed 
	Then Validate the MyAccountPage Title 
	Then Validate the EmailAddress logged in MyAccountPage 
	Then Close the browser