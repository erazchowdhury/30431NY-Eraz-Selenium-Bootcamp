package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class CreateCompanyPage extends SharedStepsUI {

    @FindBy (xpath = "//input[@name='name' and @autocomplete='new-password']")
    public WebElement companyNameField;

    @FindBy (xpath = "//button[contains(@class,'toggle button')]")
    public WebElement accessButton;

    @FindBy (xpath = "//div[@class='twelve wide field']//i[@class='dropdown icon']")
    public WebElement selectedUserAccessDropdownIcon;

    @FindBy (xpath = "//div[@class='visible menu transition']//div")
    public List<WebElement> usersAvailable;

    @FindBy (xpath = "//input[@name='address']")
    public WebElement streetAddressField;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement cityField;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipcodeField;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement stateField;

    @FindBy (xpath = "//input[@name='value' and @placeholder='Number']")
    public WebElement phoneNumberField;

    @FindBy (xpath = "//textarea")
    public WebElement descriptionField;

    @FindBy (xpath = "//div[@name='priority']/i")
    public WebElement priorityDropdownButton;

    @FindBy (xpath = "//div[@class='visible menu transition']//div[@name='priority']")
    public List<WebElement> priorityOptions;

    @FindBy (xpath = "//input[@name='fileField']")
    public WebElement imageUpload;

    @FindBy (xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;

    public CreateCompanyPage() {

        PageFactory.initElements(driver,this);

    }

    public ItemDetailsPage createCompany(String companyName, int userIndex, String streetAddress,
                                         String city, String state, String zipcode, String phoneNumber, String description,
                                         int priorityIndex, String imagePath) {

        enterCompanyName(companyName);
        clickAccessButton();
        clickSelectedUserAccessDropdownIcon();
        selectUserToGiveAccess(userIndex);
        enterStreetAddress(streetAddress);
        enterCity(city);
        enterState(state);
        enterZipcode(zipcode);
        enterPhoneNumber(phoneNumber);
        enterDescription(description);
        clickPriorityDropdownButton();
        clickOnPriorityOption(priorityIndex);
        sendImage(imagePath);
        clickSaveButton();

        return new ItemDetailsPage();

    }

    public void enterCompanyName(String companyName) {

        sendKeysToElement(companyNameField, companyName);

    }

    public void clickAccessButton(){

        clickOnElement(accessButton);

    }

    public void clickSelectedUserAccessDropdownIcon(){

        clickOnElement(selectedUserAccessDropdownIcon);

    }

    public void selectUserToGiveAccess(int index){

        clickOnElementFromList(usersAvailable, index);

    }

    public void enterStreetAddress(String streetAddress) {

        sendKeysToElement(streetAddressField, streetAddress);

    }

    public void enterCity(String city) {

        sendKeysToElement(cityField, city);

    }

    public void enterState(String state) {

        sendKeysToElement(stateField, state);

    }

    public void enterZipcode(String zipcode) {

        sendKeysToElement(zipcodeField, zipcode);

    }

    public void enterPhoneNumber(String phoneNumber){

        sendKeysToElement(phoneNumberField, phoneNumber);

    }

    public void enterDescription(String description){

        sendKeysToElement(descriptionField, description);

    }

    public void clickPriorityDropdownButton(){

        clickOnElement(priorityDropdownButton);

    }

    public void clickOnPriorityOption(int index){

        clickOnElementFromList(priorityOptions, index);

    }

    public void sendImage(String imagePath) {

//        sendKeysToElement(imageUpload, imagePath);
        imageUpload.sendKeys(imagePath);

    }

    public void clickSaveButton(){

        clickOnElement(saveButton);

    }

}
