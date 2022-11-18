package application.system;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPage extends SharedStepsUI {

    @FindBy (xpath = "//h1[@class='text-2xl font-semibold instrument-header_title__gCaMF mobile:mb-2']")
    public WebElement itemName;

    @FindBy (xpath = "//h1[@class='ecTitle float_lang_base_1 relativeAttr']")
    public WebElement itemHeader;

    @FindBy (xpath = "//h1[@class='articleHeader']")
    public WebElement articleHeader;

    public ItemDetailsPage() {

        PageFactory.initElements(driver,this);

    }

    public String getItemName(){

        return getTrimmedElementText(itemName);

    }

}
