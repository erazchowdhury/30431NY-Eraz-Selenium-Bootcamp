package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@data-stid='open-hotel-information']")
    public List<WebElement> stayResults;

    public SearchResultsPage() {

        PageFactory.initElements(driver,this);

    }

    public void selectStay(int stayOption){

        clickOnElementFromList(stayResults, stayOption);

    }

}
