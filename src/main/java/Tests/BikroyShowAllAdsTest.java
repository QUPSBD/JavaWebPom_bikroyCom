package Tests;

import Pages.BikroyHomePage;
import Pages.BikroyLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BikroyShowAllAdsTest {


    WebDriver webDriver;

    BikroyLoginPage bikroyLoginPage;
    BikroyHomePage bikroyHomePage;

    @BeforeClass
    void setUp(){

       /* BaseTest baseTest = new BaseTest();
        baseTest.initialization();*/
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://bikroy.com/");
        webDriver.manage().window().maximize();

    }



   /* @Test(priority = 1)
    void  clickContinueButtonWithEmail(){

        bikroyHomePage = new BikroyHomePage(webDriver);
        bikroyHomePage.enterLoginButton();
        bikroyHomePage.enterContinueWithEmailButton();

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        bikroyLoginPage = new BikroyLoginPage(webDriver);
        bikroyLoginPage.enterUsername("ashiq.qups@gmail.com");
        bikroyLoginPage.enterPassword("Asdfgh12345");

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bikroyLoginPage.enterLoginToDashboard();


    }*/


    @org.testng.annotations.Test(priority = 1)
    void verifyAllAds(){



        bikroyHomePage = new BikroyHomePage(webDriver);
        bikroyHomePage.enterAllAdsButton();

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(bikroyHomePage.getCurrentUrl(),"https://bikroy.com/en/ads");


    }


    @AfterClass
    void tearDown(){
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.quit();
    }
}
