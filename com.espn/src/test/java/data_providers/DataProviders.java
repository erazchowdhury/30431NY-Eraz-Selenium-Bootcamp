package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testLogin")
    public Object[][] getDataTestLogin() {
        return excel.readStringArrays("TestLoginDP");
    }

    @DataProvider(name = "testInvalidLogin")
    public Object[][] getDataTestInvalidLogin() {
        return excel.readStringArrays("TestInvalidLoginDP");
    }

    @DataProvider(name = "testViewGameDetails")
    public Object[][] getDataTestViewGameDetails() {
        return excel.readStringArrays("TestViewGameDetailsDP");
    }

    @DataProvider(name = "testAddFavoriteTeam")
    public Object[][] getDataTestAddFavoriteTeam() {
        return excel.readStringArrays("TestAddFavoriteTeamDP");
    }

    @DataProvider(name = "testViewArticle")
    public Object[][] getDataTestViewArticle() {
        return excel.readStringArrays("TestViewArticleDP");
    }

    @DataProvider(name = "testPlayVideo")
    public Object[][] getDataTestPlayVideo() {
        return excel.readStringArrays("TestPlayVideoDP");
    }

}
