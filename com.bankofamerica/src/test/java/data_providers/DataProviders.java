package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testInvalidSignIn")
    public Object[][] getDataTestInvalidSignIn() {
        return excel.readStringArrays("TestInvalidSignInDP");
    }

    @DataProvider(name = "testFindAHome")
    public Object[][] getDataTestFindAHome() {
        return excel.readStringArrays("TestFindAHomeDP");
    }

    @DataProvider(name = "testLifePlanVideo")
    public Object[][] getDataTestLifePlanVideo() {
        return excel.readStringArrays("TestLifePlanVideoDP");
    }

    @DataProvider(name = "testViewNewMortgageRate")
    public Object[][] getDataTestViewNewMortgageRate() {
        return excel.readStringArrays("TestViewNewMortgageRateDP");
    }

}
