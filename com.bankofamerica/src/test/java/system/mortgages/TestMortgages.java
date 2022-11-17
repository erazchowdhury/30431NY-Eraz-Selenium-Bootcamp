package system.mortgages;

import application.page_library.HomeMortgagePage;
import application.page_library.HomePage;
import base.BasePage;
import data_providers.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMortgages extends BasePage {

    @Test(groups = {"smoke", "mortgage"}, dataProviderClass = DataProviders.class, dataProvider = "testViewNewMortgageRate" )
    public void testViewNewMortgageRate(String purchasePrice, String downPayment, String zipCode, String monthlyPayment) {

        HomePage homePage = new HomePage();
        HomeMortgagePage homeMortgagePage = homePage.navigateToHomeMortgagePage();
        homeMortgagePage.inputPurchasePrice(purchasePrice);
        homeMortgagePage.inputDownPayment(downPayment);
        homeMortgagePage.inputZipCode(zipCode);
        homeMortgagePage.clickUpdatesRateButton();

        if(isElementInvisible(homeMortgagePage.spinner)) {
            Assert.assertEquals(homeMortgagePage.getThirtyYearMonthlyPayment(), monthlyPayment);
        }
    }
}
