package application.page_library;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {

        PageFactory.initElements(driver, this);

    }

}
