package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By searchButton = By.xpath("//button[@aria-label='Search']");


    public static boolean loggedIn() {

        return $(searchButton).isDisplayed();
    }


}