package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage extends SharedStepsUI {

    @FindBy (id = "propertyName")
    public WebElement propertyName;

    public ListingPage() {

        PageFactory.initElements(driver,this);

    }
}
