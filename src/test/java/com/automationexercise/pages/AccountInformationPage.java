package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage extends BasePage {
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement selectDay;

    @FindBy(xpath = "//select[@id='months']")
     public WebElement selectMonth;

    @FindBy(xpath = "//select[@id='years']")
     public WebElement selectYear;

    @FindBy (xpath ="//input[@id='newsletter']")
    public WebElement newsletterBtn;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstnameBtn;

    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement lastNameBtn;

    @FindBy (xpath = "//select[@id='country']")
    public WebElement countryCheckBox;

    @FindBy (xpath = "//input[@id='address1']")
    public WebElement adresseBtn;

    @FindBy (xpath = "//input[@id='state']")
    public WebElement stateBtn;

    @FindBy (xpath = "//input[@id='city']")
    public WebElement cityBtn;

    @FindBy (xpath = "//input[@id='zipcode']")
    public WebElement zipCodeBtn;

    @FindBy (xpath = "//input[@id='mobile_number']")
    public WebElement phoneBtn;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement createAccountBtn;

    @FindBy (xpath = "(//*[.='Continue'])[2]")
    public WebElement continueBtn;


    public void setEnterAccountInformation(String password, String dayInput, String monthInput, String yearInput) {
        Select day = new Select(selectDay);

        Select month=new Select(selectMonth);

        Select year=new Select(selectYear);

        inputPassword.sendKeys(password);
       BrowserUtils.waitFor(1);
       day.selectByVisibleText(dayInput);
       month.selectByVisibleText(monthInput);
       year.selectByVisibleText(yearInput);
    }

    public void setAdresseInformation(){
        Select country=new Select(countryCheckBox);
        firstnameBtn.sendKeys("marquis");
        lastNameBtn.sendKeys("hazretleri");
        adresseBtn.sendKeys("LA");
        country.selectByVisibleText("Israel");
        stateBtn.sendKeys("LA");
        cityBtn.sendKeys("Ca");
        zipCodeBtn.sendKeys("12");
        phoneBtn.sendKeys("34");
        createAccountBtn.click();
        continueBtn.click();

    }

}

