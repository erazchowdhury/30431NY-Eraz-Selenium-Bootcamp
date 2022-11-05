package system.authentication;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public class TestAuthentication extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testResetPassword")
    public void testResetPassword(String emailAddress, String expected) {

        HomePage homePage = new HomePage();

        AuthenticationPage authenticationPage = homePage.systemBar.clickSignInButton();

        ForgotYourPasswordPage forgotYourPasswordPage = authenticationPage.clickForgotPasswordLink();

        forgotYourPasswordPage.sendForgotPasswordEmail(emailAddress);

        Assert.assertEquals(forgotYourPasswordPage.getTextFromConfirmation(), expected);

    }

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewOrder")
    public void testViewOrder(String emailAddress, String password, String downloadPath, String fileName) throws InterruptedException {

        HomePage homePage = new HomePage();

        AuthenticationPage authenticationPage = homePage.systemBar.clickSignInButton();

        AccountPage accountPage = authenticationPage.signIntoAccount(emailAddress, password);

        OrderHistoryPage orderHistoryPage = accountPage.clickOrderHistoryButton();

//        orderHistoryPage.clickOrderInvoiceButton(Integer.parseInt(index));
        orderHistoryPage.clickEarliestOrderInvoiceButton();

        Assert.assertTrue(isFileDownloaded(downloadPath, fileName));

    }


}
