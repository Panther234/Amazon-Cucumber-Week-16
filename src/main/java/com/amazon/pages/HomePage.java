package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBar;

    @CacheLookup
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchButton;

    public void textToSearchBar(String text) {
        sendTextToElement(searchBar, text);
        log.info("Send text to Search Bar: " + searchBar.getText());
    }

    public void clickSearchButton() {
        log.info("Clicking to Search button: " + searchButton.getText());
        clickOnElement(searchButton);
    }

}
