package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // IMPORTANT: DO NOT set snap path
        options.setBinary("/usr/bin/chromium");

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
