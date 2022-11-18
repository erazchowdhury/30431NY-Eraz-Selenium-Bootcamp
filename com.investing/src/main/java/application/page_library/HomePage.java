package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedStepsUI {

    @FindBy (xpath = "//table[@id='economicCalendarData']//a[@target='_blank']")
    public List<WebElement> economicEvents;

    @FindBy (xpath = "//div[@class='carousel carouselNews js-carousel-news newsCarouselWrapper']//a[@class='title']")
    public List<WebElement> headlineArticles;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public ItemDetailsPage selectEconomicEvent(int index){

        clickOnElementFromList(economicEvents, index);

        return new ItemDetailsPage();

    }

    public ItemDetailsPage clickArticle(int index){

        clickOnElementFromList(headlineArticles, index);

        return new ItemDetailsPage();

    }

}
