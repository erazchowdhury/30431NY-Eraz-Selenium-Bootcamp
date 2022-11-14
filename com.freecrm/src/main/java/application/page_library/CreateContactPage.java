package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateContactPage extends SharedStepsUI {

    @FindBy (xpath = "//input[@name='first_name']")
    public WebElement firstNameField;

    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement lastNameField;

    @FindBy (xpath = "//div[@name='category']/i")
    public WebElement categoryDropdownButton;

    @FindBy (xpath = "//div[@name='category' and @role='option']")
    public List<WebElement> categoryOptions;

    @FindBy (xpath = "//input[@name='do_not_call']")
    public WebElement doNotCallCheckbox;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveContactButton;

    @FindBy (xpath = "//form[@class='ui form segment custom-form-container']")
    public WebElement createContactForm;

    public CreateContactPage() {

        PageFactory.initElements(driver, this);

    }

    public ItemDetailsPage createContact(String firstName, String lastName, int index){

        enterFirstName(firstName);
        enterLastName(lastName);
        clickCategoryDropdownButton();
        selectCategoryOption(index);
        clickDoNotCallCheckbox();
        clickSaveContactButton();

        return new ItemDetailsPage();

    }

    public ItemDetailsPage createSimpleContact(String firstName, String lastName){

        enterFirstName(firstName);
        enterLastName(lastName);
        clickSaveContactButton();

        return new ItemDetailsPage();

    }

    public void enterFirstName(String firstName){

        sendKeysToElement(firstNameField,firstName);

    }

    public void enterLastName(String lastName){

        sendKeysToElement(lastNameField,lastName);

    }

    public void clickCategoryDropdownButton(){

        clickOnElement(categoryDropdownButton);

    }

    public void selectCategoryOption(int index){

        clickOnElementFromList(categoryOptions, index);

    }

    public void clickDoNotCallCheckbox(){

        safeClickOnElement(doNotCallCheckbox);

    }

    public void clickSaveContactButton() {

        clickOnElement(saveContactButton);

    }


}
