package com.automationexercise.pages;

import com.automationexercise.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignLoginPage extends BasePage{
    @FindBy (xpath = "//input[@type='text']")
    public WebElement nameInPut;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailInput;

    @FindBy(xpath = "//*[.='Signup']")
    public WebElement signUpBtn;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement loginEmailBtn;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement loginPasswordBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy (xpath ="// h2[.='Login to your account']")
    public WebElement loginText;

    @FindBy (xpath ="//p[text()='Your email or password is incorrect!']")
    public WebElement loginErrorText;



    public void signUp (String name,String email){
        nameInPut.sendKeys(name);
        emailInput.sendKeys(email);
        signUpBtn.click();
    }

    public void logIn() {
        loginEmailBtn.sendKeys(ConfigurationReader.get("email"));
       loginPasswordBtn.sendKeys(ConfigurationReader.get("password"));
       submitBtn.click();
    }
}
