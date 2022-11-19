package application.shared.ui;

import application.page_library.FavoritesPage;
import application.page_library.HelpCenterPage;
import application.page_library.ManageRentalsPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy (id = "headerMenuLink")
    public WebElement menuButton;

    @FindBy (id = "menuNavHelpCenter")
    public WebElement helpCenterButton;

    @FindBy (id = "menuNavLnkManageRental")
    public WebElement manageRentalsButton;

    @FindBy (xpath = "//ul[@id='menuNavigation']/li[1]/a")
    public WebElement renterToolsButton;

    @FindBy (xpath = "//a[contains(text(),'Favorites')]")
    public WebElement favoritesButton;

    public SystemBar() {

        PageFactory.initElements(driver, this);

    }

    public HelpCenterPage navigateToHelpPage(){

        clickMenuButton();
        clickHelpCenterButton();
        switchToTab();

        return new HelpCenterPage();

    }

    public ManageRentalsPage navigateToManagePage(){

        clickMenuButton();
        clickManageRentalsButton();

        return new ManageRentalsPage();

    }

    public FavoritesPage navigateToFavoritesPage(){

        clickMenuButton();
        clickRenterToolsButton();
        clickFavoritesButton();

        return new FavoritesPage();

    }

    public void clickMenuButton(){

        clickOnElement(menuButton);

    }

    public void clickHelpCenterButton(){

        clickOnElement(helpCenterButton);

    }

    public void clickManageRentalsButton(){

        clickOnElement(manageRentalsButton);

    }

    public void clickRenterToolsButton(){

        clickOnElement(renterToolsButton);

    }

    public void clickFavoritesButton(){

        clickOnElement(favoritesButton);

    }

}
