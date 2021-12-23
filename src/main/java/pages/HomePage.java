package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private static By profileTab = By.xpath("//img[@title='User']");

    public HomePage(WebDriver driverToSet) {
        this.driver = driverToSet;
    }

    private WebElement $(By by) {
        return driver.findElement(by);
    }


    public boolean loggedIn() {
        if ($(profileTab).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


}