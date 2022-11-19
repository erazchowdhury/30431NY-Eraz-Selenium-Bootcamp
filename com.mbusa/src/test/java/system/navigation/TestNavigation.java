package system.navigation;

import application.page_library.AccessoriesPage;
import application.page_library.HomePage;
import application.page_library.ServicePage;
import application.page_library.SpecialOffersPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigation extends BasePage {

    @Test(groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToOffersPage")
    public void testNavigateToOffersPage(String expected) {

        HomePage homePage = new HomePage();
        SpecialOffersPage specialOffersPage = homePage.systemBar.navigateToSpecialOffersPage();

        Assert.assertEquals(specialOffersPage.getSearchHeaderText(), expected);

    }

    @Test(groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToServicePage")
    public void testNavigateToServicePage(String expected) {

        HomePage homePage = new HomePage();
        ServicePage servicePage = homePage.systemBar.navigateToServicePage();

        Assert.assertEquals(servicePage.getHeaderText(), expected);
    }

    @Test(groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToAccessoriesPage")
    public void testNavigateToAccessoriesPage(String expected) {

        HomePage homePage = new HomePage();
        AccessoriesPage accessoriesPage = homePage.systemBar.navigateToAccessoriesPage();

        Assert.assertEquals(accessoriesPage.getHeaderText(), expected);

    }

}
