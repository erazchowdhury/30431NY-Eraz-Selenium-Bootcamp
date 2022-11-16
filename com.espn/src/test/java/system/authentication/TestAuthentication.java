package system.authentication;

import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test(groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLogin")
    public void testLogIn(String email, String password, String expected) {

        HomePage homePage = new HomePage();
        homePage.systemBar.logIn(email, password);
        homePage.systemBar.hoverOverUserSettingsIcon();

        Assert.assertEquals(homePage.systemBar.getWelcomeMessage(), expected);

    }

    @Test(groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testInvalidLogin")
    public void testInvalidLogIn(String email, String password, String expected) {

        HomePage homePage = new HomePage();
        homePage.systemBar.logIn(email, password);

        Assert.assertEquals(homePage.systemBar.getLogInErrorMessage(), expected);

    }

}
