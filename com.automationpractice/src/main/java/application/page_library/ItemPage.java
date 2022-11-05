package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemPage extends SharedStepsUI {

    @FindBy(xpath = "//form[@id='buy_block']//button[@type='submit']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy (xpath = "//a[contains(@class,'up')]")
    public WebElement increaseQuantityButton;

    @FindBy (id = "group_1")
    public WebElement sizeDropdown;

    @FindBy (xpath = "//a[@class='color_pick']")
    public List<WebElement> unselectedColorButtons;

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

    public void clickIncreaseQuantityButton() {

        clickOnElement(increaseQuantityButton);

    }

    public void selectSize(String size) {

        selectFromDropdownByVisibleText(sizeDropdown, size);

    }

    public void clickColor(int colorIndex) {
        try {
            clickOnElement(unselectedColorButtons.get(colorIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(unselectedColorButtons.get(unselectedColorButtons.size() - 1));
        }
    }

    public void selectQuantitySizeAndColor(String size, int colorIndex){

        clickIncreaseQuantityButton();
        selectSize(size);
        clickColor(colorIndex);

    }

}
