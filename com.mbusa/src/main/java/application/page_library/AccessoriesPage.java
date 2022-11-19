package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage extends BasePage {

    @FindBy (xpath = "//h2[@class='default-content-section_header ']")
    public WebElement searchHeader;

    public AccessoriesPage() {

        PageFactory.initElements(driver,this);

    }

    public String getHeaderText(){

        return getTrimmedElementText(searchHeader);

    }

}
