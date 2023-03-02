@Regression
Feature:Search item
  Scenario Outline:Search multiple item on the google
    Given I navigate to google
    And I search "<Item>" on the google
    Examples:
     | Item    |
     | Iphone  |
     | Samsung |
     | LG      |