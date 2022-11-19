package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    @FindBy (id = "quickSearchLookup")
    public WebElement searchBar;

    @FindBy (xpath = "//a[@title='Search apartments for rent']")
    public WebElement searchButton;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public SearchResultsPage doSearch(String searchTerm){

        inputSearch(searchTerm);
        synchronized (webDriverWait){

            try {
                webDriverWait.wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        clickSearchButton();

        return new SearchResultsPage();

    }

    public void inputSearch(String searchTerm){

        sendKeysToElement(searchBar, searchTerm);

    }

    public void clickSearchButton(){

        clickOnElement(searchButton);

    }

}
