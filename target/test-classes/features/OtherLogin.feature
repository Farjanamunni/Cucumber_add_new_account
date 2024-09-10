	@OtherLoginFeature @Regression
	  Feature: Other Codefios login functionality validation(Negative scenario)
	
	@OtherLoginScenario1
	Scenario Outline: User should not be able to login with invalid credential(Other)
	Given User is on the codefios login page
	When User enters username as "<username>"
	 When User enters password as "<password>"
 When User clicks on signin button
	 Then User should land on dashboard page
	
		Examples: 
		|username|password|
		|demo2@codefios.com|abc123|
		|demo@codefios.com|abc124|
		|demo3@codefios.com|abc124|
		|||

#@OtherLoginScenario1
#Scenario: User should not be able to login with invalid credential(Other)
#Given User is on the codefios login page
#When User enters username as "demo2@codefios.com"
#When User enters password as "abc123"
#When User clicks on signin button
#Then User should land on dashboard page

#@OtherLoginScenario2 @smoke
#Scenario: User should not be able to login with ivalid credential(Other)
#Given User is on the codefios login page
#When User enters username as "demo@codefios.com"
#When User enters password as "abc124"
#When User clicks on signin button
#Then User should land on dashboard page

#@OtherLoginScenario3
#Scenario: User should not be able to login with ivalid credential(Other)
#Given User is on the codefios login page
#When User enters username as "demo3@codefios.com"
#When User enters password as "abc124"
#When User clicks on signin button
#Then User should land on dashboard page

#@OtherLoginScenario3
#Scenario: User should not be able to login with ivalid credential(Other)
#Given User is on the codefios login page
#When User enters username as ""
#When User enters password as ""
#When User clicks on signin button
#Then User should land on dashboard page