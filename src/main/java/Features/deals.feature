Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page Dealtest
When title of login page is Free CRM Dealtest
Then user enters username and password Dealtest
| kartikmodi121195@icloud.com | Modi@9898 |

Then user clicks on login button Dealtest
Then user is on home page Dealtest
Then user moves to new deal page Dealtest
Then user enters deal details Dealtest
| test deal | 1000 | 50 | 10 |

Then Close the browser Dealtest