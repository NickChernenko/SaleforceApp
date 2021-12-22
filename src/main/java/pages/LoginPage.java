package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import properties_reader.PropertyReader;

import java.io.IOException;


public class LoginPage {
    @FindBy(xpath = "//input[@type='email']")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "Login")
    WebElement loginButton;


    public void enterUsername() throws IOException {

        username.sendKeys(PropertyReader.appConfigReader("app_userName"));

    }

    public void enterPassword() throws IOException {
        password.sendKeys(PropertyReader.appConfigReader("app_password"));

    }

    public void login() {
        loginButton.click();
    }

    public void enterInvalidPassword() throws IOException {
        password.sendKeys(PropertyReader.appConfigReader("invalid_password"));
    }

    public void enterInvalidUsername() throws IOException {
        username.sendKeys(PropertyReader.appConfigReader("invalid_username"));
    }

}
