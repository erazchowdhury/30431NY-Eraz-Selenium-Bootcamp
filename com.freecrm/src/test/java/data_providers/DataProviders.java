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

    @DataProvider (name = "testCreatingEvent")
    public Object[][] getDataTestCreatingEvent() {
        return excel.readStringArrays("TestCreatingEventDP");
    }

    @DataProvider (name = "testCreatingCompany")
    public Object[][] getDataTestCreatingCompany() {
        return excel.readStringArrays("TestCreatingCompanyDP");
    }

    @DataProvider (name = "testCreatingContact")
    public Object[][] getDataTestCreatingContact() {
        return excel.readStringArrays("TestCreatingContactDP");
    }

    @DataProvider (name = "testCreatingDeal")
    public Object[][] getDataTestCreatingDeal() {
        return excel.readStringArrays("TestCreatingDealDP");
    }

    @DataProvider (name = "testCreatingTask")
    public Object[][] getDataTestCreatingTask() {
        return excel.readStringArrays("TestCreatingTaskDP");
    }

    @DataProvider (name = "testCreatingTaskWithInvalidCompletion")
    public Object[][] getDataTestCreatingTaskWithInvalidCompletion() {
        return excel.readStringArrays("TestCreateTaskInvalidCompDP");
    }

    @DataProvider (name = "testCreatingCall")
    public Object[][] getDataTestCreatingCall() {
        return excel.readStringArrays("TestCreatingCallDP");
    }
    @DataProvider (name = "testDeletingContact")
    public Object[][] getDataTestDeletingContact() {
        return excel.readStringArrays("TestDeletingContactDP");
    }

}
