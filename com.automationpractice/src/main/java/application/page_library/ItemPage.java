package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends SharedStepsUI {

    public ItemPage() {

        PageFactory.initElements(driver, this);

    }

}
