package system.articles;

import application.page_library.ArticlePage;
import application.page_library.HomePage;
import application.shared.SharedStepsUI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArticles extends SharedStepsUI {

    @Test(groups = {"smoke", "articles"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewArticle")
    public void testViewArticle(String index){

        HomePage homePage = new HomePage();
        ArticlePage articlePage = homePage.clickOnTopHeadlineLink(Integer.parseInt(index));

        Assert.assertTrue(isElementVisible(articlePage.articleHeader));

    }

}
