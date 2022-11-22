package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasesPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@href='/cases/new']")
    public WebElement createCaseButton;

    public CasesPage() {

        PageFactory.initElements(driver,this);

    }

    public CreateCasesPage clickCreateCaseButton(){

        clickOnElement(createCaseButton);

        return new CreateCasesPage();

    }

}
