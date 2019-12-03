Feature:  Adding a New Address to logged in Cutomer

#Scenario: Adding a New Address 
#Given User logged in with Valid UserName and Password
#Then User Clicks on Address Button to create NewAddress
#Then Click on New AddressButton
#Then User lands on the NewAddress form Page
#Then User Enters valid details and Clicks on Save Address button
#                 |firstname|lastname|Address1|Address2|City|State|postcode|BirthDay|Age|MobilePhone|
#                 |KrishE|Kiran|TestAddress2|TestAddress2|Bangalore|AK|23423|12/09/1985|32|987878788|
#                 |KrishFF|KiranD|TestAddress3|TestAddress3|Bangalore|AK|23432|12/09/1985|32|987878288|
#                 |KrishDD|KiranS|TestAddress4|TestAddress4|Bangalore|AK|23213|12/03/1985|32|987178788|
#Then Verify the Success Message for the New Address Created
#Then Verify First and LastNames are updated correctly
#Then Close the MyAccountPage

    
     
     
####################### Below is the Example for Data Driven Testing #############################     
Scenario Outline: Adding a New Address 
Given User logged in with Valid UserName and Password
Then User Clicks on Address Button to create NewAddress
Then Click on New AddressButton
Then User lands on the NewAddress form Page
Then User Enters "<firstname>" , "<lastname>" , "<Address1>" ,"<Address2>" ,"<City>" ,"<State>" , "<postcode>" "<BirthDay>" , "<Age>" , "<MobilePhone>" and Clicks on Save Address button
Then Verify the Success Message for the New Address Created
Then Verify First and LastNames are updated correctly
Then Close the MyAccountPage

Examples:
     |firstname|lastname|Address1|Address2|City|State|postcode|BirthDay|Age|MobilePhone|
     |KrishE|Kiran|TestAddress2|TestAddress2|Bangalore|AK|23423|12/01/1985|32|987878788|
#     |KrishFF|KiranD|TestAddress3|TestAddress3|Bangalore|AK|23432|12/11/1985|32|987878288|
#     |KrishDD|KiranS|TestAddress4|TestAddress4|Bangalore|AK|23213|12/08/1985|32|987178788|