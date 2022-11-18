package system.navigation;

import application.page_library.BusinessLandingPage;
import application.page_library.HomePage;
import application.page_library.FiveGPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigation extends BasePage {

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateTo5GPage")
    public void testNavigateTo5GPage(String expected) {

        HomePage homePage = new HomePage();
        FiveGPage fiveGPage =  homePage.systemBar.navigateTo5GPage();

        Assert.assertEquals(fiveGPage.getHeaderText(), expected);

    }

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToBusinessPage")
    public void testNavigateToBusinessPage(String expected) {

        HomePage homePage = new HomePage();
        BusinessLandingPage businessLandingPage = homePage.systemBar.clickBusinessPageLink();

        Assert.assertEquals(businessLandingPage.getBusinessPageLinkText(), expected);

    }

    @Test (groups = {"smoke", "navigation"})
    public void testNavigateToHomePage() {

        HomePage homePage = new HomePage();
        FiveGPage fiveGPage =  homePage.systemBar.navigateTo5GPage();

        HomePage homePage1 = fiveGPage.systemBar.clickLogo();

        Assert.assertTrue(isElementVisible(homePage1.latestHeader));

    }

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToSpanishHomePage")
    public void testNavigateToSpanishHomePage(String expected) {

        HomePage homePage = new HomePage();
        HomePage homePage1 = homePage.systemBar.clickSpanishButton();

        Assert.assertEquals(homePage1.systemBar.getLanguage(), expected);

    }

}
