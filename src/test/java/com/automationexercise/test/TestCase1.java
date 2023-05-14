package com.automationexercise.test;

import com.automationexercise.pages.AccountInformationPage;
import com.automationexercise.pages.HomePage;

import com.automationexercise.pages.SignLoginPage;
import com.automationexercise.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends TestBase{

    @Test
    public void testcase1(){
        HomePage homePage=new HomePage();
        SignLoginPage signLoginPage=new SignLoginPage();
        AccountInformationPage accountInformationPage= new AccountInformationPage();
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        homePage.loginBtn.click();
        BrowserUtils.waitFor(1);
        signLoginPage.signUp("marquis","marquis1@gmail.com");
        BrowserUtils.waitFor(1);
        Assert.assertTrue(accountInformationPage.enterAccountInformationText.isDisplayed());
        accountInformationPage.setEnterAccountInformation("test123","5","October","1988");
        BrowserUtils.scrollToElement(accountInformationPage.newsletterBtn);
        accountInformationPage.newsletterBtn.click();
        accountInformationPage.setAdresseInformation();
        BrowserUtils.verifyElementDisplayed(By.xpath("(//*[.='Account Created!'])[2]"));

    }
}
