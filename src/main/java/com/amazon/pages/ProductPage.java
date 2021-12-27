package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='quantity']")
    WebElement selectQty;

    @CacheLookup
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    WebElement mobileAddToCartMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@id='attachDisplayAddBaseAlert']//h4[@class='a-alert-heading'][normalize-space()='Added to Cart']")
    WebElement laptopAddToCartMessage;

    public void selectQtyFromDropDown(String text) {
        selectByValueFromDropDown(selectQty, text);
        log.info("Select Qty: " + text + selectQty.getText());
    }

    public void clickAddToCart() {
        log.info("Clicking on Add to Cart: " + addToCart.getText());
        clickOnElement(addToCart);
    }

    public void verifyLaptopAddToCartMessage(String text) throws InterruptedException {
        Thread.sleep(1000);
        String actualString = getTextFromElement(laptopAddToCartMessage);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.contains((text)));
        log.info("Verify Add to cart message: " + text + laptopAddToCartMessage.getText());
    }

    public void verifyMobileAddToCartMessage(String text) {
        String actualString = getTextFromElement(mobileAddToCartMessage);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.contains((text)));
        log.info("Verify Add to cart message: " + text + mobileAddToCartMessage.getText());
    }

}
