package system.contact;

import application.page_library.ContactPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContact extends BasePage {

    @Test(groups = {"contact", "smoke"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSendingMessageOnContactPage")
    public void testSendingMessageOnContactPage(String heading, String emailAddress, String filePath, String message, String expected) {
        HomePage homePage = new HomePage();

        ContactPage contactPage = homePage.systemBar.clickContactUsButton();

        contactPage.sendMessageOnContactPage(heading, emailAddress, filePath, message);

        Assert.assertEquals(contactPage.getConfirmationMessage(), expected);

    }

}
