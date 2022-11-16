package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedStepsUI {

    @FindBy (xpath = "//section[@class='col-three']//a[@data-mptype='headline']")
    public List<WebElement> topHeadlineLinks;

    @FindBy (xpath = "//article//span[contains(@class,'video-play-button video-play-button--onefeed')]")
    public List<WebElement> videoPlayButtons;

    public HomePage() {

        PageFactory.initElements(driver, this);

    }

    public ArticlePage clickOnTopHeadlineLink(int index){

        clickOnElementFromList(topHeadlineLinks,index);

        return new ArticlePage();

    }

    public void clickOnVideoPlayButton(int index) {

        clickOnElementFromList(videoPlayButtons, index);

    }

}
