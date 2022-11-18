package system.search;

import application.system.HomePage;
import application.system.ItemDetailsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSearch")
    public void testSearchItem(String searchTerm, String index, String expected) {

        HomePage homePage = new HomePage();
        ItemDetailsPage itemDetailsPage =  homePage.systemBar.searchForItem(searchTerm, Integer.parseInt(index));

        Assert.assertEquals(itemDetailsPage.getItemName(), expected);

    }
}
