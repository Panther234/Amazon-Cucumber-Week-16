Feature: Search bar functionality

  As a user I should able to search laptop and add to cart it

  Background:
    Given I am on HomePage

  Scenario Outline: Verify user should able to search laptop and add to cart successfully
    When I search for 'Mobile Phone' in search bar
    And I click on Search button
    And I should find the "<MobilePhone>" by its names
    And Click on Product description to open product
    And I select quantity from Dropdown
    And I click on Add to Cart button
    Then I can verify 'Added to Cart' word for MobilePhone


    Examples:
      | MobilePhone                                                                                                                                |
      | SAMSUNG Galaxy S20 FE 5G Factory Unlocked Android Cell Phone 128GB US Version Smartphone Pro-Grade Camera 30X Space Zoom Night Mode, Cloud Mint Green |
