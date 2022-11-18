package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    @FindBy (id = "username")
    public WebElement emailField;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement continueButton;

    @FindBy (id = "password")
    public WebElement passwordField;

    public AuthenticationPage() {

        PageFactory.initElements(driver,this);

    }

    public void signIn(String email, String password){

        inputEmail(email);
        clickContinueButton();
        inputPassword(password);
        clickContinueButton();

    }

    public void inputEmail(String email){

        sendKeysToElement(emailField, email);

    }

    public void clickContinueButton(){

        clickOnElement(continueButton);

    }

    public void inputPassword(String password){

        sendKeysToElement(passwordField, password);

    }

}
