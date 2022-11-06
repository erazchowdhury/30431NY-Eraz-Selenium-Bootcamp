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

    @FindBy (xpath = "//a[@class='open-comment-form']")
    public WebElement writeReviewButton;

    @FindBy (xpath = "//div[@class='star']/a")
    public List<WebElement> starButtons;

    @FindBy (id = "comment_title")
    public WebElement titleField;

    @FindBy (id = "content")
    public WebElement commentField;

    @FindBy (id = "submitNewMessage")
    public WebElement sendButton;

    @FindBy (xpath = "//div[@class='fancybox-skin']")
    public WebElement confirmationWindow;

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

    public void clickWriteReviewButton() {

        clickOnElement(writeReviewButton);

    }

    public void selectRating(int rating){

        clickOnElementFromList(starButtons, rating);

    }

    public void inputTitle(String title){

        sendKeysToElement(titleField, title);

    }

    public void inputComment(String comment){

        sendKeysToElement(commentField, comment);

    }

    public void clickSendButton(){

        clickOnElement(sendButton);

    }

    public void writeReview(int rating, String title, String comment){

        clickWriteReviewButton();
        selectRating(rating);
        inputTitle(title);
        inputComment(comment);
        clickSendButton();

    }

}
