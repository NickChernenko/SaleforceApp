import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import properties_reader.PropertyReader;

import java.io.IOException;

public class HomePageTests extends BaseTest {


    @BeforeMethod
    public void login() {
        LoginPage loginPage = new LoginPage();

        try {
            loginPage.enterUsername(PropertyReader.propertyReader("app_userName")).
                    enterPassword(PropertyReader.propertyReader("app_password")).submitLogin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void tc_001() {
        HomePage homePage = new HomePage();
        homePage.openAppMenu().viewAllApp().getElement();



    }

}
