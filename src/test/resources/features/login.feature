# Author
# Date
# Description
Feature: Test login functionality

  Scenario Outline: Verify login is successful with valid credentials
    Given Browser is open
    And user in on login page
    When user enters <email> and <password>
    And user clicks on login
    Then user navigated to the home page

    Examples: 
      | email   | password |
      | Admin   | admin123 |
      #| example |   123456 |
