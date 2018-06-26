package steps;

import assertions.RegistrationAssertion;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps extends MainSteps{

    public RegisterSteps(){
        super();
    }

    @When("^User is filling up registration form with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void userIsFillingUpRegistrationFormWith(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {

        throw new PendingException();
    }

    @Given("^System display registration page$")
    public void systemDisplayRegistrationPage(){
        mainSearchPage.openTravelPHP()
                .clickMyAccount()
                .clickSignIn();

    }

    @Then("^System display loogged in page$")
    public void systemDisplayLooggedInPage() {
        new RegistrationAssertion(driver).hasUserRegistered();
    }
}
