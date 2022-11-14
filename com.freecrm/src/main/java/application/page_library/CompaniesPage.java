package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage extends SharedStepsUI {

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;

    public CompaniesPage() {

        PageFactory.initElements(driver, this);

    }

    public CreateCompanyPage clickCreateButton(){

        clickOnElement(createButton);

        return new CreateCompanyPage();

    }

}
