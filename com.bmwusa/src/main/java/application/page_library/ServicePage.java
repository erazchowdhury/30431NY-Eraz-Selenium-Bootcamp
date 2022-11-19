package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage extends BasePage {

    @FindBy (xpath = "//h3[text()='COMPREHENSIVE MAINTENANCE FOR THE LIFE OF YOUR BMW.']")
    public WebElement  paragraphHeader;

    public ServicePage() {

        PageFactory.initElements(driver, this);

    }
}
