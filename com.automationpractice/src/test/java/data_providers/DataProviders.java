package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders extends BasePage {

    @DataProvider (name = "testPurchasingFeaturedItem")
    public Object[][] getDataPurchasingFeaturedItem() {
        return excel.readStringArrays("TestFeaturedProductsDP");
    }

    @DataProvider (name = "testSendingMessageOnContactPage")
    public Object[][] getDataSendingMessageOnContactPage() {
        return excel.readStringArrays("TestSendingMessageDP");
    }

    @DataProvider (name = "testResetPassword")
    public Object[][] getDataTestResetPassword() {
        return excel.readStringArrays("TestResetPasswordDP");
    }

    @DataProvider (name = "testViewOrder")
    public Object[][] getDataTestViewOrder() {
        return excel.readStringArrays("TestViewOrderDP");
    }

    @DataProvider (name = "testSignIn")
    public Object[][] getDataTestSignIn() {
        return excel.readStringArrays("TestSignInDP");
    }

}
