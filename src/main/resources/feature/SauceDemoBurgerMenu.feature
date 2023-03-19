#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.


Feature: Burger Menu Test
	Scenario: User Logs out using burger menu
		Given user navigates to the website
		And user enters valid username and password
		When user clicks the login button 
		And user sees the home page
		And user clicks on the burger menu button
		And clicks on logout button
		Then user sees the login page
		
	Scenario: User clicks on the About Us button using burger menu
		Given user navigates to the website
		And user enters valid username and password
		When user clicks the login button 
		And user sees the home page
		And user clicks on the burger menu button
		And clicks on about us button and sees the saucelabs page
		
 Scenario: User clicks on the Reset App State button using burger menu
		Given user navigates to the website
		And user enters valid username and password
		When user clicks the login button 
		And user sees the home page
		And user add item to the cart
		And user clicks on the burger menu button
		And user clicks on reset app state button
		Then cart value is reset to zero
		
	Scenario: User clicks on the All Items button using burger menu
		Given user navigates to the website
		And user enters valid username and password
		When user clicks the login button 
		And user sees the home page
		And user add item to the cart
		And user clicks on the cart button
		Then user sees the cart list page
		And user clicks on the burger menu button
		And clicks on All Items button
		Then user sees the home page
