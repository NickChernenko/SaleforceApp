package pages;

import driver_config.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public abstract class BasePage {


    protected WebElement $(By by){

        return DriverManager.getDriver().findElement(by);
    }
}
