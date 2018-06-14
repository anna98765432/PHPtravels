import components.CalendarComponent;
import org.testng.annotations.Test;
import scenarios.SearchHotelScenario;


public class SearchTest extends MainTest {


    private String monthAndYearToCheck = "January 2019";
    private String dayToCheck = "15";
    private String dateToCheck ="15/01/2019";


    @Test
    public void shouldGoToSearchRusults() {
        mainSearchPage.openTravelPHP().run(new SearchHotelScenario("Kalamazoo","20/08/2018",
                "22/08/2-18","4","2"))
                .clickSearch()
                .hotelSearchAssertion
                .wasAbleToMaketoSearchResultsPage();

    }

    @Test
    public void sholudHaveSpecificDateChosen() {
        mainSearchPage.openTravelPHP()
                .clickHotelsBanner()
                .clickCheckInDate()
                .pick2DateFromCalendar(20, CalendarComponent.Month.January,2019)
                .pick2DateFromCalendar(30, CalendarComponent.Month.March, 2019)
                .hotelSearchAssertion.hasCorrectDate(dateToCheck);

    }

    @Test
    public void sholudFindPlazaApartments(){
        mainSearchPage.openTravelPHP().run(new SearchHotelScenario("London","17/06/2018",
                "18/06/2018","2","0"))
                .clickSearch()
                .hotelSearchAssertion.hasGrandPlazaBeenFound();

    }


}
