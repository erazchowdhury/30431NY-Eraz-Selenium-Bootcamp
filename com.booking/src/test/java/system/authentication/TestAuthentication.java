package system.authentication;

import application.page_library.AuthenticationPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

//    login with valid credentials doesn't work does a robot check
//    @Test(groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLogin")
//    public void testLogIn(String email, String password, String expected) {
//
//        HomePage homePage = new HomePage();
//        AuthenticationPage authenticationPage = homePage.systemBar.clickSignInButton();
//
//        authenticationPage.inputEmail(email);
//        authenticationPage.clickContinueButton();
//        authenticationPage.inputPassword(password);
//        authenticationPage.clickContinueButton();
//
//    }

//    @Test(groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testInvalidLogin")
//    public void testInvalidLogIn(String email, String password, String expected) {
//
//        HomePage homePage = new HomePage();
//        AuthenticationPage authenticationPage = homePage.systemBar.clickSignInButton();
//
//        authenticationPage.signIn(email, password);
//
//
//    }



}
