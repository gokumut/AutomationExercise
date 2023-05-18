package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.SignLoginPage;
import com.automationexercise.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class TestCase8 extends TestBase{
    @Test
    public void testcase8(){
        HomePage homePage=new HomePage();
        ProductsPage productsPage=new ProductsPage();

        extentLogger=report.createTest("Product Test");
        extentLogger.info("Verify that home page is visible succesfully");
        BrowserUtils.verifyElementDisplayed(homePage.homePageBtn);
        extentLogger.info("Click on 'Products' button");
        homePage.productBtn.click();
        extentLogger.info("Verify user is navigated to ALL PRODUCTS page successfully");
        driver.switchTo().frame("aswift_5");
        BrowserUtils.waitFor(2);
        driver.switchTo().frame("ad_iframe");
        productsPage.advBtn.click();
        BrowserUtils.verifyElementDisplayed(productsPage.allProductsText);
        extentLogger.info("The products list is visible");
        productsPage.showProductList();
        extentLogger.info("Click on 'View Product' of first product");
        BrowserUtils.clickWithJS(productsPage.viewFirstProductBtn);
        extentLogger.info("Verify that detail detail is visible: product name, category, price, availability, condition, brand");
        System.out.println("productsPage.productInformation.getText() = " + productsPage.productInformation.getText());
    }
}
