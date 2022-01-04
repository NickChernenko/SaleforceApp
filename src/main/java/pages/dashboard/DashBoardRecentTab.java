package pages.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class DashBoardRecentTab extends BasePage {

    private final By dashBoardTabTitle = By.xpath("//span[@title='Recent']");
    private final By allDashBoards = By.xpath("//div[@id='navSection']//ul/li");

    public boolean isDisplayed() {
        return $(dashBoardTabTitle).isDisplayed();
    }


    public void getAllDashBoardsFromTheGrid() {
        List<WebElement> elements = $$(allDashBoards);

        for (WebElement element : elements) {
            element.getAttribute("title");
        }

    }


}
