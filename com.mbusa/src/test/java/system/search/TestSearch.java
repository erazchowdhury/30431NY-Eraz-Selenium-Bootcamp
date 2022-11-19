package system.search;

import application.page_library.HomePage;
import application.page_library.ModelPage;
import application.page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSearch")
    public void testSearch(String searchTerm, String index, String expected) {

        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm);

        ModelPage modelPage = searchResultsPage.selectSearchResult(Integer.parseInt(index));

        Assert.assertEquals(modelPage.getModelName(), expected);
    }
}
