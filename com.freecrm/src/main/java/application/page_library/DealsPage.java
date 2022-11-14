package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@href='/deals/new']")
    public WebElement createDealButton;

    public DealsPage() {

        PageFactory.initElements(driver,this);

    }

    public CreateDealPage clickCreateDealButton() {

        clickOnElement(createDealButton);

        return new CreateDealPage();

    }

}
