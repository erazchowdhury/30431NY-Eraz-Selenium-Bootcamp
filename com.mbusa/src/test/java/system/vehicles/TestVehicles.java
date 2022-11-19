package system.vehicles;

import application.page_library.HomePage;
import application.page_library.VehiclesPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVehicles extends BasePage {

    @Test (groups = {"smoke", "vehicles"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewVehicles")
    public void testViewVehicles(String index, String expected) {

        HomePage homePage = new HomePage();
        VehiclesPage vehiclesPage = homePage.systemBar.navigateToVehiclesPage(Integer.parseInt(index));

        Assert.assertEquals(vehiclesPage.getTabText(), expected);

    }
}
