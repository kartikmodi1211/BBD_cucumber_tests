Feature: Free CRM Login feature

#Scenario: Free CRM login Test Scenario
#
#Given User is already on login page 
#When title of login page is free CRM
#Then user enters username and password    
#Then user clicks on login button
#Then user is on home page
#Then Close the browser




#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page logintest
When title of login page is Free CRM logintest
Then user enters "<username>" and "<password>" logintest
Then user clicks on login button logintest
Then user is on home page logintest
Then Close the browser logintest


Examples:
	| username                    | password  |
	| kartikmodi121195@icloud.com | Modi@9898 |
		