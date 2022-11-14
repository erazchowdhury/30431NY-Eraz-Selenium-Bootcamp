package system.contacts;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContacts extends BasePage {

    @Test (groups = {"smoke", "contacts"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingContact")
    public void testCreatingContact(String email, String password, String firstName, String lastName, String categoryIndex) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        ContactsPage contactsPage = homePage.systemBar.clickContactsButton();

        CreateContactPage createContactPage = contactsPage.clickCreateButton();

        ItemDetailsPage itemDetailsPage = createContactPage.createContact(firstName, lastName, Integer.parseInt(categoryIndex));

        if(isElementInvisible(createContactPage.createContactForm)){
            Assert.assertEquals(itemDetailsPage.getName(), firstName + " " + lastName);
        }

    }

    @Test (groups = {"smoke", "contacts"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDeletingContact")
    public void testDeletingContact(String email, String password, String firstName, String lastName, String deletedContactName) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage = introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        ContactsPage contactsPage = homePage.systemBar.clickContactsButton();

        CreateContactPage createContactPage = contactsPage.clickCreateButton();

        ItemDetailsPage itemDetailsPage = createContactPage.createSimpleContact(firstName, lastName);
        itemDetailsPage.deleteContact();

        if (isElementVisible(contactsPage.contactTable)){
            Assert.assertNotEquals(contactsPage.getMostRecentlyCreatedContactName(), deletedContactName);
        }

    }

}
