package application.page_library;

import application.shared.SharedStepsUI;
import org.bouncycastle.math.raw.Mod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@class='search-results__result link link_plain-link']")
    public List<WebElement> searchResults;

    public SearchResultsPage() {

        PageFactory.initElements(driver,this);

    }

    public ModelPage selectSearchResult(int index){

        synchronized (webDriverWait){
            try {
                webDriverWait.wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        clickOnElementFromList(searchResults, index);

        return new ModelPage();
    }

}
