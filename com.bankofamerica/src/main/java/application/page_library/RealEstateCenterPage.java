package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RealEstateCenterPage extends BasePage {

    @FindBy (id = "Criteria/Location")
    public WebElement locationSearchBar;

    @FindBy (id = "search-submit-button")
    public WebElement searchButton;

    @FindBy (id = "broker-warning-confirm")
    public WebElement continueToBrokerWebsiteButton;

    public RealEstateCenterPage() {

        PageFactory.initElements(driver, this);

    }

    public void inputLocation(String searchTerm){

        sendKeysToElement(locationSearchBar, searchTerm);

    }

    public void clickSearchButton(){

        clickOnElement(searchButton);

    }

    public void clickContinueToBrokerWebsiteButton(){

        clickOnElement(continueToBrokerWebsiteButton);

    }

    public BrokerPage searchForHome(String searchTerm){

        inputLocation(searchTerm);
        clickSearchButton();
        clickContinueToBrokerWebsiteButton();

        return new BrokerPage();

    }

}
