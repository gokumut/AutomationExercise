package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage{

    @FindBy(xpath = " //b[text()='Test Cases']")
    public WebElement testCasesText;

}
