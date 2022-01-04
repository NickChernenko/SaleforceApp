import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import properties_reader.PropertyReader;

public class BaseLoggedInTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void beforeMethod() {


        loginPage.performLogin(PropertyReader.propertyReader("app_userName"),
                PropertyReader.propertyReader("app_password"));


    }


}
