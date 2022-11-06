package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends SharedStepsUI {

    @FindBy (xpath = "//ul[@class='product_list grid row']/li//a[@class='product-name']")
    public List<WebElement> productNameLinks;

    public ProductsPage() {

        PageFactory.initElements(driver, this);

    }

    public ItemPage selectProduct(int productIndex) {
        try {
            clickOnElement(productNameLinks.get(productIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(productNameLinks.get(productNameLinks.size() - 1));
        }

        return new ItemPage();

    }

}
