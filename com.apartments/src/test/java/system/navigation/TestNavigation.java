package system.navigation;

import application.page_library.FavoritesPage;
import application.page_library.HelpCenterPage;
import application.page_library.HomePage;
import application.page_library.ManageRentalsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigation extends BasePage {

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToHelpPage")
    public void testNavigateToHelpPage(String expected) {

        HomePage homePage = new HomePage();
        HelpCenterPage helpCenterPage = homePage.systemBar.navigateToHelpPage();

        Assert.assertEquals(helpCenterPage.getHeaderText(), expected);

    }

    @Test (groups = {"smoke", "navigation"})
    public void testNavigateToManageRentalsPage() {

        HomePage homePage =new HomePage();

        ManageRentalsPage manageRentalsPage = homePage.systemBar.navigateToManagePage();

        Assert.assertTrue(isElementVisible(manageRentalsPage.header));

    }

    @Test (groups = {"smoke", "navigation"})
    public void testNavigateToFavoritesPage() {

        HomePage homePage = new HomePage();

        FavoritesPage favoritesPage = homePage.systemBar.navigateToFavoritesPage();
        favoritesPage.switchToFavoritesIframe();

        Assert.assertTrue(isElementVisible(favoritesPage.favoritesButton));

    }

}
