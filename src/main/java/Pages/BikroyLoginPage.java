package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BikroyLoginPage {


    WebDriver webDriver;



    //By bikroyLoginBtn1 = By.className("header-link--woAbP title--1NHWk gtm-login-click active");
    By continueWithEmail = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]");
    //By continueWithEmail1 = By.className("btn--1gFez secondary--Os-e9 background--2lR9B small--1MQ15 button--eCUEQ");
    By emailInput = By.xpath("//input[@id='input_email']");
    By passInput = By.xpath("//input[@id='input_password']");
    By finalLoginBtn = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/form/div[2]/div/button");
    By searchBar = By.className("search-input--PtfH8");
    By searchBtn = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div/form/div/button");
    By searchBtn1 = By.className("search-button-container--Ur5ku gtm-home-search-click");
    By searchResult = By.className("heading--2eONR undefined ad-list-header--3g7Pb block--3v-Ow");
    By errorMgs = By.className("error-msg--2buvb");


    public BikroyLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }




    //Method to enter username
    public void enterUsername(String user) {
        webDriver.findElement(emailInput).sendKeys(user);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        webDriver.findElement(passInput).sendKeys(pass);
    }


    //Method to click login button
    public void enterLoginToDashboard() {
        webDriver.findElement(finalLoginBtn).click();
    }

    public  String  getErrorMessage(){
        return webDriver.findElement(errorMgs).getText();
    }




}
