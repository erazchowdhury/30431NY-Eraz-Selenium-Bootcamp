package system.authentication;

import application.page_library.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

//    sometimes the sign-in link doesn't appear not sure why
    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLogin")
    public void testLogIn(String email, String password, String expected) {

        HomePage homePage = new HomePage();
//        homePage.systemBar.clickSignInLink();
//        homePage.systemBar.clickSignInButton();

    }
}
