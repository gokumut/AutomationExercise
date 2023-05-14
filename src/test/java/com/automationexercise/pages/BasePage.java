package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.ConfigurationReader;
import com.automationexercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//a[text()=' Home']")
    public WebElement homePageBtn;

   @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement loginBtn;
}


