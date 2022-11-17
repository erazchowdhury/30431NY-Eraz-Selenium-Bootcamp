package system.authentication;

import application.page_library.ForgotIDPasswordPage;
import application.page_library.HomePage;
import base.BasePage;
import data_providers.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

import java.util.Random;

public class TestAuthentication extends BasePage {

    @Test(groups = {"smoke", "authentication"}, dataProviderClass = DataProviders.class, dataProvider = "testInvalidSignIn")
    public void testInvalidSignIn(String expected) {

        HomePage homePage = new HomePage();
        ForgotIDPasswordPage forgotIDPasswordPage = homePage.clickForgotIDPasswordLink();

        GenerateData faker = new GenerateData();
        String accountNum = faker.getRandomAccountNum();
        String ssn = faker.getRandomSSNum();
        forgotIDPasswordPage.inputCredentials(accountNum,ssn);

        Assert.assertEquals(forgotIDPasswordPage.getErrorMessage(), expected);

    }

}
