package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    WebElement resultPage;

    public void confirmNavigateToPage(String text) {
        String actualString = getTextFromElement(resultPage);
        Assert.assertTrue(actualString.contains((text)));
        log.info("Confirming Page Navigate to Laptop: " + text + resultPage.getText());
    }

    public void clickOnProduct(String product) throws InterruptedException {
        boolean isPresent = false;

        int totalPages = 20; //number of pages
        for (int i = 0; i < totalPages; i++) {
            System.out.println("Page: " + (i + 1));
            System.out.println(driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).size());
            for (WebElement name : driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"))) {
                Thread.sleep(500);
                System.out.println(name.getText().equalsIgnoreCase(product));
                if (name.getText().equalsIgnoreCase(product)) {
                    Thread.sleep(1000);
                    name.click();
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                Thread.sleep(1000);
                clickOnElement(driver.findElement(By.xpath("//a[text()='Next']")));
            } else {
                break;
            }
        }
    }
}
