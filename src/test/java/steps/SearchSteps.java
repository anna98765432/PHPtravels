package steps;

import assertions.SearchTestAssertion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends MainSteps{

    public SearchSteps(){
        super();
    }

    @Then("^System display Hotel in London$")
    public void systemDisplayHotelInLondon() {
        new SearchTestAssertion(driver).hasGrandPlazaBeenFound();
    }

    @Given("^System display start page$")
    public void systemDisplayStartPage() {

        mainSearchPage.openTravelPHP();
    }

    @When("^User search for hotel in \"([^\"]*)\" with checkin date as \"([^\"]*)\" and checkout date as \"([^\"]*)\"$")
    public void userSearchForHotelInWithCheckinDateAsAndCheckoutDateAs(String city, String checkInDate, String checkOutDate) {

       mainSearchPage.clickHotelsBanner()
               .sendCity(city)
               .clickCheckInDate()
               .sendCheckInDate(checkInDate)
               .sendCheckOutDate(checkOutDate)
               .clickSearch();
    }
}
