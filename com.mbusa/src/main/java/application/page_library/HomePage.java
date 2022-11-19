package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SharedStepsUI {

    public HomePage() {

        PageFactory.initElements(driver,this);

    }
}
