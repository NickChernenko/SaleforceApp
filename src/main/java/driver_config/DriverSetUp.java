/*package driver_config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import properties_reader.PropertyReader;

import java.io.IOException;

public class DriverSetUp {
    public static  WebDriver driver;

@BeforeMethod
    public void startBrowser() throws IOException {
    System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(PropertyReader.appConfigReader("Application_URL"));

}

@AfterMethod
    public void closeBrowser(){

    driver.quit();
}

}
*/
