package system.real_estate;

import application.page_library.BrokerPage;
import application.page_library.HomePage;
import application.page_library.RealEstateCenterPage;
import base.BasePage;
import data_providers.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRealEstate extends BasePage {


    @Test(groups = {"smoke", "real estate"} , dataProviderClass = DataProviders.class, dataProvider = "testFindAHome")
    public void testFindAHome(String searchTerm) {

        HomePage homePage = new HomePage();

        RealEstateCenterPage realEstateCenterPage = homePage.navigateToRealEstatePage();

        BrokerPage brokerPage = realEstateCenterPage.searchForHome(searchTerm);

        Assert.assertTrue(isElementVisible(brokerPage.brokerLogo));

    }

}
