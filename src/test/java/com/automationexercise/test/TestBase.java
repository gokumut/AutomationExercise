package com.automationexercise.test;


import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.ConfigurationReader;
import com.automationexercise.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest(){
        report =new ExtentReports();
        String projectpath=System.getProperty("user.dir");
        String path=projectpath+"/test-output/report.html";
        htmlReporter=new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Amazon E2E test");
        report.setSystemInfo("Environment","e comers web site");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
        report.setSystemInfo("Test Engineer","Derwish");
    }
    @AfterTest
    public void tearDownTest(){
        report.flush();
    }
    @BeforeMethod
    public void setUp(){
        driver= Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));
        actions=new Actions(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException, InterruptedException {

        if (result.getStatus()==ITestResult.FAILURE){
            extentLogger.fail(result.getName());
            String screenShotPath= BrowserUtils.getScreenshot(result.getName());
            extentLogger.addScreenCaptureFromPath(screenShotPath);
            extentLogger.fail(result.getThrowable());
        }
        Thread.sleep(2000);
        //Driver.closeDriver();

    }
}
