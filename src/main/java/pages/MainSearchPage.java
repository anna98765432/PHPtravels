package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainSearchPage extends MainPage{

    private String url = "https://www.phptravels.net/";
    @FindBy(xpath= "//li[@data-title='HOTELS']//span[@class='hidden-xs']") private WebElement hotelsBanner;


    public MainSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainSearchPage openTravelPHP(){
        driver.get(url);
        return this;
    }

    public HotelsSearchPage clickHotelsBanner(){
        hotelsBanner.click();
        return new HotelsSearchPage(driver);
    }




}
