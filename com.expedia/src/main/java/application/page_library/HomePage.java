package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedStepsUI {

    @FindBy (xpath = "//button[@aria-label='Going to']")
    public WebElement searchBarButton;

    @FindBy (id = "location-field-destination")
    public WebElement destinationField;

    @FindBy (xpath = "//button[@data-stid='location-field-destination-result-item-button']")
    public List<WebElement> searchResultOptions;

    @FindBy (id = "d1-btn")
    public WebElement datePickerButton;

    @FindBy (xpath = "//div[@class='uitk-date-picker-menu-months-container']//button[@type='button']")
    public List<WebElement> dates;

    @FindBy (xpath = "//button[@data-stid='apply-date-picker']")
    public WebElement doneButton;

    @FindBy (xpath = "//button[@data-testid='submit-button']")
    public WebElement searchButton;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public SearchResultsPage searchForStay(String destination, int index, int startDate, int endDate){

        clickSearchBarButton();
        inputDestination(destination);
        selectSearchOption(index);
        clickDatePickerButton();
        clickDate(startDate);
        clickDate(endDate);
        clickDoneButton();
        clickSearchButton();

        return new SearchResultsPage();

    }

    public void clickSearchBarButton(){

        clickOnElement(searchBarButton);

    }

    public void inputDestination(String destination){

        sendKeysToElement(destinationField,destination);

    }

    public void selectSearchOption(int index){

        synchronized (webDriverWait){
            try {
                webDriverWait.wait(2000);
                clickOnElementFromList(searchResultOptions, index);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public void clickDatePickerButton(){

        clickOnElement(datePickerButton);

    }

    public void clickDate(int index){

        clickOnElementFromList(dates, index);

    }

    public void clickDoneButton(){

        clickOnElement(doneButton);

    }

    public void clickSearchButton(){

        clickOnElement(searchButton);

    }

}
