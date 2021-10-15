package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class Test {

    WebDriver webDriver;

    @BeforeClass
    void setUp(){

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get("https://bikroy.com/en");

        webDriver.manage().window().maximize();
    }

    @org.testng.annotations.Test(priority = 1)
    void loginPresence(){

        webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/nav/div/ul[1]/li[1]/div/a"));


    }


    @org.testng.annotations.Test(priority = 2)
    void loginTest(){
        Assert.assertEquals(webDriver.getTitle(),"Rokomari");

    }


    @org.testng.annotations.Test(priority = 3)
    void registrationTest(){
        throw new SkipException("Skipping Tests.Test");


    }


    @AfterClass
    void tearDown(){

        webDriver.quit();
    }
}

