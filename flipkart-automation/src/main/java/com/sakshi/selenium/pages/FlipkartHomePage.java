package com.sakshi.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartHomePage {

    WebDriver driver;

    //Constructor
    public FlipkartHomePage(WebDriver driver){

        this.driver = driver;
    }

    //Locators
    By searchBox = By.name("q");
    By searchButton = By.cssSelector("button[type='submit']");

    //Actions
    public void searchForProduct(String productName){

        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

}
