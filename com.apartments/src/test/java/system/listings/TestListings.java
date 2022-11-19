package system.listings;

import application.page_library.HomePage;
import application.page_library.ListingPage;
import application.page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListings extends BasePage {

    @Test (groups = {"smoke", "listing"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewListing")
    public void testViewListing(String searchTerm, String index) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        ListingPage listingPage = searchResultsPage.clickPropertyTextLink(Integer.parseInt(index));

        Assert.assertTrue(isElementVisible(listingPage.propertyName));
    }
}
