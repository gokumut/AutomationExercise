package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignLoginPage;
import com.automationexercise.utilities.BrowserUtils;
import com.google.common.base.Verify;
import org.testng.annotations.Test;

public class TestCase4 extends TestBase{
    @Test
    public void testcase4(){
        HomePage homePage=new HomePage();
        SignLoginPage signLoginPage= new SignLoginPage();
        LoginPage loginPage=new LoginPage();

        extentLogger=report.createTest("Logout Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Click on signUp/login button");
        homePage.loginBtn.click();
        extentLogger.info("Verify 'Login to your account' is visible");
        BrowserUtils.verifyElementDisplayed(signLoginPage.loginText);
        extentLogger.info("Enter correct email address and password and login");
        signLoginPage.logIn();
        extentLogger.info("Verify that 'Logged in as username' is visible");
        loginPage.verifyLogin();
        extentLogger.info("Click 'Logout' button");
        loginPage.logoutBtn.click();
        extentLogger.info(" Verify that user is navigated to login page");
        BrowserUtils.verifyElementDisplayed(signLoginPage.loginText);
    }
}
