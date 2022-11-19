package application.page_library;

import application.shared.SharedStepsUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedStepsUI {

    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[2]/ul[1]/li")
    public List<WebElement> carouselSelectButtons;

    @FindBy (xpath = "//a[@class='cta  full-width  align--left icon-none adaptive-height']")
    public List<WebElement> learnMoreButtons;

    @FindBy (xpath = "//a[@aria-label='Sign Up Now']")
    public WebElement signUpLink;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public MyBMWAppPage navigateToMyBMWAppPage(int buttonNum, int index){

        clickCarouselSelectButton(buttonNum);
        clickOnLearnMoreButton(index);

        return new MyBMWAppPage();

    }

    public ServicePage navigateToServicePage(int buttonNum, int index){

        clickCarouselSelectButton(buttonNum);
        clickOnLearnMoreButton(index);

        return new ServicePage();

    }

    public void clickCarouselSelectButton(int buttonNum){

        clickOnElementFromList(carouselSelectButtons, buttonNum);

    }

    public void clickOnLearnMoreButton(int index){

        clickOnElementFromList(learnMoreButtons, index);

    }


    public UpdateSignUpPage clickSignUpLink(){

        jsScroll(2800);
        clickOnElement(signUpLink);

        return new UpdateSignUpPage();

    }

}
