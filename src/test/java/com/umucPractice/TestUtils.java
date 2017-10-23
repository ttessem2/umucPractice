package com.umucPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestUtils {
public static WebDriver getDriver (String url) {
    System.setProperty("webdriver.chrome.driver", "/Users/sbandara/Downloads/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
}
}
