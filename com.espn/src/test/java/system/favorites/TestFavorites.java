package system.favorites;

import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFavorites extends BasePage {

    @Test(groups = {"smoke", "favorites"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAddFavoriteTeam")
    public void testAddFavoriteTeam(String email, String password, String searchTerm, String index){

        HomePage homePage = new HomePage();
        homePage.systemBar.logIn(email, password);
        homePage.systemBar.hoverOverUserSettingsIcon();
        homePage.systemBar.addFavorite(searchTerm, Integer.parseInt(index));

        Assert.assertEquals(homePage.systemBar.getRecentlyFollowedName(), searchTerm);

    }

}
