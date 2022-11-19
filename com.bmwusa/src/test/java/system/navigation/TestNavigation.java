package system.navigation;

import application.page_library.HomePage;
import application.page_library.MyBMWAppPage;
import application.page_library.ServicePage;
import application.page_library.UpdateSignUpPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigation extends BasePage {

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToMyBMWAppPage")
    public void testNavigateToMyBMWAppPage(String buttonNum, String index) {

        HomePage homePage = new HomePage();

//        homePage.clickCarouselSelectButton(Integer.parseInt(buttonNum));
//        homePage.clickOnLearnMoreButton(Integer.parseInt(index));
        MyBMWAppPage myBMWAppPage = homePage.navigateToMyBMWAppPage(Integer.parseInt(buttonNum), Integer.parseInt(index));

        Assert.assertTrue(isElementVisible(myBMWAppPage.pageHeader));

    }

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToServicePage")
    public void testNavigateToServicePage(String buttonNum, String index) {

        HomePage homePage = new HomePage();
        ServicePage servicePage = homePage.navigateToServicePage(Integer.parseInt(buttonNum), Integer.parseInt(index));
        switchToTab();

        Assert.assertTrue(isElementVisible(servicePage.paragraphHeader));

    }

    @Test (groups = {"smoke", "navigation"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNavigateToUpdateSignUpPage")
    public void testNavigateToUpdateSignUpPage(String buttonNum, String index) {

        HomePage homePage = new HomePage();
        UpdateSignUpPage updateSignUpPage = homePage.clickSignUpLink();

        Assert.assertTrue(isElementVisible(updateSignUpPage.firstNameField));

    }

}
