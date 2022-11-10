package application.shared.ui;

import application.page_library.CompaniesPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//span[@class='user-display']")
    public WebElement userDisplay;

    @FindBy (xpath = "//a[@href='/calendar']")
    public WebElement calendarButton;

    @FindBy (xpath = "//a[@href='/companies']")
    public WebElement companiesButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public String getAccountName(){

        return getTrimmedElementText(userDisplay);

    }

    public void clickCalendarButton(){

        clickOnElement(calendarButton);

    }

    public CompaniesPage clickCompaniesButton(){

        clickOnElement(companiesButton);

        return new CompaniesPage();

    }

}
