package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateEventPage extends SharedStepsUI {

    @FindBy (xpath = "//form[@class='ui form segment custom-form-container']")
    public WebElement createEventForm;

    @FindBy (xpath = "//input[@name='title']")
    public WebElement eventTitleField;

    @FindBy (xpath = "//textarea[@name='location']")
    public WebElement locationField;

    @FindBy (xpath = "//div[@name='participants']/input")
    public WebElement participantsComboBox;

    @FindBy (xpath = "//a[text()='No recurrence. Click to set.']")
    public WebElement setRecurrenceLink;

    @FindBy (xpath = "//div[@name='byweekday']")
    public WebElement recurrenceDaysField;

    @FindBy (xpath = "//div[@name='byweekday']//div[@role='option']")
    public List<WebElement> recurrenceDayOptions;

    @FindBy (xpath = "//div[@class='actions']//button[@class='ui button']")
    public WebElement setRecurrenceButton;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveEventButton;

    public CreateEventPage() {

        PageFactory.initElements(driver, this);

    }

    public ItemDetailsPage createEvent(String title, String location, String participant){

        inputEventTitle(title);
        inputLocation(location);
        inputNewParticipant(participant);
        clickSetRecurrenceLink();
        clickRecurrenceDaysField();
        clickAllRecurrenceDayOptions();
        clickSetRecurrenceButton();
        clickSaveEventButton();

        return new ItemDetailsPage();

    }

    public void inputEventTitle(String title){

        sendKeysToElement(eventTitleField, title);

    }

    public void inputLocation(String location){

        sendKeysToElement(locationField, location);

    }

    public void inputNewParticipant(String participant){

        sendKeysToElement(participantsComboBox, participant);
        pressEnter();

    }

    public void clickSetRecurrenceLink(){

        clickOnElement(setRecurrenceLink);

    }

    public void clickRecurrenceDaysField(){

        clickOnElement(recurrenceDaysField);

    }

    public void clickAllRecurrenceDayOptions(){

        while(recurrenceDayOptions.size() > 0){

            clickOnElementFromList(recurrenceDayOptions, 0);

        }

    }

    public void clickSetRecurrenceButton(){

        clickOnElement(setRecurrenceButton);

    }

    public void clickSaveEventButton(){

        clickOnElement(saveEventButton);

    }

}
