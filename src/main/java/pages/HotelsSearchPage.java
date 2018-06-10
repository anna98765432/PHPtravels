package pages;

import assertions.SearchTestAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsSearchPage extends MainPage {

    public SearchTestAssertion hotelSearchAssertion;
    String lvMonthYear;

    @FindBy(xpath = "//div[@id='s2id_autogen8']//span[@class='select2-chosen']")
    private WebElement cityInput;
    @FindBy(css = "#HOTELS button[type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@id='select2-drop']//div[@class='select2-search']/input[@type='text']")
    private WebElement cityInputEnabled;
    @FindBy(xpath = "//input[@class ='form-control input-lg dpd1']")
    private WebElement checkInInputEnabled;
    @FindBy(xpath = "//input[@class ='form-control input-lg dpd2']")
    private WebElement checkOutInputEnabled;
    @FindBy(xpath = "//div[@class='datepicker dropdown-menu' and contains(@style,'display: block')]")
    private WebElement visibleCalendar;
    @FindBy(xpath = "//div[@class='datepicker dropdown-menu' and contains(@style,'display: block')]//table[@class=' " +
            "table-condensed']//th[@class='next']")
    private WebElement nextMonthSelectArrow;
    @FindBy(xpath = "//div[@class='datepicker dropdown-menu' and contains(@style,'display: block')]//table[@class=' " +
            "table-condensed']//th[@class='prev']")
    private WebElement previousMonthSelectArrow;
    @FindBy(xpath = "//div[@class='datepicker dropdown-menu' and contains(@style,'display: block')]//table[@class=' table-condensed']" +
            "//th[@class='switch']")
    private WebElement monthAndYearReference;
    @FindBy(xpath = "//input[@name='travellers']")
    private WebElement travellersInput;


    public HotelsSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        hotelSearchAssertion = new SearchTestAssertion(driver);
    }



    public HotelsSearchPage sendCity(String city) {
        cityInput.click();
        waitForJStoLoad();
        cityInputEnabled.sendKeys(city);
        waitForJStoLoad();
        cityInputEnabled.sendKeys(Keys.ENTER);
        return this;
    }

    public HotelsSearchPage clickCheckInDate(){
        checkInInputEnabled.click();
        return this;
    }

    public HotelsSearchPage clickCheckOutDate(){
        checkOutInputEnabled.click();
        return this;
    }

    public HotelsSearchPage sendCheckInDate(String date){
        checkInInputEnabled.click();
        checkInInputEnabled.sendKeys(date);
        return  this;
    }

    public HotelsSearchPage sendCheckOutDate(String date){
        checkOutInputEnabled.click();
        checkOutInputEnabled.sendKeys(date);
        return this;
    }

    public HotelsSearchPage sendTravellers(String adults, String kids){
        travellersInput.clear();
        travellersInput.sendKeys(adults+" Adults "+kids+" Child");
        return this;
    }

    public HotelsSearchPage chooseDay(String day) {
        visibleCalendar.findElement(By.xpath("//td[text()=" + day + "]")).click();
        return this;
    }

    public String  getMonthAndYear() {
        lvMonthYear = monthAndYearReference.getText();
        return lvMonthYear;
    }

    public HotelsSearchPage chooseMonthAndYear(String monthYear) {

        do {
            nextMonthSelectArrow.click();
            getMonthAndYear();
        }
        while (!lvMonthYear.equals(monthYear));
        return this;

    }

    public HotelSearchResultPage clickSearch(){
        searchButton.click();
        return new HotelSearchResultPage(driver);

    }





//    public HotelsSearchPage selectMonth(String month){
//        for(int i=0, ,i++){
//
//
//        }
//    }


}
