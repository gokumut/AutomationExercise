package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignLoginPage;
import com.automationexercise.utilities.BrowserUtils;
import org.testng.annotations.Test;


public class TestCase5 extends TestBase {
    @Test
    public void testcase5() {
        HomePage homePage = new HomePage();
        SignLoginPage signLoginPage = new SignLoginPage();
        LoginPage loginPage = new LoginPage();

        extentLogger = report.createTest("Negative Sign Up Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Click on signUp/login button");
        homePage.loginBtn.click();
        extentLogger.info("Verify 'New User Signup!' is visible");
        BrowserUtils.verifyElementDisplayed(signLoginPage.signUpText);
        extentLogger.info("Enter name and already registered email address and click sign up button");
        signLoginPage.signUp("marquis","marquis1@gmail.com");
        extentLogger.info(" Verify error 'Email Address already exist!' is visible");
        BrowserUtils.verifyElementDisplayed(signLoginPage.signUpErrorText);
    }
}
