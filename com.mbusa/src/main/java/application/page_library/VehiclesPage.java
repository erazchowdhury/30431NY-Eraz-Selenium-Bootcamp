package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends SharedStepsUI {

    @FindBy (xpath = "//span[@class='amg-toggle__current-item']")
    public WebElement tabText;

    public VehiclesPage() {

        PageFactory.initElements(driver,this);

    }

    public String getTabText(){

        return getTrimmedElementText(tabText);

    }
}
