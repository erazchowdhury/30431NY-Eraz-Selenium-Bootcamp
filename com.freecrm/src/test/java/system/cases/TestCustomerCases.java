package system.cases;

import application.page_library.*;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomerCases extends BasePage {

    @Test (groups = {"smoke", "contacts"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingCase")
    public void testCreatingCase(String email, String password, String title, String index) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage =  introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        CasesPage casesPage = homePage.systemBar.clicksCasesButton();

        CreateCasesPage createCasesPage = casesPage.clickCreateCaseButton();

        ItemDetailsPage itemDetailsPage = createCasesPage.createCase(title, Integer.parseInt(index));

        webDriverWait.until(ExpectedConditions.invisibilityOf(createCasesPage.createCaseForm));

        Assert.assertEquals(itemDetailsPage.getName(), title);

    }
}
