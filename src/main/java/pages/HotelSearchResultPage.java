package pages;

import assertions.SearchTestAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchResultPage extends MainPage {

    public SearchTestAssertion hotelSearchAssertion;

    public HotelSearchResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        hotelSearchAssertion = new SearchTestAssertion(driver);

    }





}
