package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessLandingPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@name='Bread Crumb']")
    public WebElement businessPageLink;

    public BusinessLandingPage() {

        PageFactory.initElements(driver,this);

    }

    public String getBusinessPageLinkText(){

        return getTrimmedElementText(businessPageLink);

    }

}
