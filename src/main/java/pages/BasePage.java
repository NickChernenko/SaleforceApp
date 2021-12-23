package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    public WebDriver driver;


    protected BasePage() {

    }


    protected abstract WebElement $(By by);
}
