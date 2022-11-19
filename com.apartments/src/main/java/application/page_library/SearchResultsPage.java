package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy (xpath = "//div[@class='property-title-wrapper']//a[@class='property-link']")
    public List<WebElement> propertyTextLinks;

    public SearchResultsPage() {

        PageFactory.initElements(driver,this);

    }

    public ListingPage clickPropertyTextLink(int index){

        synchronized (webDriverWait){

            try {
                webDriverWait.wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        clickOnElementFromList(propertyTextLinks, index);

        return new ListingPage();

    }

}
