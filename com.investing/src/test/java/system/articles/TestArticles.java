package system.articles;

import application.system.HomePage;
import application.system.ItemDetailsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArticles extends BasePage {

    @Test (groups = {"smoke", "article"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewArticle")
    public void testViewArticle(String index) {

        HomePage homePage = new HomePage();
        ItemDetailsPage itemDetailsPage = homePage.clickArticle(Integer.parseInt(index));
        Assert.assertTrue(isElementVisible(itemDetailsPage.articleHeader));

    }
}
