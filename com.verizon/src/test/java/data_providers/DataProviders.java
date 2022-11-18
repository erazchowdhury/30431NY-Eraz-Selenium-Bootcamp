package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testSearch")
    public Object[][] getDataTestSearch() {
        return excel.readStringArrays("TestSearchDP");
    }

}
