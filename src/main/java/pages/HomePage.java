package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static By profileTab = By.xpath("//img[@title='User']");


    public boolean loggedIn() {
        if ($(profileTab).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


}