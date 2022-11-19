package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testViewModel")
    public Object[][] getDataTestViewModel() {
        return excel.readStringArrays("TestViewModelDP");
    }

    @DataProvider(name = "testNavigateToMyBMWAppPage")
    public Object[][] getDataTestNavigateToMyBMWAppPage() {
        return excel.readStringArrays("TestNavigateToMyBMWAppPageDP");
    }

    @DataProvider(name = "testNavigateToServicePage")
    public Object[][] getDataTestNavigateToServicePage() {
        return excel.readStringArrays("TestNavigateToServicePageDP");
    }

    @DataProvider(name = "testNavigateToUpdateSignUpPage")
    public Object[][] getDataTestNavigateToUpdateSignUpPage() {
        return excel.readStringArrays("TestNavigateToUpdateSignUpPageD");
    }

    @DataProvider(name = "testSearch")
    public Object[][] getDataTestSearch() {
        return excel.readStringArrays("TestSearchDP");
    }

}
