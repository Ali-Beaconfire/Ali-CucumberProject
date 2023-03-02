@Regression
Feature: open the browser
  Scenario: open the browser verify the page title
    Given I navigate to swaglab home page
    And I enter the username to "standard_user" user name textbox
    When I enter the password to "secret_sauce" password textbox
    And I click on login button
    Then I verify The page title
    Then I verify home page have six item
