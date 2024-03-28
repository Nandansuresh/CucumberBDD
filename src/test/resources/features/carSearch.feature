@search-cars
Feature: validation of car search page
    In order to validate car search
    as a buyer
    I navigate to http://www.carsguide.com.au

  @search-cars-positive
  Scenario: Searching for a new car
    Given I am on the home page "http://www.carsguide.com.au" of carsguide website
    When I move to menu
      | Menu     |
      | buy+sell |
      | reviews  |
      | news     |
      | advice   |
    And I click on Buy a Car
    And I select make as BMW
    And I select Model as X5
    And I select location as Central Coast
    And I Select price as "1000"
    Then I should see list of searched cars contains "BMW"
    And the page title should be "BMW for Sale Central Coast NSW | CarsGuide"
    
