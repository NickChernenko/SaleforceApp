package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

    public WebDriver driver;


    private final By username = By.xpath("//input[@type='email']");
    private final By password = By.id("password");
    private final By loginButton = By.name("Login");
    private final By loginError = By.xpath(("//*[text()[contains(.,'Please ')]]"));


    public By getUsername() {
        return username;
    }


    public By getPassword() {
        return password;
    }


    public By getLoginButton() {
        return loginButton;
    }

    public By getLoginError() {
        return loginError;
    }

    public LoginPage(WebDriver driverToSet) {
        super();
        this.driver = driverToSet;
    }

    @Override
    protected WebElement $(By by) {
        return driver.findElement(by);
    }


    public void enterPassword(String s) {
        $(getPassword()).sendKeys(s);

    }




    public void enterUsername(String s) {
        $(getUsername()).sendKeys(s);
    }


    public void login() {
        $(getLoginButton()).click();

    }
    public String getLoginErrorText() {
        return $(getLoginError()).getText();
    }
}
