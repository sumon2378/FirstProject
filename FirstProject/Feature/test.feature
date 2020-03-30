Feature: create an account 
Scenario: User able to sing up with credentials
Given User able to go home page
When User able to click account
When User able to click start here
And User enter  full name
And User enter email address
And user enter password 
And user re-enter password
And user click on create on your amazon account  
Then User able to sing up successfully
