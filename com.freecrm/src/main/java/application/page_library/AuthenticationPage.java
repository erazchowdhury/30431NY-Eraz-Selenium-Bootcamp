package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AuthenticationPage extends BasePage {

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy (xpath = "//*[text()='Login']")
    public WebElement loginButton;

    public AuthenticationPage(){

        PageFactory.initElements(driver,this);

    }

    public void inputEmail(String email){

        sendKeysToElement(emailField, email);

    }

    public void inputPassword(String password){

        sendKeysToElement(passwordField, password);

    }


    public HomePage login(String email, String password) throws AWTException {

        inputEmail(email);
        inputPassword(password);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        return new HomePage();

    }

}
