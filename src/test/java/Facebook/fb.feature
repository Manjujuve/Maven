Feature: I want to login to facebook page
Scenario Outline: Valid credentials

Given user launch the url and maximizing
When I enter the "<username>"
Then  enter the "<password>"
Then I click on the login button

Examples:

|username|password|
|manju|1234|
|tamil|3456|
|jo|6789|



