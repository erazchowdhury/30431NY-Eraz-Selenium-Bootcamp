package system.shopping_cart;

import application.page_library.AuthenticationPage;
import application.page_library.HomePage;
import application.page_library.ItemPage;
import application.page_library.ShoppingCartPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart extends BasePage {

    @Test(groups = {"smoke", "shopping cart"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testRemoveItems")
    public void testRemoveItems(String index, String productIndex) {

        HomePage homePage = new HomePage();

        ItemPage itemPage = homePage.clickFeaturedProduct(Integer.parseInt(index));

        ShoppingCartPage shoppingCartPage = itemPage.addItemToCartAndProceedToCheckout();

        shoppingCartPage.clickRemoveFromCartButton(Integer.parseInt(productIndex));

        Assert.assertTrue(isElementVisible(shoppingCartPage.cartEmptyMessage));

    }

}
