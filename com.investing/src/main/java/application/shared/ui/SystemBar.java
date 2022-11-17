package application.shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@data-reg_ep='top bar sign in']")
    public WebElement signInLink;

    @FindBy (id = "loginFormUser_email")
    public WebElement emailField;

    @FindBy (id = "loginForm_password")
    public WebElement passwordField;

    @FindBy (xpath = "//a[@class='newButton orange']")
    public WebElement signInButton;

    @FindBy (xpath = "//span[@class='myAccount topBarText']")
    public WebElement accountName;

    public SystemBar() {

        PageFactory.initElements(driver,this);

    }

    public void signIn(String email, String password){

        clickSignInLink();
        inputEmail(email);
        inputPassword(password);
        clickSignInButton();

    }

    public void clickSignInLink(){

        clickOnElement(signInLink);

    }

    public void inputEmail(String email){

        sendKeysToElement(emailField, email);

    }

    public void inputPassword(String password){

        sendKeysToElement(passwordField, password);

    }

    public void clickSignInButton(){

        clickOnElement(signInButton);

    }

    public String getAccountName(){

        return getTrimmedElementText(accountName);

    }

}
