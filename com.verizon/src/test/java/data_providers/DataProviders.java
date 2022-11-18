package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testSearch")
    public Object[][] getDataTestSearch() {
        return excel.readStringArrays("TestSearchDP");
    }

    @DataProvider(name = "testNavigateTo5GPage")
    public Object[][] getDataTestNavigateTo5GPage() {
        return excel.readStringArrays("TestNavigateTo5GPageDP");
    }

    @DataProvider(name = "testNavigateToBusinessPage")
    public Object[][] getDataTestNavigateToBusinessPage() {
        return excel.readStringArrays("TestNavigateToBusinessPageDP");
    }

    @DataProvider(name = "testNavigateToSpanishHomePage")
    public Object[][] getDataTestNavigateToSpanishHomePage() {
        return excel.readStringArrays("TestNavigateToSpanishHomePageDP");
    }

}
