package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends SharedStepsUI {

    @FindBy (xpath = "//h2[@class='globalnav-local__title label-1--bold']")
    public WebElement itemTitle;

    public ItemPage() {

        PageFactory.initElements(driver,this);

    }

    public String getItemTitle(){

        return getTrimmedElementText(itemTitle);

    }

}
