package pages;

import org.openqa.selenium.By;

import java.util.List;

public class DashBoardRecentTab extends BasePage {
    private By dashBoardTabTitle = By.id("");

    public boolean isDisplayed() {
        return $(dashBoardTabTitle).isDisplayed();
    }


    public List<String> getDashBoardsFromTheGrid() {
        throw new IllegalStateException();
    }


}
