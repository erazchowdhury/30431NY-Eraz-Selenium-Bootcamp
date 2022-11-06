package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends SharedStepsUI {

    @FindBy (xpath = "//a[@title='Orders']")
    public WebElement orderHistoryButton;

    @FindBy (xpath = "//p[@class='info-account']")
    public WebElement welcomeMessage;

    public AccountPage() {

        PageFactory.initElements(driver, this);

    }

    public OrderHistoryPage clickOrderHistoryButton() {

        clickOnElement(orderHistoryButton);

        return new OrderHistoryPage();

    }

    public String getTextFromMessage() {

        return getTrimmedElementText(welcomeMessage);

    }

}
