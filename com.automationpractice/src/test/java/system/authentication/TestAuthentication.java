package system.authentication;

import application.page_library.AuthenticationPage;
import application.page_library.ForgotYourPasswordPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testResetPassword")
    public void testResetPassword(String emailAddress, String expected) {

        HomePage homePage = new HomePage();

        AuthenticationPage authenticationPage = homePage.systemBar.clickSignInButton();

        ForgotYourPasswordPage forgotYourPasswordPage = authenticationPage.clickForgotPasswordLink();

        forgotYourPasswordPage.sendForgotPasswordEmail(emailAddress);

        Assert.assertEquals(forgotYourPasswordPage.getTextFromConfirmation(), expected);

    }

}
