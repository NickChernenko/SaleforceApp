import driver_config.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class TC_001 extends DriverManager {

    @Test
    public void tc_001() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("Invalid Password");
        loginPage.enterPassword("Invalid Email");
        loginPage.login();
       // Assert.assertEquals(loginError, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");

    }

    @Test
    public void TC_002() {
        HomePage homePage = new HomePage(driver);


    }

}
