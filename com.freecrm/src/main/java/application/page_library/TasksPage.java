package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@href='/tasks/new']")
    public WebElement createTaskButton;

    public TasksPage() {

        PageFactory.initElements(driver, this);

    }

    public CreateTaskPage clickCreateTaskButton(){

        clickOnElement(createTaskButton);

        return new CreateTaskPage();

    }

}
