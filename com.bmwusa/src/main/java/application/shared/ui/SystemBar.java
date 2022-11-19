package application.shared.ui;

import application.page_library.ItemPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//button[@name='Models Flyout']")
    public WebElement modelHeaderButton;

    @FindBy (xpath = "//div[@data-filter='all models']//a[@class='header-vehicle-tile__link']")
    public List<WebElement> modelOptions;

    @FindBy (xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/button[1]")
    public WebElement searchButton;

    @FindBy (xpath = "//input[@name='site search']")
    public WebElement searchField;

    public SystemBar() {

        PageFactory.initElements(driver,this);

    }

    public ItemPage selectItem(int index){

        clickModelHeaderButton();
        selectModelOption(index);

        return new ItemPage();

    }

    public void clickModelHeaderButton(){

        synchronized (webDriverWait){
            try {
                webDriverWait.wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        clickOnElement(modelHeaderButton);

    }

    public void selectModelOption(int index){

        clickOnElementFromList(modelOptions, index);

    }

    public void clickSearchButton(){

        clickOnElement(searchButton);

    }

    public void inputSearchTerm(String searchTerm){

        sendKeysToElement(searchField, searchTerm);

    }

}
