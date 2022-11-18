package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedStepsUI {

    @FindBy (xpath = "//input[@name='ss']")
    public WebElement destinationField;

    @FindBy (xpath = "//div[@data-calendar2-type='checkin']")
    public WebElement datePicker;

    @FindBy (xpath = "//button[@data-testid='date-display-field-start']")
    public WebElement datePicker2;

    @FindBy (xpath = "//td[@class='bui-calendar__date']")
    public List<WebElement> dates;

    @FindBy (xpath = "//td[@role='gridcell']")
    public List<WebElement> dates2;

    @FindBy (xpath = "//button[@class='sb-searchbox__button ']")
    public WebElement searchButton;

    @FindBy (xpath = "//form[@method='GET']//button[@type='submit']")
    public WebElement searchButton2;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public SearchResultsPage searchForStay(String destination, int startDate, int endDate){

        inputDestination(destination);
        clickDatePicker();
        selectDate(startDate);
        selectDate(endDate);
        clickSearchButton();

        return new SearchResultsPage();

    }

    public void inputDestination(String destination){

        sendKeysToElement(destinationField,destination);

    }

    public void clickDatePicker(){

        try {
            safeClickOnElement(datePicker);
        } catch (NoSuchElementException e) {
            safeClickOnElement(datePicker2);
        }

    }

    public void selectDate(int index){

        try {
            clickOnElementFromList(dates, index);
        } catch (IndexOutOfBoundsException e) {
            clickOnElementFromList(dates2, index + 21);
        }

    }

    public void clickSearchButton(){

        try {
            clickOnElement(searchButton);
        } catch (TimeoutException e) {
            clickOnElement(searchButton2);
        }


    }

}
