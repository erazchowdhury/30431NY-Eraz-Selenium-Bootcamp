package system.companies;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestCompanies extends BasePage {

    @Test (groups = {"smoke", "companies"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingCompany")
    public void testCreatingCompany(String email, String password, String companyName, String userIndex, String streetAddress,
                                  String city, String state, String zipcode, String phoneNumber, String description,
                                  String priorityIndex, String imagePath) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        CompaniesPage companiesPage = homePage.systemBar.clickCompaniesButton();

        CreateCompanyPage createCompanyPage = companiesPage.clickCreateButton();

        ItemDetailsPage itemDetailsPage = createCompanyPage.createCompany(companyName, Integer.parseInt(userIndex),
                streetAddress, city, state, zipcode, phoneNumber, description, Integer.parseInt(priorityIndex), imagePath);

        if(isElementInvisible(createCompanyPage.createCompanyForm)){

            Assert.assertEquals(itemDetailsPage.getName(), companyName);

        }

    }

}
