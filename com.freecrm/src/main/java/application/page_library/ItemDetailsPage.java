package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPage extends SharedStepsUI {

//    @FindBy (xpath = "//div[@class='field'][1]//p")
//    public WebElement itemName;

    @FindBy (xpath = "//div[@class='ui header item mb5 light-black']")
    public WebElement itemName;

    public ItemDetailsPage() {

        PageFactory.initElements(driver,this);

    }

    public String getName(){

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getTrimmedElementText(itemName);

    }

}
