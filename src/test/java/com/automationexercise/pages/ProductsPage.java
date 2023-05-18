package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//*[.='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement advBtn;

    @FindBy(xpath = "//iframe[@title='Advertisement']")
    public WebElement frameAdvBtn;

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public List<WebElement> productList;

    @FindBy(xpath = "//a[.='View Product'][1]")
    public WebElement viewFirstProductBtn;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement productInformation;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement submitSearchBtn;


    public void searchProduct(String product) {
        searchInput.sendKeys(product);
        submitSearchBtn.click();
    }

    public void showProductList() {

        for (int i = 1; i < productList.size(); i++) {
            WebElement product = productList.get(i);
            Assert.assertTrue(product.isDisplayed());
        }


    }
}





