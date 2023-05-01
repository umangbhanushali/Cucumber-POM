
Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given User is already on Login Page
When title of login page is FreeCRM
Then user enters "<username>" and "<password>"
Then user clicks on login button 
#And user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser 

Examples:
| username | password | firstname | lastname | position |
| Umangpagetest | Umang12345 | Tom | Jerry | boss |
| Umangpagetest | Umang12345 | Shubham | Mehra | Director |