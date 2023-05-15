package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{
    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchText;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputName;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement inputSubject;
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement textArea;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileUploadBtn;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[.='Success! Your details have been submitted successfully.']")
    public WebElement contactSuccesText;

    @FindBy(xpath = "(//*[.=' Home'])[3]")
    public WebElement homeBtn;

    public void setGetInTouch() {
        inputName.sendKeys("marquis");
        inputEmail.sendKeys("marquis1@gmail.com");
        inputSubject.sendKeys("contact");
        textArea.sendKeys("hello goodbye hello");
    }
    public void contactFileUpload() {
      fileUploadBtn.sendKeys("C:\\Users\\User\\IdeaProjects\\AutomationExercise\\src\\test\\resources\\contactpagetext.txt");
    }
}
