package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticlePage extends SharedStepsUI {

    @FindBy (xpath = "//header[@class='article-header']")
    public WebElement articleHeader;

    public ArticlePage() {

        PageFactory.initElements(driver,this);

    }
}
