package driver_config;


import org.openqa.selenium.WebDriver;

public class DriverManager {
    protected static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }


}