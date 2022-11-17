package system.life_plan;

import application.page_library.HomePage;
import application.page_library.LifePlanPage;
import base.BasePage;
import data_providers.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLifePlan extends BasePage {

    @Test(groups = {"smoke", "life plan"}, dataProviderClass = DataProviders.class, dataProvider = "testLifePlanVideo" )
    public void testLifePlanVideo(String attributeName) {

        HomePage homePage = new HomePage();
        LifePlanPage lifePlanPage = homePage.clickOnLifePlanLearnMoreButton();

        lifePlanPage.playLifePlanVideo();

        Assert.assertTrue(Double.parseDouble(lifePlanPage.lifePlanVideo.getAttribute(attributeName)) > 0);

    }
}
