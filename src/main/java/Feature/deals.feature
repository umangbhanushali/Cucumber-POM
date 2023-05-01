  
  Feature: Deal data creation
  
  Scenario: Free CRM create a new deal scenario
  
 Given User is already on Login Page
When title of login page is FreeCRM
Then user enters username and password
| Umangpagetest | Umang12345 |
Then user clicks on login button 
And user is on home page
Then user moves to new deals page
Then user enters deal details 
| test deal | 1000 | 50 | 10 |
Then close the browser 
   
 