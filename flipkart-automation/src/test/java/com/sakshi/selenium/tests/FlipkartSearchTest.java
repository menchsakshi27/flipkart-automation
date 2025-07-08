package com.sakshi.selenium.tests;

import com.sakshi.selenium.pages.FlipkartHomePage;
import com.sakshi.selenium.utils.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class FlipkartSearchTest {

    WebDriver driver = new ChromeDriver();
    FlipkartHomePage homePage;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","D:\\Sakshi Java Projects\\Selenium Projects\\flipkart-automation\\flipkart-automation\\chromedriver.exe");
        TestListener.driver = driver;
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        homePage = new FlipkartHomePage(driver);

        //Close login popup

        try{
//            Close login popup
            driver.findElement(By.cssSelector("div.H6-NpN._3N4_BX")).click();
        }
        catch (Exception e){

            System.out.println("Pop up not found");
        }

    }

    @Test
    public void searchBluetoothHeadphone() throws InterruptedException{

        homePage.searchForProduct("Bluetooth Headphones");
//        Sleep to let the result load
        Thread.sleep(3000);
        System.out.println("Search completed");

    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
