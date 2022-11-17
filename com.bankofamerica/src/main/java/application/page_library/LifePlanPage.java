package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifePlanPage extends BasePage {

    @FindBy (id = "masthead399494555-_-see-how-it-works")
    public WebElement seeHowItWorksButton;

    @FindBy (xpath = "//button[@class='vjs-big-play-button']")
    public WebElement playButton;

    @FindBy (id = "video-263038129_html5_api")
    public WebElement lifePlanVideo;

    public LifePlanPage() {

        PageFactory.initElements(driver, this);

    }

    public void playLifePlanVideo(){

        clickSeeHowItWorksButton();
        clickPlayButton();
        synchronized (webDriverWait){
            try {
                webDriverWait.wait(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void clickSeeHowItWorksButton() {

        clickOnElement(seeHowItWorksButton);

    }

    public void clickPlayButton() {

        clickOnElement(playButton);

    }

}
