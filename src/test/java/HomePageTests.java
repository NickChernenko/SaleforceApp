import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTests extends BaseLoggedInTest {

    private LoginPage loginPage = new LoginPage();


    @Test
    public void tc_001() {
        HomePage homePage = new HomePage();

        homePage.openAppMenu().viewAllApp().getElement();


    }

}
