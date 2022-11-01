package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BasePage {

    @FindBy(xpath = "//input[@id='cgv']")
    public WebElement termsOfServiceCheckbox;

    @FindBy (xpath = "//button[@name='processCarrier']")
    public WebElement proceedToCheckoutButton;

    public ShippingPage() {

        PageFactory.initElements(driver, this);

    }

    public void clickTermsOfServiceCheckbox() {

//        clickOnElement(termsOfServiceCheckbox);
        safeClickOnElement(termsOfServiceCheckbox);
//        termsOfServiceCheckbox.click();

    }

    public void clickProceedToCheckoutButton() {

        clickOnElement(proceedToCheckoutButton);

    }

    public PaymentPage agreeToTermsAndProceedToPayment() {

        clickTermsOfServiceCheckbox();
        clickProceedToCheckoutButton();

        return new PaymentPage();

    }

}
