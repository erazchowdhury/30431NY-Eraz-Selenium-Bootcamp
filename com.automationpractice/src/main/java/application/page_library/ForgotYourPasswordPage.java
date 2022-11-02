package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotYourPasswordPage extends SharedStepsUI {

    @FindBy(id = "email")
    public WebElement emailInputField;

    @FindBy (xpath = "//button[@class='btn btn-default button button-medium']")
    public WebElement retrievePasswordButton;

    @FindBy (xpath = "//p[@class='alert alert-success']")
    public WebElement emailSentConfirmation;

    public ForgotYourPasswordPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String emailAddress) {

        sendKeysToElement(emailInputField, emailAddress);

    }

    public void clickRetrievePasswordButton() {

        clickOnElement(retrievePasswordButton);

    }

    public void sendForgotPasswordEmail(String emailAddress) {

        inputEmail(emailAddress);
        clickRetrievePasswordButton();

    }

    public String getTextFromConfirmation() {

        return getTrimmedElementText(emailSentConfirmation);

    }

}
