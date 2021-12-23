package pages;

import driver_config.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BasePage {


    protected static WebElement $(By by) {

        return DriverManager.getDriver().findElement(by);
    }
}
