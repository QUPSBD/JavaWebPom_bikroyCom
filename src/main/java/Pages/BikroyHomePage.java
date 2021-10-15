package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BikroyHomePage  {


    WebDriver webDriver;

    By searchBar = By.className("search-input--PtfH8");
    By searchBtn = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div[2]/div/form/div/button");
    By loginBtn = By.xpath("//body/div[@id='app-container']/div[@id='app-wrapper']/div[2]/div[3]/div[1]/nav[1]/div[1]/ul[2]/li[2]/div[1]/a[1]");
    By loginBtn1 = By.className("btn--1gFez default--T8kE3 small--1MQ15 search-button--1_VmY gtm-home-search-click");
    By allAdBtn = By.linkText("All ads");
    By continueWithEmail = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]");
    By getLoginBtn = By.xpath("(//a[@aria-label=\"Login\"])[2]");

    By firstProduct = By.xpath("(//div [@class=\"container--2uFyv\"])[1]");



    public BikroyHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get("https://bikroy.com/en/");
    }




    // Method to get Home Page Tittle
    public String getHomePageTitle(){
        return webDriver.getTitle();
    }


    // Method to get currentPageUrl
    public String getCurrentUrl(){
        return webDriver.getCurrentUrl();
    }


    //Method to enter Search Text
    public void typeOnSearch(String searchText) {
        webDriver.findElement(searchBar).sendKeys(searchText);
    }

    //Method to enter Search Button
    public void enterToSearch() {
        webDriver.findElement(searchBtn).click();
    }

    //Method to enter Login Button
    public void enterLoginButton() {
        webDriver.findElement(getLoginBtn).click();
    }

    //Method to enter All Ads To show ads
    public void enterAllAdsButton() {

        webDriver.findElement(allAdBtn).click();
    }


    //Method to enter Continue with email
    public void enterContinueWithEmailButton() {
        webDriver.findElement(continueWithEmail).click();
    }


    // Method to enter to See Product Details
    public void enterToClickProductDetails(){
        webDriver.findElement(firstProduct).click();
    }

}
