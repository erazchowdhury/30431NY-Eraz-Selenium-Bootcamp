package application.page_library;

import application.shared.SharedStepsUI;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    @FindBy(xpath = "//ul[@id='homefeatured']//a[@title='Faded Short Sleeve T-shirts' and @class='product-name']")
    public WebElement fadedShortSleeveTShirtProductLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickFadedShortSleeveTShirtProductLink() {
        clickOnElement(fadedShortSleeveTShirtProductLink);

//        return new FadedShortSleeveTShirtPage();
    }

}
