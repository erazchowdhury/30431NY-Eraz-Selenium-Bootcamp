package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GameDetailsPage extends SharedStepsUI {

    @FindBy (xpath = "//div[@class='competitors' or @class='sticky']")
    public WebElement gameDetailsContainer;

    @FindBy (id = "content-wrapper")
    public WebElement gameDetailsWrapper;

    public GameDetailsPage() {

        PageFactory.initElements(driver,this);

    }
}
