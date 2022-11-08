package application.shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//span[@class='user-display']")
    public WebElement userDisplay;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public String getAccountName(){

        return getTrimmedElementText(userDisplay);

    }

}
