package application.shared.ui;

import application.page_library.*;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//button[@data-analytics-trigger='search']")
    public WebElement searchButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBar;

    @FindBy (xpath = "//button[text()='Vehicles']")
    public WebElement vehiclesHeader;

    @FindBy (xpath = "//li[@class='global-header__menu-l3-panel-item global-header__menu-l3-panel-item--active']//a[@class='global-header__item-link']")
    public List<WebElement> vehicleOptions;

    @FindBy (xpath = "//button[text()='Shopping']")
    public WebElement shoppingHeader;

    @FindBy (xpath = "//ul//li[1]/a[@class='global-header__menu-l2-list-link ']")
    public WebElement specialOffersLink;

    @FindBy (xpath = "//a[@href='/en/owners/service-maintenance']")
    public WebElement serviceLink;

    @FindBy (xpath = "//a[contains(text(),'Vehicle Accessories')]")
    public WebElement accessoriesLink;

    public SystemBar() {

        PageFactory.initElements(driver,this);

    }

    public SearchResultsPage doSearch(String searchTerm){

        clickOnSearchButton();
        inputSearch(searchTerm);
        pressEnter();

        return new SearchResultsPage();

    }

    public void clickOnSearchButton(){

        clickOnElement(searchButton);

    }

    public void inputSearch(String searchTerm){

        sendKeysToElement(searchBar,searchTerm);

    }

    public VehiclesPage navigateToVehiclesPage(int index){

        clickVehiclesHeader();
        clickOnVehicleOptions(index);

        return new VehiclesPage();

    }

    public void clickVehiclesHeader(){

        clickOnElement(vehiclesHeader);

    }

    public void clickOnVehicleOptions(int index){

        clickOnElementFromList(vehicleOptions, index);

    }

    public SpecialOffersPage navigateToSpecialOffersPage(){

        clickShoppingHeader();
        clickSpecialOfferLink();
        return new SpecialOffersPage();

    }

    public ServicePage navigateToServicePage(){

        clickShoppingHeader();
        clickServiceLink();
        return new ServicePage();

    }

    public AccessoriesPage navigateToAccessoriesPage(){

        clickShoppingHeader();
        clickAccessoriesLink();
        return new AccessoriesPage();

    }

    public void clickShoppingHeader(){

        clickOnElement(shoppingHeader);

    }

    public void clickSpecialOfferLink(){

        safeClickOnElement(specialOffersLink);

    }

    public void clickServiceLink(){

        jsClickOnElement(serviceLink);

    }

    public void clickAccessoriesLink(){

        jsClickOnElement(accessoriesLink);

    }

}
