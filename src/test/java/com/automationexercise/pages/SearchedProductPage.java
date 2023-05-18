package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class SearchedProductPage extends BasePage{
    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductText;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> searchedProductList;

    public void showSearchedProductList() {

        for (int i = 0; i < searchedProductList.size(); i++) {
            WebElement product = searchedProductList.get(i);
            Assert.assertTrue(product.isDisplayed());
        }
}
}
