package system.purchasing;

import application.page_library.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestPurchasing extends BasePage {

    @Test (groups = {"smoke", "purchasing"})
    public void testPurchasingFeaturedItem() {

        HomePage homePage = new HomePage();

        homePage.clickFadedShortSleeveTShirtProductLink();

    }

}
