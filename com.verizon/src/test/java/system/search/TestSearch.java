package system.search;

import application.page_library.HomePage;
import application.page_library.ItemPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSearch")
    public void testSearch(String searchTerm, String index) {

        HomePage homePage = new HomePage();
        ItemPage itemPage = homePage.systemBar.searchForItem(searchTerm, Integer.parseInt(index));

        Assert.assertTrue(isElementVisible(itemPage.itemName));

    }
}
