package com.amazon.cucumber.steps;

import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileTestSteps {
    @When("^I search for 'Mobile Phone' in search bar$")
    public void iSearchForMobilePhoneInSearchBar() {
        new HomePage().textToSearchBar("Mobile Phone");
    }

    @And("^I select quantity from Dropdown$")
    public void iSelectQuantityFromDropdown() {
        new ProductPage().selectQtyFromDropDown("2");
    }

    @Then("^I can verify 'Added to Cart' word for MobilePhone$")
    public void iCanVerifyAddedToCartWordForMobilePhone() throws InterruptedException {
        Thread.sleep(1000);
        new ProductPage().verifyMobileAddToCartMessage("Added to Cart");
    }
}
