package application.shared.ui;

import application.page_library.AuthenticationPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//div[6]/a")
    public WebElement signInButton;

    public SystemBar() {

        PageFactory.initElements(driver,this);

    }

    public AuthenticationPage clickSignInButton(){

        safeClickOnElement(signInButton);

        return new AuthenticationPage();

    }

}
