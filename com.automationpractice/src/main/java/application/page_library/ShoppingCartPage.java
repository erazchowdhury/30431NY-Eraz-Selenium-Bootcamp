package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPage extends SharedStepsUI {

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy (className = "cart_quantity_delete")
    public List<WebElement> removeFromCartButtons;

    @FindBy (xpath = "//p[@class='alert alert-warning']")
    public WebElement cartEmptyMessage;

    public ShoppingCartPage() {

        PageFactory.initElements(driver, this);

    }

    public AuthenticationPage clickProceedToCheckoutButton() {

        clickOnElement(proceedToCheckoutButton);

        return new AuthenticationPage();

    }

    public void clickRemoveFromCartButton(int productIndex) {

        clickOnElementFromList(removeFromCartButtons, productIndex);

    }

}
