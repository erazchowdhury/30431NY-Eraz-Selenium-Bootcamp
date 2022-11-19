package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBMWAppPage extends SharedStepsUI {

    @FindBy (xpath = "//h1[contains(text(),'THE MY BMW APP')]")
    public WebElement pageHeader;

    public MyBMWAppPage() {

        PageFactory.initElements(driver,this);

    }

    public String getHeaderText(){

        return getTrimmedElementText(pageHeader);

    }

}
