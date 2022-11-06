package system.purchasing;

import application.page_library.*;
import base.BasePage;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPurchasing extends BasePage {

    @Test (groups = {"smoke", "purchasing"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testPurchasingFeaturedItem")
    public void testPurchasingFeaturedItem(String index, String emailAddress, String password, String expected) {

        HomePage homePage = new HomePage();

        ItemPage itemPage = homePage.clickFeaturedProduct(Integer.parseInt(index));

        ShoppingCartPage shoppingCartPage = itemPage.addItemToCartAndProceedToCheckout();

        AuthenticationPage authenticationPage = shoppingCartPage.clickProceedToCheckoutButton();

        AddressesPage addressesPage = authenticationPage.signInAndProceed(emailAddress, password);

        ShippingPage shippingPage = addressesPage.clickProceedToCheckOutButton();

        PaymentPage paymentPage = shippingPage.agreeToTermsAndProceedToPayment();
        paymentPage.clickPayByBankWireButton();
        paymentPage.clickConfirmOrderButton();

        Assert.assertEquals(paymentPage.getTextFromMessage(), expected);

    }

    @Test (groups = {"smoke", "purchasing"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSearchAndPurchase")
    public void testSearchAndPurchase(String searchTerm, String productIndex, String size, String colorIndex, String emailAddress, String password, String expected) {

        HomePage homePage = new HomePage();

        ProductsPage productsPage = homePage.systemBar.doSearch(searchTerm);

        ItemPage itemPage = productsPage.selectProduct(Integer.parseInt(productIndex));

        itemPage.selectQuantitySizeAndColor(size, Integer.parseInt(colorIndex));

        ShoppingCartPage shoppingCartPage = itemPage.addItemToCartAndProceedToCheckout();

        AuthenticationPage authenticationPage = shoppingCartPage.clickProceedToCheckoutButton();

        AddressesPage addressesPage = authenticationPage.signInAndProceed(emailAddress, password);

        ShippingPage shippingPage = addressesPage.clickProceedToCheckOutButton();

        PaymentPage paymentPage = shippingPage.agreeToTermsAndProceedToPayment();
        paymentPage.clickPayByBankWireButton();
        paymentPage.clickConfirmOrderButton();

        Assert.assertEquals(paymentPage.getTextFromMessage(), expected);

    }

}
