package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateSignUpPage extends SharedStepsUI {

    @FindBy (id = "leadFirstName")
    public WebElement firstNameField;

    public UpdateSignUpPage() {

        PageFactory.initElements(driver,this);

    }
}
