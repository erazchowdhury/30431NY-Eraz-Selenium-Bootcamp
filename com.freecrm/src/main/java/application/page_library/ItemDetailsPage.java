package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPage extends SharedStepsUI {

//    @FindBy (xpath = "//div[@class='field'][1]//p")
//    public WebElement itemName;

    @FindBy (xpath = "//div[@class='ui header item mb5 light-black']")
    public WebElement itemName;

    @FindBy (xpath = "//div[@class='ui header item mb5 light-black']/span")
    public WebElement itemNameForCall;

    @FindBy (xpath = "//i[@class='trash icon']")
    public WebElement deleteButton;

    @FindBy (xpath = "//button[@class='ui red button']")
    public WebElement confirmDeleteButton;

    public ItemDetailsPage() {

        PageFactory.initElements(driver,this);

    }

    public ContactsPage deleteContact(){

        clickDeleteButton();
        clickConfirmDeleteButton();

        return new ContactsPage();

    }

    public String getName(){

//        try {
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        return getTrimmedElementText(itemName);

    }

    public String getCallName(){

        return getTrimmedElementText(itemNameForCall);

    }

    public void clickDeleteButton(){

        clickOnElement(deleteButton);

    }

    public void clickConfirmDeleteButton(){

        clickOnElement(confirmDeleteButton);

    }

}
