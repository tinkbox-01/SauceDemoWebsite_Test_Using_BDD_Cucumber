#Author: tayo.ola@outlook.com
#Keywords Summary : E2E Test Script for Suace Demo Website
# Given, When, And, Then
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Login Page Test
	Scenario: User to be able to verify login URL
		Given user navigates to website
		Then user confirms website URL
		
	Scenario: User to be able to verify login title
		Given user navigates to website
		Then user confirms page title
		
	Scenario: User to be able to login with valid credentials
		Given user navigates to website
		When user enters valid username
		And user enters valid password
		And user clicks login button
		Then user sees home page

	Scenario: User cannot login with invalid credentials
		Given user navigates to website
		When user enters invalid username
		And user enters invalid password
		And user clicks login button
		Then user gets error message
		And user remains on login page

	Scenario: User cannot login with blank credentials
		Given user navigates to website
		When user leaves username blank
		And user leaves password blank
		And user clicks login button
		Then user gets error message
		And user remains on login page
		
