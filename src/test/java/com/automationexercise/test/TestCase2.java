package com.automationexercise.test;


import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignLoginPage;

import com.automationexercise.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class TestCase2 extends TestBase {
    @Test
    public void testcase2(){
        HomePage homePage=new HomePage();
        SignLoginPage signLoginPage=new SignLoginPage();
        LoginPage loginPage=new LoginPage();
        homePage.loginBtn.click();
        signLoginPage.logIn();
        BrowserUtils.waitFor(2);
        loginPage.verifyLogin();
       //loginPage.deleteAccount();
    }
}
