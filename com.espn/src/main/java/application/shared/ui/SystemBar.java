package application.shared.ui;

import application.page_library.GameDetailsPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//li[@class='user']")
    public WebElement userSettingsIcon;

    @FindBy (xpath = "//a[@tref='/members/v3_1/login']")
    public WebElement logInLink;

    @FindBy (id = "disneyid-iframe")
    public WebElement logInIframe;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement usernameOrEmailField;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordField;

    @FindBy (xpath = "//button[@aria-label='Log In']")
    public WebElement logInButton;

    @FindBy (xpath = "//li[@class='display-user']/span")
    public WebElement welcomeMessage;

    @FindBy (xpath = "//div[@ng-repeat]")
    public WebElement invalidLogInMessage;

    @FindBy (xpath = "//div[@class='scores-next controls']")
    public WebElement nextButtonGameCarousel;

    @FindBy (xpath = "//div[@class='scores-carousel']//a[@class='cscore_link' or @class='cscore_details']")
    public List<WebElement> gameDetails;

    @FindBy (xpath = "//span[@class='settings open-favs']")
    public WebElement editFavoritesButton;

    @FindBy (id = "favorites-manager-iframe")
    public WebElement favoritesManagerIframe;

    @FindBy (id = "FavMgmt__Pane__Search__Input")
    public WebElement favoriteManagerSearchBar;

    @FindBy (xpath = "//section[@class='FavMgmt__Pane flex justify FavMgmt__Pane--searching']//section[contains(@class,'Left flex flex-column')]//div[@name='anchor-tag']")
    public List<WebElement> followButtons;

    @FindBy (xpath = "//h2[@class='FavMgmt__Details__Name truncate hs9 di']")
    public WebElement recentlyFollowedName;

    public SystemBar() {

        PageFactory.initElements(driver, this);

    }

    public void logIn(String usernameOrEmail, String password){

        hoverOverUserSettingsIcon();
        clickOnLoginLink();
        switchToLogInIframe();
        inputUsernameOrEmail(usernameOrEmail);
        inputPassword(password);
        clickLogInButton();

    }

    public void hoverOverUserSettingsIcon(){

        hoverOverElement(userSettingsIcon);

    }

    public void clickOnLoginLink() {

        clickOnElement(logInLink);

    }

    public void switchToLogInIframe(){

        switchToFrameByElement(logInIframe);

    }

    public void inputUsernameOrEmail(String usernameOrEmail){

        sendKeysToElement(usernameOrEmailField, usernameOrEmail);

    }

    public void inputPassword(String password){

        sendKeysToElement(passwordField, password);

    }

    public void clickLogInButton(){

        clickOnElement(logInButton);

    }

    public String getWelcomeMessage(){

         return getTrimmedElementText(welcomeMessage);

    }

    public String getLogInErrorMessage(){

        return getTrimmedElementText(invalidLogInMessage);

    }

    public void clickNextButtonOnGameCarousel(){

        clickOnElement(nextButtonGameCarousel);

    }

    public GameDetailsPage selectGameDetails(int index){

        safeClickOnElementFromList(gameDetails,index);

        return new GameDetailsPage();

    }

    public void addFavorite(String searchTerm, int index){

        clickOnEditFavoritesButton();
        switchToFavoritesManagerIframe();
        inputSearchTerm(searchTerm);
        clickOnFollowButton(index);

    }

    public void clickOnEditFavoritesButton(){

        clickOnElement(editFavoritesButton);

    }

    public void switchToFavoritesManagerIframe(){

        switchToFrameByElement(favoritesManagerIframe);

    }

    public void inputSearchTerm(String searchTerm){

        sendKeysToElement(favoriteManagerSearchBar, searchTerm);

    }

    public void clickOnFollowButton(int index){
        synchronized (webDriverWait) {
            try {
                webDriverWait.wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        clickOnElementFromList(followButtons, index);
    }

    public String getRecentlyFollowedName(){

        return getTrimmedElementText(recentlyFollowedName);

    }

}
