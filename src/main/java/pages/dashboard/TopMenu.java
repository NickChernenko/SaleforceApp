package pages.dashboard;

import org.openqa.selenium.By;
import pages.BasePage;

public class TopMenu extends BasePage {

    private final By dashBoardMenuItem = By.xpath("//a[@title='Dashboards']");

    public void clickDashboardMenuItem() {
        $(dashBoardMenuItem).click();

    }


}
