package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderHistoryPage extends SharedStepsUI {

    @FindBy(xpath = "//table[@id='order-list']//td[@class='history_invoice']//a")
    public List<WebElement> orderInvoiceButtons;

    public OrderHistoryPage() {

        PageFactory.initElements(driver, this);

    }

    public void clickOrderInvoiceButton(int productIndex) throws InterruptedException {
        try {
            clickOnElement(orderInvoiceButtons.get(productIndex));
        } catch (IndexOutOfBoundsException e) {
            clickOnElement(orderInvoiceButtons.get(orderInvoiceButtons.size() - 1));
        }

        Thread.sleep(10000);
    }

    public void clickEarliestOrderInvoiceButton() throws InterruptedException {
            clickOnElement(orderInvoiceButtons.get(orderInvoiceButtons.size() - 1));

        Thread.sleep(10000);
    }

}
