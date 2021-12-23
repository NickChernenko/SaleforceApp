package pages;

import org.openqa.selenium.By;

import java.io.IOException;

public class HomePage extends BasePage {

    private final By profileTab = By.xpath("//img[@title='User']");


    public boolean loggedIn() throws IOException {
        return $(profileTab).isDisplayed();
    }


}