package com.amazon.cucumber.steps;

import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import com.amazon.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopTestSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
    }

    @When("^I search for 'Laptop' in search bar$")
    public void iSearchForLaptopInSearchBar() {
        new HomePage().textToSearchBar("Laptop");
    }

    @And("^I click on Search button$")
    public void iClickOnSearchButton() {
        new HomePage().clickSearchButton();
    }

    @And("^I should find the \"([^\"]*)\" by its names$")
    public void iShouldFindTheByItsNames(String laptop) throws InterruptedException  {
        Thread.sleep(1000);
        new ResultPage().clickOnProduct(laptop);
    }

    @And("^Click on Product description to open product$")
    public void clickOnProductDescriptionToOpenProduct() {
    }

    @And("^I select qty from Dropdown$")
    public void iSelectQtyFromDropdown() {
        new ProductPage().selectQtyFromDropDown("3");
    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickAddToCart();
    }

    @Then("^I can verify 'Added to Cart' word$")
    public void iCanVerifyAddedToCartWord() throws InterruptedException {
        Thread.sleep(1000);
        new ProductPage().verifyLaptopAddToCartMessage("Added to Cart");
    }

}
