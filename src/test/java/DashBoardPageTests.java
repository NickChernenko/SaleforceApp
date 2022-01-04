import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardRecentTab;
import pages.LoginPage;
import pages.TopMenu;

public class DashBoardPageTests extends BaseLoggedInTest {

    private TopMenu topMenu = new TopMenu();
    private DashBoardRecentTab dashBoardRecentTab = new DashBoardRecentTab();
    LoginPage loginPage = new LoginPage();


    @Test
    public void Verify_that_Recent_tab_is_open_by_default_when_Dashboard_page_opened() {
        topMenu.clickDashboardMenuItem();
        Assert.assertTrue(dashBoardRecentTab.isDisplayed());
    }


    @Test
    public void Verify_that_created_by_me_is_present_in_menu() {

    }


}
