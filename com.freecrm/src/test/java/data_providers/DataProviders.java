package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider (name = "testLogin")
    public Object[][] getDataTestLogin() {
        return excel.readStringArrays("TestLoginDP");
    }

    @DataProvider (name = "testInvalidLogin")
    public Object[][] getDataTestInvalidLogin() {
        return excel.readStringArrays("TestInvalidLoginDP");
    }

}
