package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.text.html.CSS;

public class BikroyAllAdsPage {

    WebDriver webDriver;
    //Page URL
    private static String PAGE_URL="https://bikroy.com/en/ads";



    By urgentBtn = By.xpath("(//label [@class=\"label-wrapper--2lPMv\"])[2]");
    By locationBtn = By.xpath("(//div [@class=\"link--15vLF item--4DkSa\"])[18]");

    public BikroyAllAdsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(PAGE_URL);
    }
    // Method to get Urgent Ads
    public void enterToClickUrgentAds(){

        webDriver.findElement(urgentBtn).click();
    }

    // Method to get Current Page Url
    public String getCurrentUrl(){
        return webDriver.getCurrentUrl();
    }

    // Method to get Dhaka Division Adds
    public void enterToClickShowLocationAds(){
        webDriver.findElement(locationBtn).click();
    }
}
