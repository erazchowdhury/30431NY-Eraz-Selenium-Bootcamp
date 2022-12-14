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

    @DataProvider (name = "testSearchAndPurchase")
    public Object[][] getDataTestSearchAndPurchase() {
        return excel.readStringArrays("TestSearchAndPurchaseDP");
    }

    @DataProvider (name = "testRemoveItems")
    public Object[][] getDataTestRemoveItems() {
        return excel.readStringArrays("TestRemoveItems");
    }

    @DataProvider (name = "testInvalidSignIn")
    public Object[][] getDataTestInvalidSignIn() {
        return excel.readStringArrays("TestInvalidSignInDP");
    }

    @DataProvider (name = "testWritingReview")
    public Object[][] getDataTestWritingReview() {
        return excel.readStringArrays("TestWritingReviewDP");
    }

}
