package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EventsPage extends SharedStepsUI {

    @FindBy (xpath = "//div[@class='rbc-day-bg' or @class='rbc-day-bg rbc-today']")
    public List<WebElement> calendarDaysWithinMonth;

    public EventsPage() {

        PageFactory.initElements(driver, this);

    }

    public CreateEventPage clickDay(int day){

        clickOnElementFromList(calendarDaysWithinMonth, day);

        return new CreateEventPage();

    }

}
