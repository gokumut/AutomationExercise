package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.SignLoginPage;
import com.automationexercise.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class TestCase3 extends TestBase{
    @Test
    public void testcase3(){
        HomePage homePage=new HomePage();
        SignLoginPage signLoginPage= new SignLoginPage();

        extentLogger=report.createTest("Negative Login Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Click on signUp/login button");
        homePage.loginBtn.click();
        extentLogger.info("Verify 'Login to your account' is visible");
        BrowserUtils.verifyElementDisplayed(signLoginPage.loginText);
        extentLogger.info("Enter incorrect email address and password");
        signLoginPage.logIn();
        extentLogger.info("Verify error 'Your email or password is incorrect!' is visible");
        BrowserUtils.verifyElementDisplayed(signLoginPage.loginErrorText);
    }
}
