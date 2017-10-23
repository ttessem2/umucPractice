package com.umucPractice;

import org.junit.Before;
import org.junit.After;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
public class TestCostCalculator {
private WebDriver driver;
private CostCalculator costCalculator;

@Before
    public void setup() throws Exception{
    driver = TestUtils.getDriver("http://author-new-qa.umuc.edu/current-students/cost-calculator.cfm");
    costCalculator = new CostCalculator(driver);
}
@Test
    public void testTitle() {}

}
