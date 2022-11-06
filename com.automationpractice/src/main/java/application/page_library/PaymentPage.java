package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends SharedStepsUI {

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    public WebElement payByBankWireButton;

    @FindBy (xpath = "//p[@id='cart_navigation']//button[@type='submit']")
    public WebElement confirmOrderButton;

    @FindBy (xpath = "//p//strong[@class='dark']")
    public WebElement confirmationMessage;

    public PaymentPage() {

        PageFactory.initElements(driver, this);

    }

    public void clickPayByBankWireButton() {

        clickOnElement(payByBankWireButton);

    }

    public void clickConfirmOrderButton() {

        clickOnElement(confirmOrderButton);

    }

    public String getTextFromMessage() {
        return getTrimmedElementText(confirmationMessage);
    }

}
