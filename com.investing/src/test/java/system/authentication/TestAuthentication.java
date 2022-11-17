package system.authentication;

import application.system.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLogin")
    public void testLogin(String email, String password, String expected) {

        HomePage homePage = new HomePage();
        homePage.systemBar.signIn(email, password);

        Assert.assertEquals(homePage.systemBar.getAccountName(), expected);

    }
}
