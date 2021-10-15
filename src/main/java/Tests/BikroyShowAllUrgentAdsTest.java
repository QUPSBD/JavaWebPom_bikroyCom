package Tests;

import Pages.BikroyAllAdsPage;
import Pages.BikroyHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BikroyShowAllUrgentAdsTest {


    WebDriver webDriver;


    BikroyAllAdsPage bikroyAllAdsPage;
    BikroyHomePage bikroyHomePage;

    @BeforeClass
    void setUp(){

       /* BaseTest baseTest = new BaseTest();
        baseTest.initialization();*/
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


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
    void verifyAllUrgentAds(){



        bikroyAllAdsPage = new BikroyAllAdsPage(webDriver);

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        bikroyAllAdsPage.enterToClickUrgentAds();


        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        bikroyAllAdsPage.getCurrentUrl();

        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(bikroyAllAdsPage.getCurrentUrl(),"https://bikroy.com/en/ads/bangladesh?sort=date&order=desc&buy_now=0&urgent=1&page=1");


    }


    @AfterClass
    void tearDown(){
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.quit();
    }
}
