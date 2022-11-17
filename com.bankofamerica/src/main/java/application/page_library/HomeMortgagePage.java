package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeMortgagePage extends BasePage {

    @FindBy (id = "purchase-price-input-medium")
    public WebElement purchasePriceField;

    @FindBy (id = "down-payment-input-medium")
    public WebElement downPaymentField;

    @FindBy (id = "zip-code-input-medium")
    public WebElement zipCodeField;

    @FindBy (id = "update-button-medium")
    public WebElement updateRatesButton;

    @FindBy (xpath = "//div[@data-product-name='Fixed 30 Years']//div[@class='medium-3 columns']//span[@class='update-partial']")
    public WebElement thirtyYearMonthlyFixedPayment;

    @FindBy (xpath = "//*[@id=\"update-button-medium\"]/span[2]")
    public WebElement spinner;

    public HomeMortgagePage() {

        PageFactory.initElements(driver,this);

    }

    public void inputPurchasePrice(String purchasePrice){

        clearSendKeysToElement(purchasePriceField, purchasePrice);

    }

    public void inputDownPayment(String downPayment){

        clearSendKeysToElement(downPaymentField, downPayment);

    }

    public void inputZipCode(String zipCode){

        clearSendKeysToElement(zipCodeField, zipCode);

    }

    public void clickUpdatesRateButton(){

        clickOnElement(updateRatesButton);

    }

    public String getThirtyYearMonthlyPayment(){

        return getTrimmedElementText(thirtyYearMonthlyFixedPayment);

    }

}
