package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (id = "forgot-oid-pwd")
    public WebElement forgotIDPasswordLink;

    public HomePage() {

        PageFactory.initElements(driver, this);

    }

    public ForgotIDPasswordPage clickForgotIDPasswordLink() {

        clickOnElement(forgotIDPasswordLink);

        return new ForgotIDPasswordPage();

    }

}
