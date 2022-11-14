package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateCallPage extends SharedStepsUI {

    @FindBy (xpath = "//div[@class='two fields'][1]//input[@class='calendarField']")
    public WebElement callTimeField;

    @FindBy (xpath = "//div[@class='react-datepicker']//div[@role='option' and not(contains(@class,'outside'))]")
    public List<WebElement> callTimeDay;

    @FindBy (xpath = "//li[@class='react-datepicker__time-list-item ']")
    public List<WebElement> callTime;

    @FindBy (xpath = "//div[@class='two fields'][1]//i[@class='dropdown icon']")
    public WebElement assignedToDropdownButton;

    @FindBy (xpath = "//div[@class='visible menu transition']//div")
    public List<WebElement> assignedToOptions;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveCallButton;

    @FindBy (xpath = "//form[@class='ui form segment custom-form-container']")
    public WebElement createCallForm;

    public CreateCallPage() {

        PageFactory.initElements(driver,this);

    }

    public ItemDetailsPage createCall(int day, int timeIndex, int optionIndex){

        clickCallTimeField();
        clickDatePickerDay(day);
        clickDatePickerTime(timeIndex);
        clickAssignedToDropdownButton();
        selectAssignedToOptions(optionIndex);
        clickSaveCallButton();

        return new ItemDetailsPage();

    }

    public void clickCallTimeField(){

        clickOnElement(callTimeField);

    }

    public void clickDatePickerDay(int day){

        clickOnElementFromList(callTimeDay, day);

    }

    public void clickDatePickerTime(int timeIndex){

        clickOnElementFromList(callTime, timeIndex);

    }

    public void clickAssignedToDropdownButton(){

        clickOnElement(assignedToDropdownButton);

    }

    public void selectAssignedToOptions(int optionIndex){

        clickOnElementFromList(assignedToOptions, optionIndex);

    }

    public void clickSaveCallButton(){

        clickOnElement(saveCallButton);

    }

}
