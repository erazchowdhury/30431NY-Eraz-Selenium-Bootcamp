package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends SharedStepsUI {

    @FindBy (xpath = "//div[@data-testid='titleId']")
    public WebElement itemName;

    public ItemPage() {

        PageFactory.initElements(driver,this);

    }

}
