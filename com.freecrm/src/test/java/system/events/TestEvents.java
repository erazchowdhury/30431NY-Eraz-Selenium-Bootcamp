package system.events;

import application.page_library.*;
import application.shared.SharedStepsUI;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEvents extends BasePage {

    @Test (groups = {"smoke", "events"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingEvent")
    public void testCreatingEvent(String email, String password, String day, String title, String location, String participant){

        IntroPage introPage = new IntroPage();
        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        EventsPage eventsPage = homePage.systemBar.clickCalendarButton();

        CreateEventPage createEventPage = eventsPage.clickDay(Integer.parseInt(day));

        ItemDetailsPage itemDetailsPage = createEventPage.createEvent(title, location, participant);

        if(isElementInvisible(createEventPage.createEventForm)){
            Assert.assertEquals(itemDetailsPage.getName(), title);
        }

    }

}
