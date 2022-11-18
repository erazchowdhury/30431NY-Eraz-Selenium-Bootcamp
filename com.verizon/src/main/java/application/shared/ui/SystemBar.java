package application.shared.ui;

import application.page_library.ItemPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy (id = "gnav20-search-icon")
    public WebElement searchButton;

    @FindBy (id = "search_box_gnav_input")
    public WebElement searchField;

    @FindBy (xpath = "//li[@role='listitem']/a")
    public List<WebElement> searchResults;

    public SystemBar() {

        PageFactory.initElements(driver,this);

    }

    public ItemPage searchForItem(String searchTerm, int index){

        clickSearchButton();
        inputSearchTerm(searchTerm);
        selectSearchResult(index);

        return new ItemPage();

    }

    public void clickSearchButton(){

        clickOnElement(searchButton);

    }

    public void inputSearchTerm(String searchTerm){

        sendKeysToElement(searchField, searchTerm);

    }

    public void selectSearchResult(int index){

        synchronized (webDriverWait){
            try {
                webDriverWait.wait(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        clickOnElementFromList(searchResults, index);

    }

}
