package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage extends SharedStepsUI {

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;

    @FindBy (xpath = "//table")
    public WebElement contactTable;

    @FindBy(xpath = "//tbody//tr//td[2]/a")
    public List<WebElement> contactNameLinks;

    public ContactsPage() {

        PageFactory.initElements(driver,this);

    }

    public CreateContactPage clickCreateButton(){

        clickOnElement(createButton);

        return new CreateContactPage();

    }

    public String getMostRecentlyCreatedContactName(){

        return getTrimmedElementText(contactNameLinks.get(0));

    }

}
