package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiveGPage extends SharedStepsUI {

    @FindBy (xpath = "//h1")
    public WebElement header;

    public FiveGPage() {

        PageFactory.initElements(driver,this);

    }

    public String getHeaderText(){

        return getTrimmedElementText(header);

    }

}
