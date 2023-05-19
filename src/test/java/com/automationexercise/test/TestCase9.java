package com.automationexercise.test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.SearchedProductPage;
import com.automationexercise.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class TestCase9 extends TestBase {
    @Test
    public void testbase9() {
        HomePage homePage = new HomePage();
        ProductsPage productsPage = new ProductsPage();
        SearchedProductPage searchedProductPage = new SearchedProductPage();

        extentLogger = report.createTest("Search Product Test");
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
        extentLogger.info("Enter product name in search input and click search button");
        productsPage.searchProduct("top");
        extentLogger.info("Verify 'SEARCHED PRODUCTS' is visible");
        BrowserUtils.verifyElementDisplayed(searchedProductPage.searchedProductText);
        extentLogger.info("Verify all the products related to search are visible");
        searchedProductPage.showSearchedProductList();
    }
}
