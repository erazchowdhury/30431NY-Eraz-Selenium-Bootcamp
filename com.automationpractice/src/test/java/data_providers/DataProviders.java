package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders extends BasePage {

    @DataProvider (name = "testPurchasingFeaturedItem")
    public Object[][] getDataPurchasingFeaturedItem() {
        return excel.readStringArrays("TestFeaturedProductsDP");
    }

}
