package com.inetBanking.testCases;

import org.apache.logging.log4j.LogManager;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.LoggerContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.log4j.Logger;

import java.io.File;


public class BaseClass {

    public String baseURL="http://demo.guru99.com/v4/index.php";
    public String username="mngr482422";
    public String password="etanahy";
    public static WebDriver driver;

    public static Logger logger;

    @BeforeClass
    public void setUp(){
//        System.setProperty("Webdriver.chrome.driver","/home/oguntoyinbo/Documents/Selenium/inetBankingV1/Drivers/chromedriver");
//        System.out.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");

        driver=new ChromeDriver();

        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        context.setConfigLocation(new File("/home/oguntoyinbo/Documents/Selenium/inetBankingV1/Log4j.properties").toURI());
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
