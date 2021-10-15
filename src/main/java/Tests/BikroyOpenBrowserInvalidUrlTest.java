package Tests;

import Pages.BikroyHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BikroyOpenBrowserInvalidUrlTest {


    WebDriver webDriver;
    BikroyHomePage bikroyHomePage;

    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://bikroy.net/");
    }




    @org.testng.annotations.Test(priority = 3)
    public void verifyPageUrl(){

        bikroyHomePage = new BikroyHomePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(bikroyHomePage.getCurrentUrl(),"null");
    }



    @AfterClass
    void tearDown(){

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.quit();
    }
}
