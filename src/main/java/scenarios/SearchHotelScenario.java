package scenarios;

import pages.HotelsSearchPage;
import pages.MainSearchPage;

public class SearchHotelScenario implements Scenario<MainSearchPage, HotelsSearchPage> {

    private String city;
    private String checkInDate;
    private String checkOutDate;
    private String adults;
    private String kids;


    public SearchHotelScenario(String city, String checkInDate, String checkOutDate, String adults, String kids) {
        this.city = city;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.adults = adults;
        this.kids = kids;
    }
    
    public HotelsSearchPage run(MainSearchPage entry) {
        return entry.clickHotelsBanner()
                .sendCity(city)
                .clickCheckInDate()
                .sendCheckInDate(checkInDate)
                .sendCheckOutDate(checkOutDate)
                .sendTravellers(adults, kids);
    }
}
