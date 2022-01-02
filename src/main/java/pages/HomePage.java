package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    private static final By searchButton = By.xpath("//button[@aria-label='Search']");
    private final By appLauncher = By.xpath("//div[@class='slds-icon-waffle']");
    private final By viewAllAppButton = By.xpath("//button[@type='button' and @aria-label='View All Applications']");
    private final By searchAppField = By.xpath("//input[@type='search' and @placeholder='Search apps or items...']");
    private final By allAppsList = By.xpath("//lightning-accordion-section//ul/li");



    public void getElement() {
        List<WebElement> elements = $$(allAppsList);
        for (WebElement e : elements) {

        }
    }


    public static boolean isLoginSuccessful() {

        return $(searchButton).isDisplayed();
    }


    public HomePage openAppMenu() {
        $(appLauncher).click();
        return this;
    }

    public HomePage viewAllApp() {
        $(viewAllAppButton).click();
        return this;


    }

}

