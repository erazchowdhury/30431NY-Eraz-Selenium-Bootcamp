package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testLogin")
    public Object[][] getDataTestLogin() {
        return excel.readStringArrays("TestLoginDP");
    }

    @DataProvider(name = "testViewStay")
    public Object[][] getDataTestViewStay() {
        return excel.readStringArrays("TestViewStayDP");
    }

}
