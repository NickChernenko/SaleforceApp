import driver_config.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import properties_reader.PropertyReader;

import java.io.IOException;

public class BaseTest extends DriverManager {

    @BeforeMethod
    public static void setupClass() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(PropertyReader.appConfigReader("Application_URL"));


    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }
}
