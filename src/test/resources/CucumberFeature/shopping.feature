
# This is cucumber feature file  wit example table
@Smoke
Feature: Shopping
  Scenario Outline: enter multiple username and password
    Given I navigate to swaglab home page
    When I Enter the "<Username>" and "<Password>" to user name and password Text box
    And I click on login button
    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
