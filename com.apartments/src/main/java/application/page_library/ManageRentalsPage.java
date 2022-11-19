package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageRentalsPage extends BasePage {

    @FindBy (xpath = "//h1[contains(text(),'Rental management software simplified')]")
    public WebElement header;

    public ManageRentalsPage() {

        PageFactory.initElements(driver,this);

    }
}
