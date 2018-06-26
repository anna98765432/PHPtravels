package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class RegistrationAssertion extends MainPage {



    @FindBy(xpath = "//a[@href='#profile']") private WebElement profileButton;


    public RegistrationAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void hasUserRegistered(){
        profileButton.isDisplayed();

    }



}
