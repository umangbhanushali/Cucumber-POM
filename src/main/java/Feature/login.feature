
Feature: Free CRM Login Feature

# Scenario: Free CRM Login Test Scenario

#Given User is already on Login Page
#When title of login page is FreeCRM
#Then user enters "Umangpagetest" and "Umang12345"
#Then user clicks on login button 
# And user is on home page 



Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When title of login page is FreeCRM
Then user enters "<username>" and "<password>"
Then user clicks on login button 
And user is on home page
Then close the browser 

Examples:

| username | password |
| Umangpagetest | Umang12345 |
| bhanu | test123 |
