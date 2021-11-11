Feature: Login functionalities 

 @Login @One @All
Scenario: Verify whether user is able to signin with valid credentials
	Given I launch the application
	When I login to application using emailaddress "jack8345@gmail.com" and password "Jack@123"
	And I click on signIn button 
  Then I should see that user is able to login successfully
	
	 @Login @Two @All
Scenario: Verify whether user should not be able to signin with invalid credentials
	Given I launch the application
	When I login to application using emailaddress "jack8345@gmail.com" and password "Jack@12345"
	And I click on signIn button 
	Then I should see an error message that credentials are invalid 
