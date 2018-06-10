import org.testng.annotations.Test;

public class SearchTest extends MainTest{


    public String monthAndYearToCheck = "January 2019";
    public String dayToCheck = "15";


    @Test
    public void shouldGoToSearchRusults(){
        mainSearchPage.openTravelPHP()
                .clickHotelsBanner()
                .sendCity("Kalamazoo")
                .clickCheckInDate()
                .sendCheckInDate("20/08/2018")
                .sendCheckOutDate("22/08/2018")
                .sendTravellers("4","2")
                .clickSearch()
                .hotelSearchAssertion
                .wasAbleToMaketoSearchResultsPage();

    }

    @Test
    public void sholudHaveSpecificDateChosen(){
        mainSearchPage.openTravelPHP()
                .clickHotelsBanner()
                .clickCheckInDate()
                .chooseMonthAndYear(monthAndYearToCheck)
                .clickCheckInDate()
                .chooseDay(dayToCheck)
                .hotelSearchAssertion.hasCorrectDate("15/01/2019");

    }



}
