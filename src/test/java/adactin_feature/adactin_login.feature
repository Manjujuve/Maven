Feature: I want to login  Adactin
 

Scenario: valid login credentials.

Given User launch the url and maximing it
When I enter the valid usernmae
And I enter the valid password
Then I click on the login button
When Select location
And Select the hotels
And Select the Room type
Then Select number of rooms 
And Enter the checkin date
Then Enter the checkout date
And Select Adult per room
Then Select Children per room
Then I click the Search button

And I click the hotel
Then I click the continue button
Then I enter the firstnmae
And I enter the lastname
Then I enter the address
Then I enter the credit card number
And I select the card type
Then I select the expiry month
And I select the expiry year
Then I enter the cvv number
Then I click the booknow button
And I click the itinerary button
Then I Click the order id of the hotel
And I click the cancel button
Then I click ok in alert box
Then I click the logout button

