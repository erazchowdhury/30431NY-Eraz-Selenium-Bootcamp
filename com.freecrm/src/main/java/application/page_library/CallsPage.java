package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallsPage extends SharedStepsUI {

    @FindBy(xpath = "//a[@href='/calls/new']")
    public WebElement newCallButton;

    public CallsPage() {

        PageFactory.initElements(driver,this);

    }

    public CreateCallPage clickNewCallButton(){

        clickOnElement(newCallButton);

        return new CreateCallPage();

    }

}
