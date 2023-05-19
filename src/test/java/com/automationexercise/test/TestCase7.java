package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.TestCasesPage;
import com.automationexercise.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class TestCase7 extends TestBase{
    @Test
    public void testcase7(){
        HomePage homePage=new HomePage();
        TestCasesPage testCasesPage=new TestCasesPage();
        ProductsPage productsPage=new ProductsPage();

        extentLogger=report.createTest("Test Case Page Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Click on 'Test Cases' button");
        homePage.testCaseBtn.click();
        extentLogger.info("Verify user is navigated to test cases page successfully");
        driver.switchTo().frame("aswift_6");
        BrowserUtils.waitFor(2);
        driver.switchTo().frame("ad_iframe");
        productsPage.advBtn.click();
        BrowserUtils.verifyElementDisplayed(testCasesPage.testCasesText);
    }
}
