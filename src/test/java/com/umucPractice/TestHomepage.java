package com.umucPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
public class TestHomepage {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setup() throws Exception{
        driver = TestUtils.getDriver("http://www.umuc.edu/index.cfm" );
        homePage = new HomePage(driver);
    }
    @Test
    public void testTitle() {
        assertEquals ("Accredited Online College | UMUC", homePage.getTitle());}

        @After
    public void close(){
        driver.quit();
        }
}
