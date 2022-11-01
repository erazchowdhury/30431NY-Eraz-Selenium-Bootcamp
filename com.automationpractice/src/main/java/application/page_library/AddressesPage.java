package application.page_library;

import application.shared.SharedStepsUI;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@name='processAddress']")
    public WebElement proceedToCheckOutButton;

    public AddressesPage() {

        PageFactory.initElements(driver, this);

    }

    public ShippingPage clickProceedToCheckOutButton() {

        clickOnElement(proceedToCheckOutButton);

        return new ShippingPage();

    }

}
