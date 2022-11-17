package application.system;

import application.shared.SharedStepsUI;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    public HomePage() {

        PageFactory.initElements(driver,this);

    }


}
