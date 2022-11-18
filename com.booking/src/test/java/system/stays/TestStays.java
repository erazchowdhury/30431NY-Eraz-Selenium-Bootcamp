package system.stays;

import application.page_library.HomePage;
import application.page_library.SearchResultsPage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestStays extends BasePage {

    //booking.com has 2 different doms?
    @Test (groups = {"smoke", "stays"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testBookingAStay")
    public void testBookingAStay(String destination, String startDate, String endDate) {

        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.searchForStay(destination, Integer.parseInt(startDate), Integer.parseInt(endDate));

    }
}
