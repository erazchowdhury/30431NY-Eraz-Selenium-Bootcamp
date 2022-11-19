package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testViewListing")
    public Object[][] getDataTestViewListing() {
        return excel.readStringArrays("TestViewListingDP");
    }

    @DataProvider(name = "testNavigateToHelpPage")
    public Object[][] getDataTestNavigateToHelpPage() {
        return excel.readStringArrays("TestNavigateToHelpPageDP");
    }


}
