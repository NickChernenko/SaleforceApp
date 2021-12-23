import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import properties_reader.PropertyReader;

import java.io.IOException;
import java.time.Duration;

public class TC_001 extends BaseTest {

    @Test
    public void tc_001() {

        LoginPage loginPage = new LoginPage();

        loginPage.enterUsername("Invalid Password");
        loginPage.enterPassword("Invalid Email");
        loginPage.login();
        String error = loginPage.getLoginErrorText();
        Assert.assertEquals(error, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");

    }

    @Test
    public void tc_002() throws IOException {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername(PropertyReader.appConfigReader("app_userName"));
        loginPage.enterUsername(PropertyReader.appConfigReader("app_password"));



    }

}
