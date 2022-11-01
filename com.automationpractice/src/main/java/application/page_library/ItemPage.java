package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends SharedStepsUI {

    @FindBy(xpath = "//form[@id='buy_block']//button[@type='submit']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public ItemPage() {

        PageFactory.initElements(driver, this);

    }

    public void clickAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void clickProceedToCheckoutButton() {
        clickOnElement(proceedToCheckoutButton);
    }

    public ShoppingCartPage addItemToCartAndProceedToCheckout() {

        clickAddToCartButton();
        clickProceedToCheckoutButton();

        return new ShoppingCartPage();

    }

}
