package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelPage extends SharedStepsUI {

    @FindBy (xpath = "//h1[@class='model-page-hero__model-name-name']")
    public WebElement modelHeader;

    public ModelPage() {

        PageFactory.initElements(driver,this);

    }

    public String getModelName(){

        return getTrimmedElementText(modelHeader);

    }

}
