import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import properties_reader.PropertyReader;

public class LoginPageTests extends BaseTest {

    @Test
    public void verify_that_login_error_massage_is_appear() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Invalid Password").
                enterPassword("Invalid Email").
                clickLogin();

        String error = loginPage.getLoginErrorText();
        Assert.assertEquals(error, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");

    }


    @Test
    public void verify_successful_login() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername(PropertyReader.propertyReader("app_userName")).
                enterPassword(PropertyReader.propertyReader("app_password")).
                clickLogin();

        boolean isLoginSuccessful = HomePage.isLoginSuccessful();
        Assert.assertTrue(isLoginSuccessful);


    }

    @Test
    public void forgot_password_page_is_appear() {
        
        LoginPage loginPage = new LoginPage();

        String forgotPasswordHeaderText = loginPage.goToForgotPasswordPage().getForgotPasswordHeaderText();
        Assert.assertEquals(forgotPasswordHeaderText, "Forgot Your Password");
    }


}
