package com.sakshi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlipkart {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","D:\\Sakshi Java Projects\\Selenium Projects\\flipkart-automation\\flipkart-automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
        try{
//            Close login popup
            driver.findElement(By.cssSelector("div.H6-NpN._3N4_BX")).click();
        }
        catch (Exception e){

            System.out.println("Pop up not found");
        }

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Boat Bluetooth headphones");
        searchBox.submit();

//        Sleep to let the result load
        Thread.sleep(3000);
//        Sample: click first product (may need to adjust the selector)
            WebElement firstProduct = driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/612/612/xif0q/headphone/f/s/e/-original-imagzuzzgteshegg.jpeg?q=70']"));
            firstProduct.click();

    }
}