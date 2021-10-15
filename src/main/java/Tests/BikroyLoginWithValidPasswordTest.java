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

public class BikroyLoginWithValidPasswordTest {




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
    void verifyLoginWithValidCredentials(){



        bikroyHomePage = new BikroyHomePage(webDriver);
        bikroyHomePage.enterLoginButton();
        bikroyHomePage.getCurrentUrl();
        bikroyHomePage.enterContinueWithEmailButton();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        bikroyLoginPage = new BikroyLoginPage(webDriver);
        bikroyLoginPage.enterUsername("ashiq.qups@gmail.com");
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        bikroyLoginPage.enterPassword("Asdfgh123456");
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        bikroyLoginPage.enterLoginToDashboard();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(bikroyHomePage.getCurrentUrl(),"https://bikroy.com/?login-modal=true&redirect-url=/");


    }


    @AfterClass
    void tearDown(){
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.quit();
    }
}
