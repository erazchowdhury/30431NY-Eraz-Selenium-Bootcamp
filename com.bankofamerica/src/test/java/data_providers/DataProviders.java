package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testInvalidSignIn")
    public Object[][] getDataTestInvalidSignIn() {
        return excel.readStringArrays("TestInvalidSignInDP");
    }

}
