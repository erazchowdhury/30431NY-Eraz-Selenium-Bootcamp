package system.videos;

import application.page_library.HomePage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVideos extends BasePage {

//    Doesn't pass when an ad plays, maybe add a fifteen-second wait to always account for an ad

//    @Test(groups = {"smoke", "videos"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testPlayVideo")
//    public void testPlayVideo(String index, String zero){
//
//        HomePage homePage = new HomePage();
//        homePage.clickOnVideoPlayButton(Integer.parseInt(index));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Assert.assertTrue(By.xpath("//video[@class='vjs-tech']").findElement(driver).getAttribute("currentTime").compareTo(zero) > 0);
//
//    }

}
