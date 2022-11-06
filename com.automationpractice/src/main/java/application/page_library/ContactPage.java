package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends SharedStepsUI {

    @FindBy(id = "id_contact")
    public WebElement subjectHeadingComboBox;

    @FindBy (id = "email")
    public WebElement emailAddressField;

    @FindBy (id = "fileUpload")
    public WebElement fileUpload;

    @FindBy (id = "message")
    public WebElement messageField;

    @FindBy (id = "submitMessage")
    public WebElement sendButton;

    @FindBy (xpath = "//p[@class='alert alert-success']")
    public WebElement successParagraph;

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectSubjectHeading (String heading) {

        selectFromDropdownByVisibleText(subjectHeadingComboBox, heading);

    }

    public void inputEmailAddress (String emailAddress) {

        sendKeysToElement(emailAddressField,emailAddress);

    }

    public void selectFile (String filePath) {

//        sendKeysToElement(fileUpload, filePath);
        fileUpload.sendKeys(filePath);

    }

    public void inputMessage (String message) {

        sendKeysToElement(messageField, message);

    }

    public void clickSendButton() {

        clickOnElement(sendButton);

    }

    public void sendMessageOnContactPage(String heading, String emailAddress, String filePath, String message) {

        selectSubjectHeading(heading);
        inputEmailAddress(emailAddress);
        selectFile(filePath);
        inputMessage(message);
        clickSendButton();

    }

    public String getConfirmationMessage() {
        return getTrimmedElementText(successParagraph);
    }

}
