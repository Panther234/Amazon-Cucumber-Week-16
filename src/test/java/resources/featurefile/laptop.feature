Feature: Search bar functionality

  As a user I should able to search laptop and add to cart it

  Background:
    Given I am on HomePage

  Scenario Outline: Verify user should able to search laptop and add to cart successfully
    When I search for 'Laptop' in search bar
    And I click on Search button
    And I should find the "<LAPTOP>" by its names
    And Click on Product description to open product
    And I select qty from Dropdown
    And I click on Add to Cart button
    Then I can verify 'Added to Cart' word


    Examples:
      | LAPTOP                                                                                                                                |
      | ASUS L410 MA-DB04 Ultra Thin Laptop, 14” FHD Display, Intel Celeron N4020 Processor, 4GB RAM, 128GB Storage, NumberPad, Windows 10 Home in S Mode, Star Black |
#      | HP Pavilion Gaming 15-Inch Laptop, Intel Core i5-9300H, NVIDIA GeForce GTX 1650, 12GB RAM, 256GB SSD, Windows 10 (15-dk0041nr, Black) |
#      | Dell Inspiron 3000 15” Laptop Intel Celeron – 128GB SSD+500GB HDD – 8GB DDR4 – 1.8GHz - Intel UHD Graphics - Windows 10 Home - Inspiron 15 3000 Series - New|
#      | ASUS ZenBook 13 Ultra-Slim Laptop, 13.3” OLED FHD NanoEdge Bezel Display, Intel Core i7-1165G7, 16GB LPDDR4X RAM, 512GB SSD, NumberPad, Thunderbolt 4, Wi-Fi 6, Windows 10 Pro, Pine Grey, UX325EA-XS74 |