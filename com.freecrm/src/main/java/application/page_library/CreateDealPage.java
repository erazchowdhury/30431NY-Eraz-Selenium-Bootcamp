package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateDealPage extends SharedStepsUI {

    @FindBy (xpath = "//input[@name='title']")
    public WebElement dealNameField;

    @FindBy (xpath = "//input[@class='calendarField']")
    public WebElement closeDateField;

    @FindBy (xpath = "//div[@class='react-datepicker']//div[@role='option' and not(contains(@class,'outside'))]")
    public List<WebElement> closeDatePickerDays;

    @FindBy (xpath = "//li[@class='react-datepicker__time-list-item ']")
    public List<WebElement> closeDatePickerTime;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveDealButton;

    @FindBy (xpath = "//form[@class='ui form segment custom-form-container']")
    public WebElement createDealForm;

    public CreateDealPage() {

        PageFactory.initElements(driver,this);

    }

    public ItemDetailsPage createDeal(String dealName, int day, int timeIndex){

        inputDealName(dealName);
        clickCloseDateField();
        clickDatePickerDay(day);
        clickDatePickerTime(timeIndex);
        clickSaveDealButton();

        return new ItemDetailsPage();

    }

    public void inputDealName(String dealName){

        sendKeysToElement(dealNameField, dealName);

    }

    public void clickCloseDateField(){

        clickOnElement(closeDateField);

    }

    public void clickDatePickerDay(int day){

        clickOnElementFromList(closeDatePickerDays, day);

    }

    public void clickDatePickerTime(int timeIndex){

        clickOnElementFromList(closeDatePickerTime, timeIndex);

    }

    public void clickSaveDealButton(){

        clickOnElement(saveDealButton);

    }

}
