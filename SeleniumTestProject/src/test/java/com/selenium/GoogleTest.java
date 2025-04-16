package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void testGoogleHomePage() {
        // Set the path for ChromeDriver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankitkumar yadav\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google's homepage
        driver.get("https://www.google.com");

        // Verify the title of the page
        Assert.assertTrue(driver.getTitle().contains("Google"));

        // Close the browser
        driver.quit();
    }
}