package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    @FindBy (xpath = "//h2[contains(text(),'Our latest')]")
    public WebElement latestHeader;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

}
