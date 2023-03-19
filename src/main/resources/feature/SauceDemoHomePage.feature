#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Home Page Test
	Scenario: User adds items to cart
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		When user clicks on the add to cart button
		Then user confirms items in cart
		
	Scenario: Verify items in cart can be removed
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		When user clicks on the add to cart button
		When user clicks on the remove button
		Then user confirms items in cart after item is removed

		
	Scenario: Verify filter is clickable
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		Then user clicks on the filter
		
	Scenario: Verify twitter button opens twitter website
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		When user clicks on the twitter button and twitter website opens
			
		
	Scenario: Verify facebook button opens facebook website
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		When user clicks on the facebook button and facebook website opens	
		
	Scenario: Verify linkedin button opens linkedin website
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		When user clicks on the linkedin button and linkedin website opens	

	Scenario: Verify copyright information appears at the bottom of the website
		Given user navigates to the website
		When user enters valid username and password
		And user clicks the login button 
		Then user sees the home page
		Then user see the copyright information
		

