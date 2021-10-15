package Tests;

import Pages.BikroyHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BikroyAdsSearchTest {


    WebDriver webDriver;
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
    public void verifySearchAdsFunction(){



        bikroyHomePage = new BikroyHomePage(webDriver);

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        bikroyHomePage.typeOnSearch("Dell Laptop");


        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        bikroyHomePage.enterToSearch();

        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(bikroyHomePage.getCurrentUrl(),"https://bikroy.com/en/ads?query=Dell%20Laptop");


    }


    @AfterClass
    void tearDown(){
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.quit();
    }
}
