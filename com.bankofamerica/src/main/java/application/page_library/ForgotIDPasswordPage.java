package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotIDPasswordPage extends BasePage {

    @FindBy (id = "acctNumber")
    public WebElement accountNumberField;

    @FindBy (id = "ssNumber")
    public WebElement ssnField;

    @FindBy (id = "verifyCustomerAccount")
    public WebElement continueButton;

    @FindBy (xpath = "//p[@class='spartaMessage-text']")
    public WebElement errorMessage;

    public ForgotIDPasswordPage() {

        PageFactory.initElements(driver,this);

    }

    public void inputAccountNumber(String accountNumber) {

        sendKeysToElement(accountNumberField, accountNumber);

    }

    public void inputSsn(String ssn){

        sendKeysToElement(ssnField, ssn);

    }

    public void clickContinueButton(){

        clickOnElement(continueButton);

    }

    public String getErrorMessage(){

        return getTrimmedElementText(errorMessage);

    }

}
