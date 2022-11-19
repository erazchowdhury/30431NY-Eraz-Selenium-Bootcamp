package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testSearch")
    public Object[][] getDataTestSearch() {
        return excel.readStringArrays("TestSearchDP");
    }

    @DataProvider(name = "testViewVehicles")
    public Object[][] getDataTestViewVehicles() {
        return excel.readStringArrays("TestViewVehiclesDP");
    }

    @DataProvider(name = "testNavigateToOffersPage")
    public Object[][] getDataTestNavigateToOffersPage() {
        return excel.readStringArrays("TestNavigateToOffersPageDP");
    }

    @DataProvider(name = "testNavigateToServicePage")
    public Object[][] getDataTestNavigateToServicePage() {
        return excel.readStringArrays("TestNavigateToServicePageDP");
    }

    @DataProvider(name = "testNavigateToAccessoriesPage")
    public Object[][] getDataTestNavigateToAccessoriesPage() {
        return excel.readStringArrays("TestNavigateToAccessoriesPageDP");
    }

}
