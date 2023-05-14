package com.automationexercise.pages;

import com.automationexercise.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//*[.='marquis']/..")
    public WebElement welcomeText;

    @FindBy(css = "[href=\"/delete_account\"]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutBtn;



    public void verifyLogin(){
        Assert.assertTrue(welcomeText.getText().contains(ConfigurationReader.get("username")));
    }
    public void deleteAccount(){
        deleteBtn.click();
    }
}
