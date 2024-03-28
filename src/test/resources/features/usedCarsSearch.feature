@used-search-cars
Feature: validation of used car search page
    In order to validate used car search
    as a buyer
    I navigate to http://www.carsguide.com.au

  @used-search-cars-positive
  Scenario: Searching for a used car
    Given I am on the home page "http://www.carsguide.com.au" of carsguide website
    When I move to menu
      | Menu     |
      | buy+sell |
      | reviews  |
      | news     |
      | advice   |
    And I click on Used search car
    And I select carbrand as "Audi" from AnyMake dropdown
    And I select carmodel as "A6" from Select model dropdown 
    And I select location as "Victoria" from location dropdown
    And I Select price as "$1,000" from price dropdown
    And I click on show used vehicles button
    Then I should see list of searched cars contains "Audi"
    And the page title should be "Used Cars for Sale | Used Car Search | CarsGuide"