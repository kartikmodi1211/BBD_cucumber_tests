Feature: Free CRM app test 
@first
Scenario: free crm create deal test 
	Given user is on deal page hooktest
	When user fills the deals form hooktest
	Then deal is created hooktest
	
@second	
Scenario: free crm create contact test 
	Given user is on contact page hooktest
	When user fills the contact form hooktest
	Then contact is created hooktest
	
	
#Scenario Outline: free crm create mail test 
#	Given user is on mail page 
#	When user fills the mail form 
#	Then mail is created 
#	Examples: 
#		|mail1|
#		|mail2|
#		|mail3|	
	