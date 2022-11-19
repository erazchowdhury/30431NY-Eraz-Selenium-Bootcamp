package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage extends BasePage {

    @FindBy (xpath = "//h2[contains(text(),'Welcome to the Apartments.com Help Center!')]")
    public WebElement header;

    public HelpCenterPage() {

        PageFactory.initElements(driver,this);

    }

    public String getHeaderText(){

        return getTrimmedElementText(header);

    }

}
