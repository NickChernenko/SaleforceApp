import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import properties_reader.PropertyReader;

public class HomePageTests extends BaseTest {

    private LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void beforeMethod() {


        loginPage.performLogin(PropertyReader.propertyReader("app_userName"),
                PropertyReader.propertyReader("app_password"));


    }


    @Test
    public void tc_001() {
        HomePage homePage = new HomePage();

        homePage.openAppMenu().viewAllApp().getElement();


    }

}
