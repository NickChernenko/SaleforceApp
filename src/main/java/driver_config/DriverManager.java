package driver_config;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import properties_reader.PropertyReader;

import java.io.IOException;

public class DriverManager {
    protected static WebDriver driver;


    @BeforeMethod
    public static void setupClass() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(PropertyReader.appConfigReader("Application_URL"));
    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }


}