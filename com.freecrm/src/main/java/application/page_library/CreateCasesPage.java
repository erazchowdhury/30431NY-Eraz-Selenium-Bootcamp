package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateCasesPage extends SharedStepsUI {

    @FindBy (xpath = "//input[@name='title']")
    public WebElement titleField;

    @FindBy (xpath = "//div[@class='ui fluid multiple selection dropdown']//i[@class='dropdown icon']")
    public WebElement assignedToDropdownButton;

    @FindBy (xpath = "//div[@class='visible menu transition']//div[@role='option']")
    public List<WebElement> assignedToOptions;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;

    @FindBy (xpath = "//form[@class='ui form segment custom-form-container']")
    public WebElement createCaseForm;

    public CreateCasesPage() {

        PageFactory.initElements(driver,this);

    }

    public ItemDetailsPage createCase(String title, int index){

        inputCaseTitle(title);
        clickAssignedToDropdownButton();
        selectOption(index);
        clickSaveButton();

        return new ItemDetailsPage();

    }

    public void inputCaseTitle(String title){

        sendKeysToElement(titleField, title);

    }

    public void clickAssignedToDropdownButton(){

        clickOnElement(assignedToDropdownButton);

    }

    public void selectOption(int index){

        clickOnElementFromList(assignedToOptions, index);

    }

    public void clickSaveButton(){

        clickOnElement(saveButton);

    }

}
