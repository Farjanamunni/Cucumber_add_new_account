@DbLoginFeature @Regression
Feature: Codefios login functionality validation

@DbLoginScenario1
Scenario: User should be able to login with valid credential
Given User is on the codefios login page
When User enters "username" from mysql database
When User enters "password" from mysql database
When User clicks on signin button
Then User should land on dashboard page

