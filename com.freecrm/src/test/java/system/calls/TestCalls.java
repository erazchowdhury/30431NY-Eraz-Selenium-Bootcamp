package system.calls;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalls extends BasePage {

    @Test(groups = {"smoke", "calls"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingCall")
    public void testCreatingCall(String email, String password, String day, String timeIndex, String optionIndex, String expected) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage = introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        CallsPage callsPage = homePage.systemBar.clickCallsButton();

        CreateCallPage createCallPage = callsPage.clickNewCallButton();

        ItemDetailsPage itemDetailsPage = createCallPage.createCall(Integer.parseInt(day), Integer.parseInt(timeIndex), Integer.parseInt(optionIndex));

        if (isElementInvisible(createCallPage.createCallForm)){

            Assert.assertEquals(itemDetailsPage.getCallName(), expected);

        }

    }

}
