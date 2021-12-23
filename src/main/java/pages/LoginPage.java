package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {


    private final By username = By.xpath("//input[@type='email']");
    private final By password = By.id("password");
    private final By loginButton = By.name("Login");
    private final By loginError = By.xpath(("//*[text()[contains(.,'Please ')]]"));


    public void enterUsername(String s) {
        $(username).sendKeys(s);
    }

    public void enterPassword(String s) {
        $(password).sendKeys(s);

    }


    public void login() {
        $(loginButton).click();

    }

    public String getLoginErrorText() {
        return $(loginError).getText();
    }
}
