#Author : Prashanthi
Feature: Login functionality testing


@logininvalid
Scenario: User should not be able to login with invalid credentials



When User enters email id "prashanthi@gmail.com"
And User enters password "test123"
And User clicks signin button
Then User should see the error message





Scenario: User should launch the login page


Given User is in login page



 @regression
Scenario Outline: User should not be able to login with invalid credentials



When User enters email id "<emailid>"
And User enters password "<password>"
And User clicks signin button
Then User should see the error message


Examples:

|emailid|password|
|prashanthi@gmail.com|test1234|
|testing456@gmail.com|test234|


