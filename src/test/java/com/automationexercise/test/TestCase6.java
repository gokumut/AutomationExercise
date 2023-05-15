package com.automationexercise.test;

import com.automationexercise.pages.ContactPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignLoginPage;
import com.automationexercise.utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestCase6 extends TestBase{
    @Test
    public void testcase6() {

        SignLoginPage signLoginPage = new SignLoginPage();
        LoginPage loginPage = new LoginPage();
        HomePage homePage=new HomePage();
        ContactPage contactPage=new ContactPage();

        extentLogger = report.createTest("Contact Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Click on 'Contact Us' button");
        homePage.contactUsBtn.click();
        extentLogger.info("Verify 'GET IN TOUCH' is visible");
        BrowserUtils.verifyElementDisplayed(contactPage.getInTouchText);
        extentLogger.info("Enter name, email, subject and message");
        contactPage.setGetInTouch();
        extentLogger.info(" Upload file");
        contactPage.contactFileUpload();
        extentLogger.info(" Click 'Submit' button");
        BrowserUtils.clickWithJS(contactPage.submitBtn);
        extentLogger.info(" Click 'Ok' button");
        Alert alert=driver.switchTo().alert();
        alert.accept();
        extentLogger.info("Verify success message 'Success! Your details have been submitted successfully.' is visible");
        BrowserUtils.verifyElementDisplayed(contactPage.contactSuccesText);
        extentLogger.info(" Click 'Home' button and verify that landed to home page successfully");
        contactPage.homeBtn.click();










    }
}
