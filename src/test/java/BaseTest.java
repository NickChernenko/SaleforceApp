import driver_config.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public static void setupClass() {


        DriverManager.getDriver().get("https://test.salesforce.com/");


    }

    @AfterMethod
    public void closeBrowser() {
        DriverManager.getDriver().quit();

    }
}
