package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokerPage extends BasePage {

    @FindBy (xpath = "//img[@class='header-broker-logo js-header-broker-logo']")
    public WebElement brokerLogo;

    public BrokerPage() {

        PageFactory.initElements(driver, this);

    }
}
