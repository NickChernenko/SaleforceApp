package pages;

import driver_config.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BasePage {


    protected static WebElement $(By by) {

        return DriverManager.getDriver().findElement(by);
    }

    public List<WebElement> $$(By by) {

        return DriverManager.getDriver().findElements(by);

    }

}






