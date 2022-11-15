package application.shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

}
