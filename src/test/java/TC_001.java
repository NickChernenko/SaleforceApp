import driver_config.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

public class TC_001 extends DriverManager {

    @Test
    public void tc_001() throws InterruptedException, IOException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.login();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(4000);
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://pernod-ricard--eursb6pc.lightning.force.com/one/one.app";
        Assert.assertEquals(actualURL, expectedURL);


        //WebElement profile_button = driver.findElement(By.xpath("//img[@title='User']"));
        //boolean isClickable = wait.until(ExpectedConditions.invisibilityOf(profile_button));

    }

    @Test
    public void TC_002() throws IOException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterInvalidUsername();
        loginPage.enterInvalidPassword();
        loginPage.login();
        String loginError = driver.findElement(By.xpath("//*[text()[contains(.,'Please ')]]")).getText();
        Assert.assertEquals(loginError, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");


    }

}
