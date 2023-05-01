Feature: Deal data creation

  Scenario: Free CRM create a new deal scenario
    Given User is already on Login Page
    When title of login page is FreeCRM
    Then user enters username and password
      | username      | password   |
      | Umangpagetest | Umang12345 |
      
    Then user clicks on login button
    And user is on home page
    Then user moves to new deals page
    Then user enters deal details
    
      | title       | amount | probabiltiy | commission |
      | test deal 1 |   1000 |          50 |         10 |
      | test deal 2 |   2000 |          40 |         20 |
      | test deal 3 |   3000 |          30 |         30 |
      
    Then close the browser
