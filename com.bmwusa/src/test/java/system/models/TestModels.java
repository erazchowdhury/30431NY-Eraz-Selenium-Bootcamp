package system.models;

import application.page_library.HomePage;
import application.page_library.ItemPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModels extends BasePage {

    @Test (groups = {"smoke", "models"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewModel")
    public void testViewModel(String index, String expected) {

        HomePage homePage = new HomePage();
        ItemPage itemPage = homePage.systemBar.selectItem(Integer.parseInt(index));

        Assert.assertEquals(itemPage.getItemTitle(), expected);
    }

}
