$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/laptop.feature");
formatter.feature({
  "line": 1,
  "name": "Search bar functionality",
  "description": "\r\nAs a user I should able to search laptop and add to cart it",
  "id": "search-bar-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Verify user should able to search laptop and add to cart successfully",
  "description": "",
  "id": "search-bar-functionality;verify-user-should-able-to-search-laptop-and-add-to-cart-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I search for \u0027Laptop\u0027 in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should find the \"\u003cLAPTOP\u003e\" by its names",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Product description to open product",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select qty from Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can verify \u0027Added to Cart\u0027 word",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "search-bar-functionality;verify-user-should-able-to-search-laptop-and-add-to-cart-successfully;",
  "rows": [
    {
      "cells": [
        "LAPTOP"
      ],
      "line": 19,
      "id": "search-bar-functionality;verify-user-should-able-to-search-laptop-and-add-to-cart-successfully;;1"
    },
    {
      "cells": [
        "ASUS L410 MA-DB04 Ultra Thin Laptop, 14” FHD Display, Intel Celeron N4020 Processor, 4GB RAM, 128GB Storage, NumberPad, Windows 10 Home in S Mode, Star Black"
      ],
      "line": 20,
      "id": "search-bar-functionality;verify-user-should-able-to-search-laptop-and-add-to-cart-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5916992100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "LaptopTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 173434400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify user should able to search laptop and add to cart successfully",
  "description": "",
  "id": "search-bar-functionality;verify-user-should-able-to-search-laptop-and-add-to-cart-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I search for \u0027Laptop\u0027 in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should find the \"ASUS L410 MA-DB04 Ultra Thin Laptop, 14” FHD Display, Intel Celeron N4020 Processor, 4GB RAM, 128GB Storage, NumberPad, Windows 10 Home in S Mode, Star Black\" by its names",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Product description to open product",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select qty from Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can verify \u0027Added to Cart\u0027 word",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopTestSteps.iSearchForLaptopInSearchBar()"
});
formatter.result({
  "duration": 189078500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopTestSteps.iClickOnSearchButton()"
});
formatter.result({
  "duration": 2032452200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ASUS L410 MA-DB04 Ultra Thin Laptop, 14” FHD Display, Intel Celeron N4020 Processor, 4GB RAM, 128GB Storage, NumberPad, Windows 10 Home in S Mode, Star Black",
      "offset": 19
    }
  ],
  "location": "LaptopTestSteps.iShouldFindTheByItsNames(String)"
});
formatter.result({
  "duration": 7996447200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopTestSteps.clickOnProductDescriptionToOpenProduct()"
});
formatter.result({
  "duration": 20900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopTestSteps.iSelectQtyFromDropdown()"
});
formatter.result({
  "duration": 541126600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopTestSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 933525900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopTestSteps.iCanVerifyAddedToCartWord()"
});
formatter.result({
  "duration": 2083947500,
  "status": "passed"
});
formatter.after({
  "duration": 821294000,
  "status": "passed"
});
});