package application.shared.ui;

import application.page_library.BusinessLandingPage;
import application.page_library.HomePage;
import application.page_library.ItemPage;
import application.page_library.FiveGPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy (id = "gnav20-search-icon")
    public WebElement searchButton;

    @FindBy (id = "search_box_gnav_input")
    public WebElement searchField;

    @FindBy (xpath = "//li[@role='listitem']/a")
    public List<WebElement> searchResults;

    @FindBy (id = "gnav20-Why-Verizon-L1")
    public WebElement whyVerizonHeader;

    @FindBy (id = "gnav20-Why-Verizon-L2-1")
    public WebElement networkSubHeader;

    @FindBy (id = "gnav20-Why-Verizon-L3-1")
    public WebElement fiveGSubHeader;

    @FindBy (id = "gnav20-eyebrow-link-Business")
    public WebElement businessPageLink;

    @FindBy (xpath = "//div[@class='gnav20-desktop']//a[@title='Verizon Home Page']")
    public WebElement homePageLink;

    @FindBy (xpath = "//a[@class='gnav20-lang-link']")
    public WebElement languageButton;

    public SystemBar() {

        PageFactory.initElements(driver,this);

    }

    public ItemPage searchForItem(String searchTerm, int index){

        clickSearchButton();
        inputSearchTerm(searchTerm);
        selectSearchResult(index);

        return new ItemPage();

    }

    public void clickSearchButton(){

        clickOnElement(searchButton);

    }

    public void inputSearchTerm(String searchTerm){

        sendKeysToElement(searchField, searchTerm);

    }

    public void selectSearchResult(int index){

        synchronized (webDriverWait){
            try {
                webDriverWait.wait(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        clickOnElementFromList(searchResults, index);

    }

    public FiveGPage navigateTo5GPage(){

        clickWhyVerizonHeader();
        clickNetworkSubHeader();
        click5GSubHeader();

        return new FiveGPage();

    }

    public void clickWhyVerizonHeader(){

        clickOnElement(whyVerizonHeader);

    }

    public void clickNetworkSubHeader(){

        clickOnElement(networkSubHeader);

    }

    public void click5GSubHeader(){

        clickOnElement(fiveGSubHeader);

    }

    public BusinessLandingPage clickBusinessPageLink(){

        clickOnElement(businessPageLink);

        return new BusinessLandingPage();

    }

    public HomePage clickLogo(){

        clickOnElement(homePageLink);

        return new HomePage();

    }

    public HomePage clickSpanishButton(){

        clickOnElement(languageButton);

        return new HomePage();

    }

    public String getLanguage(){

        return getElementAttributeValue("data-lang", languageButton);

    }

}
