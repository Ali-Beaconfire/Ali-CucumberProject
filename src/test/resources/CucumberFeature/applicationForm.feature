@Pet
Feature: Application form
  Scenario: petpartners application

    Given I navigate to petpartners home page
    And I click get quote button
    And I click "Dog" button
    When I fill out the application
      | Pet name | pet Type | Zip Code | Pet Breed     | Pet Age | Email Address  |
      | Khan | Dog | 77433 | Alaskan Husky | 8 | test@gmail.com |

    And i click "Yes" button for the yes or no question

    ## feature file with data table


