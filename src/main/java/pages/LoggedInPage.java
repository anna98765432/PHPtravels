package pages;

import assertions.RegistrationAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage extends MainPage{

    public RegistrationAssertion registrationAssertion;




    public LoggedInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        registrationAssertion = new RegistrationAssertion(driver);

    }


}
