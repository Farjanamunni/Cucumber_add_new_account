Feature: Codefios Other Add New Account validation

 Background: 
    Given User is on the codefios login page
@AddNewAccountvalidationScenario1
Scenario Outline: User should be able to loging succefully and add a new account	
	When User enters the "<username>" in the "username" field
	When User enters the "<password>" in the "password" field
	And User clicks on "signin"
	Then User should land on Dashboard page 
	And User clicks on "listAccount"
  And User clicks on "addAccount"
	And User enters "<accountName>" in the "accountName" field in accounts page 
	And User enters "<description>" in the "description" field in accounts page 
	And User enters "<initialBalance>" in the "initialBalance" field in accounts page  
	And User enters "<accountNumber>" in the "accountNumber" field in accounts page 
	And User enters "<contactPerson>" in the "contactPerson" field in accounts page 
	And User clicks on "Save"
	Then User should be able to validate account created successfully
	
	Examples: 
	|username|password|accountName|description|initialBalance|accountNumber|contactPerson|
	|demo@codefios.com|abc123|farjana|Bank account|50000|111004411|farhana|
