package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntroPage extends BasePage {

    @FindBy (xpath = "//*[text()='Login']")
    public WebElement loginButton;

    public IntroPage() {

        PageFactory.initElements(driver, this);

    }

    public AuthenticationPage clickLoginButton(){

        clickOnElement(loginButton);

        return new AuthenticationPage();

    }

}
