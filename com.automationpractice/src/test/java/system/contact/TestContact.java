package system.contact;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

public class TestContact extends BasePage {

    @Test(groups = {"contact", "smoke"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSendingMessageOnContactPage")
    public void testSendingMessageOnContactPage(String heading, String emailAddress, String filePath, String message, String expected) {
        HomePage homePage = new HomePage();

        ContactPage contactPage = homePage.systemBar.clickContactUsButton();

        contactPage.sendMessageOnContactPage(heading, emailAddress, filePath, message);

        Assert.assertEquals(contactPage.getConfirmationMessage(), expected);

    }

    @Test(groups = {"contact", "smoke"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWritingReview")
    public void testWritingReview(String emailAddress, String password, String searchTerm, String productIndex,
                                  String rating, String title, String comment) {

        HomePage homePage = new HomePage();

        AuthenticationPage authenticationPage = homePage.systemBar.clickSignInButton();

        AccountPage accountPage = authenticationPage.signIntoAccount(emailAddress, password);

        ProductsPage productsPage = accountPage.systemBar.doSearch(searchTerm);

        ItemPage itemPage = productsPage.selectProduct(Integer.parseInt(productIndex));

        itemPage.writeReview(Integer.parseInt(rating), title, comment);

        Assert.assertTrue(isElementVisible(itemPage.confirmationWindow));
    }

    @Test(groups = {"contact", "smoke"})
    public void testNewsletterSignUp() {

        HomePage homePage = new HomePage();

        GenerateData faker = new GenerateData();
        String email = faker.email();

        homePage.systemBar.subscribeToNewsLetter(email);

        Assert.assertTrue(isElementVisible(homePage.newsletterConfirmation));

    }

}
