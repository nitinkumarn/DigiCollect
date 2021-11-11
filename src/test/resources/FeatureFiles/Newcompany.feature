Feature: Creating a company in companies module 

 @Creatingcompany @One @All
Scenario: Verify whether user is able to create new company by filling all mandatory fields
	Given I launch the application
	When I login to application using emailaddress "jack8345@gmail.com" and password "Jack@123"
	And I click on signIn button 
  And I click on comapnies module and create a new comapny
  And I provide Company name as "Testcompany"
  And I provide Domain name as "TestDomain.com"
  And I provide Industry type as "Finance and Insurance"
  And I provide Taxid as "test123"
  And I select currency as "INR"
  And I provide branch name as "Test branch"
  And I provide department name as "Test department name"
  And I select branch address county as "India"
  And I enter Admin name as "Testadmin"
  And I enter admin email as "testadmin"
  And I enter admin branch name as "Test branch"
  And I enter admin department as "testdepartment"
  And I enter admin password as "Test@1234"
  And I click on save button
  Then New company shopuld be created
