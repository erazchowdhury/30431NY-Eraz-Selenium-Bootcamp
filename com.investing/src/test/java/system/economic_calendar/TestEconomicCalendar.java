package system.economic_calendar;

import application.page_library.HomePage;
import application.page_library.ItemDetailsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEconomicCalendar extends BasePage {

    @Test (groups = {"smoke", "economic calendar"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewEconomicCalendarItem")
    public void testViewEconomicCalendarItem(String index) {

        HomePage homePage = new HomePage();
        jsScroll(1200);
        ItemDetailsPage itemDetailsPage = homePage.selectEconomicEvent(Integer.parseInt(index));
        switchToTab();

        Assert.assertTrue(isElementVisible(itemDetailsPage.itemHeader));

    }
}
