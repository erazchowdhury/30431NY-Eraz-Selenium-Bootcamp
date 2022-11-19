package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialOffersPage extends SharedStepsUI {

    @FindBy (xpath = "//a[text()=' New Vehicle Offers ']")
    public WebElement searchHeader;

    public SpecialOffersPage() {

        PageFactory.initElements(driver,this);

    }

    public String getSearchHeaderText(){

        return getTrimmedElementText(searchHeader);

    }

}
