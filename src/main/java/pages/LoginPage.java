package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {


    private final By username = By.xpath("//input[@type='email']");
    private final By password = By.id("password");
    private final By loginButton = By.name("Login");
    private final By loginError = By.xpath("//*[text()[contains(.,'Please ')]]");
    private final By forgotPasswordLink = By.id("forgot_password_link");
    private final By forgotPasswordHeader = By.xpath("//h2[text()='Forgot Your Password']");

    public LoginPage enterUsername(String s) {

        $(username).sendKeys(s);
        return this;
    }

    public LoginPage enterPassword(String s) {

        $(password).sendKeys(s);
        return this;
    }


    public HomePage clickLogin() {

        $(loginButton).click();
        return new HomePage();
    }


    public String getLoginErrorText() {

        return $(loginError).getText();
    }

    public void performLogin(String username, String password) {
        enterUsername(username)
                .enterPassword(password)
                .clickLogin();


    }
    public LoginPage goToForgotPasswordPage(){
        $(forgotPasswordLink).click();
    return this;
    }
    public String getForgotPasswordHeaderText(){
        return $(forgotPasswordHeader).getText();
    }

}
