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

    @DataProvider(name = "testSearch")
    public Object[][] getDataTestSearch() {
        return excel.readStringArrays("TestSearchDP");
    }

    @DataProvider(name = "testViewEconomicCalendarItem")
    public Object[][] getDataTestViewEconomicCalendarItem() {
        return excel.readStringArrays("TestViewEconomicCalendarItemDP");
    }

    @DataProvider(name = "testViewArticle")
    public Object[][] getDataTestViewArticle() {
        return excel.readStringArrays("TestViewArticleDP");
    }

}
