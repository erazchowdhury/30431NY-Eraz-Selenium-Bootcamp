package application.shared.ui;

import application.system.ItemDetailsPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy (id = "serverErrors")
    public WebElement loginError;

    @FindBy (xpath = "//input[@class='searchText arial_12 lightgrayFont js-main-search-bar']")
    public WebElement searchBar;

    @FindBy (xpath = "//a[@class='row js-quote-row-template js-quote-item']")
    public List<WebElement> searchResults;

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

    public String getLoginErrorMessage(){

        return getTrimmedElementText(loginError);

    }

    public ItemDetailsPage searchForItem(String searchTerm, int index){

        inputSearchTerm(searchTerm);
        selectSearchResult(index);

        return new ItemDetailsPage();

    }

    public void inputSearchTerm(String searchTerm){

        sendKeysToElement(searchBar, searchTerm);

    }

    public void selectSearchResult(int index){

        synchronized (webDriverWait){
            try {
                webDriverWait.wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        clickOnElementFromList(searchResults, index);

    }

}
