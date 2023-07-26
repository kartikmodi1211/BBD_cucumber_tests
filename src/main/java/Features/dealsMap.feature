Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on Login Page Maptest
	When title of login page is Free CRM Maptest
	Then user enters username and password Maptest
		| username                    | password|
		| kartikmodi121195@icloud.com | Modi@9898 |
		
	Then user clicks on login button Maptest
	Then user is on home page Maptest
	Then user moves to new deal page Maptest
	Then user enters deal details Maptest
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then Close the browser Maptest