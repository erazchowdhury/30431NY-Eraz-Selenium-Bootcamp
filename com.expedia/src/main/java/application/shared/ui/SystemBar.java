package application.shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//div[2]//button[@tabindex='0']")
    public WebElement signInLink;

    @FindBy (xpath = "//a[text()='Sign in']")
    public WebElement signInButton;

    public SystemBar() {

        PageFactory.initElements(driver, this);

    }

    public void clickSignInLink(){

//        synchronized (webDriverWait){
//            try {
//                webDriverWait.wait(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        clickOnElement(signInLink);

    }

    public void clickSignInButton(){

        clickOnElement(signInButton);

    }

}
