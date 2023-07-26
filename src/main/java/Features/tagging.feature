@FunctionalTest
Feature: Free CRM application testing
#This file and it's step definition file is made to understand concept of tagging.

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case
