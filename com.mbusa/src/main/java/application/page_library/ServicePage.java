package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage extends SharedStepsUI {

    @FindBy(xpath = "//h1[text()='Service that works best for you.']")
    public WebElement mainHeader;

    public ServicePage() {

        PageFactory.initElements(driver,this);

    }

    public String getHeaderText(){

        return getTrimmedElementText(mainHeader);

    }

}
