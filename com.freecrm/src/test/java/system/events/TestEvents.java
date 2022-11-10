package system.events;

import application.page_library.AuthenticationPage;
import application.page_library.HomePage;
import application.page_library.IntroPage;
import application.shared.SharedStepsUI;
import base.BasePage;
import org.testng.annotations.Test;

public class TestEvents extends BasePage {

    @Test (groups = {"smoke", "events"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingEvent")
    public void testCreatingEvent(String email, String password){

        IntroPage introPage = new IntroPage();
        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        homePage.systemBar.clickCalendarButton();

    }

}
