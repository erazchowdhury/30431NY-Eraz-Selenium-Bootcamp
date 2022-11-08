package system.authentication;

import application.page_library.AuthenticationPage;
import application.page_library.HomePage;
import application.page_library.IntroPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestAuthentication extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLogin")
    public void testLogin(String email, String password, String expected) throws AWTException {

        IntroPage introPage = new IntroPage();
        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        Assert.assertEquals(homePage.systemBar.getAccountName(), expected);

    }

}
