package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends SharedStepsUI {

    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    public WebElement forgotPasswordLink;

    @FindBy (id = "email")
    public WebElement emailAddressField;
    @FindBy (id = "passwd")
    public WebElement passwordField;

    @FindBy (id = "SubmitLogin")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='alert alert-danger']/p")
    public WebElement authenticationFailMessage;

    public AuthenticationPage() {

        PageFactory.initElements(driver, this);

    }

    public ForgotYourPasswordPage clickForgotPasswordLink() {

        clickOnElement(forgotPasswordLink);

        return new ForgotYourPasswordPage();

    }

    public void inputEmail(String emailAddress) {

        sendKeysToElement(emailAddressField, emailAddress);

    }

    public void inputPassword(String password) {

        sendKeysToElement(passwordField, password);

    }

    public void clickSignInButton() {

        clickOnElement(submitButton);

    }

    public AddressesPage signInAndProceed(String emailAddress, String password) {

        inputEmail(emailAddress);
        inputPassword(password);
        clickSignInButton();

        return new AddressesPage();

    }

    public AccountPage signIntoAccount(String emailAddress, String password) {

        inputEmail(emailAddress);
        inputPassword(password);
        clickSignInButton();

        return new AccountPage();

    }

    public String getAuthenticationFailMessage() {

        return getTrimmedElementText(authenticationFailMessage);

    }

}
