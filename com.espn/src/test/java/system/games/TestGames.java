package system.games;

import application.page_library.GameDetailsPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGames extends BasePage {

    @Test(groups = {"smoke", "games"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testViewGameDetails")
    public void testViewGameDetails(String index){

        HomePage homePage = new HomePage();
        if(Integer.parseInt(index) > 7 && isElementVisible(homePage.systemBar.nextButtonGameCarousel)){
            homePage.systemBar.clickNextButtonOnGameCarousel();
            if(Integer.parseInt(index) > 14 && isElementVisible(homePage.systemBar.nextButtonGameCarousel)){
                homePage.systemBar.clickNextButtonOnGameCarousel();
                if(Integer.parseInt(index) > 21 && isElementVisible(homePage.systemBar.nextButtonGameCarousel)){
                    homePage.systemBar.clickNextButtonOnGameCarousel();
                    homePage.systemBar.clickNextButtonOnGameCarousel();
                    if (Integer.parseInt(index) > 28 && isElementVisible(homePage.systemBar.nextButtonGameCarousel)){
                        homePage.systemBar.clickNextButtonOnGameCarousel();
                    }
                }
            }
        }
        GameDetailsPage gameDetailsPage = homePage.systemBar.selectGameDetails(Integer.parseInt(index));

        Assert.assertTrue(isElementVisible(gameDetailsPage.gameDetailsContainer) || isElementVisible(gameDetailsPage.gameDetailsWrapper));

    }

}
