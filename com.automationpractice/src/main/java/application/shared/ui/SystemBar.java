package application.shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(className = "login")
    public WebElement signInButton;

    @FindBy (xpath = "//a[@title='Contact Us']")
    public WebElement contactUsButton;

    @FindBy (css = ".shopping_cart > a")
    public WebElement shoppingCartButton;

    @FindBy (id = "search_query_top")
    public WebElement searchBar;

    @FindBy (xpath = "//button[@name='submit_search']")
    public WebElement searchSubmitButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

//    public SignInPage clickSignInButton() {
//        clickElement(signInButton);
//
//        return new SignInPage();
//    }
//
//    public ContactUsPage clickContactUsButton() {
//        clickElement(contactUsButton);
//
//        return new ContactUsPage();
//    }
//
//    public ShoppingCartPage clickShoppingCartButton() {
//        clickElement(shoppingCartButton);
//
//        return new ShoppingCartPage();
//    }
//
//    public void inputSearchTerm(String searchTerm) {
//        sendKeysToElement(searchBar, searchTerm);
//    }
//
//    public void clickSearchSubmitButton() {
//        clickElement(searchSubmitButton);
//    }
//
//    public ProductsPage doSearch(String searchTerm) {
//        inputSearchTerm(searchTerm);
//        clickSearchSubmitButton();
//
//        return new ProductsPage();
//    }



}
