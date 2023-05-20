package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class TestCase10 extends TestBase{
    @Test
    public void testcase10(){
        HomePage homePage=new HomePage();

        extentLogger=report.createTest("Subscription Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Scroll down to footer and verify text 'SUBSCRIPTION'");
        BrowserUtils.scrollToElement(homePage.subscriptionText);
        BrowserUtils.verifyElementDisplayed(homePage.subscriptionText);
        extentLogger.info("Enter email address in input ");
        homePage.inputSubscriptionEmail.sendKeys(ConfigurationReader.get("email"));
        extentLogger.info("Click arrow button");
        homePage.subscriptionArrowBtn.click();
    }
}
