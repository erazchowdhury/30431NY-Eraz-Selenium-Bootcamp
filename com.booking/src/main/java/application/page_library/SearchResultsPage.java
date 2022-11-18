package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends SharedStepsUI {

    public SearchResultsPage() {

        PageFactory.initElements(driver,this);

    }
}
