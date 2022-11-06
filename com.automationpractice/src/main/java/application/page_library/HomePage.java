package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedStepsUI {

    @FindBy(xpath = "//ul[@id='homefeatured']//a[@class='product-name']")
    public List<WebElement> featuredProducts;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement newsletterConfirmation;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public ItemPage clickFeaturedProduct(int productIndex) {
        try {
            clickOnElement(featuredProducts.get(productIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(featuredProducts.get(featuredProducts.size() - 1));
        }
        return new ItemPage();
    }

}
