package com.umucPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CostCalculator {
    private WebDriver driver;
    public CostCalculator (WebDriver driver) { this.driver = driver; }

    public String getTitle() {
        WebElement title = driver.findElement(By.xpath("/html/head/title"));
        return title.getText();}

    public String getDegreeLevelTitle(){
        WebElement title = driver.findElement(By.xpath)
    }




    }
