package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTaskPage extends SharedStepsUI {

    @FindBy (xpath = "//input[@name='title']")
    public WebElement taskNameField;

    @FindBy (xpath = "//textarea")
    public WebElement descriptionField;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveTaskButton;

    @FindBy (xpath = "//form[@class='ui form segment custom-form-container']")
    public WebElement createTaskForm;

    @FindBy (xpath = "//input[@name='completion']")
    public WebElement completionPercentField;

    @FindBy (xpath = "//p[text()='Completion must be between 0 and 100']")
    public WebElement completionPercentErrorMessage;

    public CreateTaskPage() {

        PageFactory.initElements(driver,this);

    }

    public ItemDetailsPage createTask(String taskName, String description){

        inputTaskName(taskName);
        inputDescription(description);
        clickSaveTaskButton();

        return new ItemDetailsPage();

    }

    public void inputTaskName(String taskName){

        sendKeysToElement(taskNameField, taskName);

    }

    public void inputDescription(String description){

        sendKeysToElement(descriptionField, description);

    }

    public void clickSaveTaskButton(){

        clickOnElement(saveTaskButton);

    }

    public void inputCompletionPercent(String completionPercent){

        sendKeysToElement(completionPercentField, completionPercent);

    }


    public String getCompletionPercentErrorMessage(){

        return getTrimmedElementText(completionPercentErrorMessage);

    }

}
