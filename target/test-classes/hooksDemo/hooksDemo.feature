Feature: Check login fonctionality

  @smoke
  Scenario: 
    Given user is in login page
    When user enters valid username and password
    And clicks on login botton
    Then user navigated to the home page

  Scenario: 
    Given user is in login page
    When user enters valid username and password
    And clicks on login botton
    Then user navigated to the home page
