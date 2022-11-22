package application.shared.ui;

import application.page_library.*;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//span[@class='user-display']")
    public WebElement userDisplay;


    @FindBy (xpath = "//a[@href='/calendar']")
    public WebElement calendarButton;

    @FindBy (xpath = "//a[@href='/companies']")
    public WebElement companiesButton;

    @FindBy (xpath = "//a[@href='/contacts']")
    public WebElement contactsButton;

    @FindBy (xpath = "//a[@href='/deals']")
    public WebElement dealsButton;

    @FindBy (xpath = "//a[@href='/tasks']")
    public WebElement tasksButton;

    @FindBy (xpath = "//a[@href='/calls']")
    public WebElement callsButton;

    @FindBy (xpath = "//a[@href='/cases']")
    public WebElement casesButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public String getAccountName(){

        return getTrimmedElementText(userDisplay);

    }

    public EventsPage clickCalendarButton(){

        clickOnElement(calendarButton);

        return new EventsPage();

    }

    public CompaniesPage clickCompaniesButton(){

        clickOnElement(companiesButton);

        return new CompaniesPage();

    }

    public ContactsPage clickContactsButton(){

        clickOnElement(contactsButton);

        return new ContactsPage();

    }

    public DealsPage clickDealsButton() {

        clickOnElement(dealsButton);

        return new DealsPage();

    }

    public TasksPage clickTasksButton() {

        clickOnElement(tasksButton);

        return new TasksPage();

    }

    public CallsPage clickCallsButton(){

        clickOnElement(callsButton);

        return new CallsPage();

    }

    public CasesPage clicksCasesButton(){

        clickOnElement(casesButton);

        return new CasesPage();

    }

}
