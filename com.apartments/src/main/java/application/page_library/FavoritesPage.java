package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritesPage extends SharedStepsUI {

    @FindBy (id = "iframeFavorites")
    public WebElement favoritesIframe;

    @FindBy (xpath = "//button[contains(text(),'Find My New Favorite Place')]")
    public WebElement favoritesButton;

    public FavoritesPage() {

        PageFactory.initElements(driver,this);

    }

    public void switchToFavoritesIframe(){

        switchToFrameByElement(favoritesIframe);

    }

}
