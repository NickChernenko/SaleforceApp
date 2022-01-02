import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import properties_reader.PropertyReader;

import java.io.IOException;

public class LoginPageTests extends BaseTest {

    @Test
    public void tc_001() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Invalid Password").
                enterPassword("Invalid Email").
                submitLogin();

        String error = loginPage.getLoginErrorText();
        Assert.assertEquals(error, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");

    }


    @Test
    public void tc_002() throws IOException {

        LoginPage loginPage = new LoginPage();

        loginPage.enterUsername(PropertyReader.propertyReader("app_userName")).
                enterPassword(PropertyReader.propertyReader("app_password")).
                submitLogin();

        boolean isLoginSuccessful = HomePage.isLoginSuccessful();
        Assert.assertTrue(isLoginSuccessful);


    }

}
