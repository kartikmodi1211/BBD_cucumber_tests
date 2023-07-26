Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page ContactsTest
When title of login page is Free CRM ContactsTest
Then user enters "<username>" and "<password>" ContactsTest
Then user clicks on login button ContactsTest
Then user is on home page ContactsTest
Then user moves to new contact page ContactsTest
Then user enters contact details "<firstname>" and "<lastname>" and "<position>" ContactsTest
Then Close the browser ContactsTest

Examples:
	|  username                    | password   | firstname   | lastname | position |
	| kartikmodi121195@icloud.com  | Modi@9898  | Tom 	      | Peter    | Manager  |
	| kartikmodi121195@icloud.com  | Modi@9898  | David 	  | Dsouza   | Director |
	