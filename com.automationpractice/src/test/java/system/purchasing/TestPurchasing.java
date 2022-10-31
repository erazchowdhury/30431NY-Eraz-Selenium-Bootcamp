package system.purchasing;

import application.page_library.HomePage;
import application.page_library.ItemPage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestPurchasing extends BasePage {

    @Test (groups = {"smoke", "purchasing"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testPurchasingFeaturedItem")
    public void testPurchasingFeaturedItem(String index) {

        HomePage homePage = new HomePage();

        ItemPage itemPage = homePage.clickFeaturedProduct(Integer.parseInt(index));


    }

}
