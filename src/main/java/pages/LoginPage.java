package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private WebDriver driver;


    private final By username = By.xpath("//input[@type='email']");
    private final By password = By.id("password");
    private final By loginButton = By.name("Login");
    private final By loginError = By.xpath(("//*[text()[contains(.,'Please ')]]"));


    // TODO: 22.12.2021 Create method which will return text of login error. Fix null pointer exception


    public LoginPage(WebDriver driverToSet) {
        this.driver = driverToSet;
    }

    private WebElement $(By by) {
        return driver.findElement(by);
    }


    public void enterPassword(String s) {
        $(password).sendKeys(s);

    }


    public void enterUsername(String s) {
        $(username).sendKeys(s);
    }


    public void login() {
        $(loginButton).click();

    }


}
