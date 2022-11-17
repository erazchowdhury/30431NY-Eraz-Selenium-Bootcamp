package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (id = "forgot-oid-pwd")
    public WebElement forgotIDPasswordLink;

    @FindBy (id = "navHomeLoans")
    public WebElement homeLoansHeader;

    @FindBy (id = "findAHome")
    public WebElement findAHomeLink;

    @FindBy (id = "mortgage")
    public WebElement mortgageLink;

    @FindBy (id = "yniLifeServicesCta")
    public WebElement lifePlanLearnMoreButton;

    public HomePage() {

        PageFactory.initElements(driver, this);

    }

    public ForgotIDPasswordPage clickForgotIDPasswordLink() {

        clickOnElement(forgotIDPasswordLink);

        return new ForgotIDPasswordPage();

    }

    public void clickHomeLoansHeader() {

        clickOnElement(homeLoansHeader);

    }

    public void clickFindAHomeLink(){

        clickOnElement(findAHomeLink);

    }

    public RealEstateCenterPage navigateToRealEstatePage(){

            clickHomeLoansHeader();
            clickFindAHomeLink();

            return new RealEstateCenterPage();

    }

    public LifePlanPage clickOnLifePlanLearnMoreButton(){

            clickOnElement(lifePlanLearnMoreButton);

            return new LifePlanPage();

    }

    public void clickMortgageLink(){

            clickOnElement(mortgageLink);

    }

    public HomeMortgagePage navigateToHomeMortgagePage(){

        clickHomeLoansHeader();
        clickMortgageLink();

        return new HomeMortgagePage();

    }

}
