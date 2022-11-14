package system.deals;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeals extends BasePage {

    @Test(groups = {"smoke", "deals"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingDeal")
    public void testCreatingDeal(String email, String password, String dealName, String day, String timeIndex) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        DealsPage dealsPage = homePage.systemBar.clickDealsButton();

        CreateDealPage createDealPage = dealsPage.clickCreateDealButton();

        ItemDetailsPage itemDetailsPage = createDealPage.createDeal(dealName, Integer.parseInt(day), Integer.parseInt(timeIndex));

        if(isElementInvisible(createDealPage.createDealForm)){
            Assert.assertEquals(itemDetailsPage.getName(), dealName);
        }


    }

}
