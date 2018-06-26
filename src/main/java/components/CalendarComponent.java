package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

public class CalendarComponent extends MainPage {


    @FindBy(css = "[style*='block'] .datepicker-days .next")
    private WebElement nextMonthSelectArrow;
    @FindBy(xpath = "//*[contains(@class, 'datepicker ') and contains(@style, 'block')]")
    private WebElement visibleCalendar;
    @FindBy(css = "[style*='block'] .datepicker-days .switch")
    private WebElement monthAndYearFromCalendar;


    public CalendarComponent (WebDriver driver) {
        super(driver);
    }

    public void pickADay(int day) {
        waitForJStoLoad();
        //List<WebElement> lista =
        visibleCalendar.findElement(By.xpath("//*[contains(@class, 'datepicker ') and contains(@style, 'block')]//td[text()='" + day + "']")).click();
    }

    public void clickNextMonth() {
        nextMonthSelectArrow.click();
    }

    public void setDate(String dayMonthYear) {


    }

    public enum Month {
        January,
        Febuary,
        March,
    }


    public void pickDateFromCalendar(int day, Month month, int year) {

        String monthYear = month.toString() + " " + String.valueOf(year);
        while(visibleCalendar.findElements(By.xpath("//th[text()='" + monthYear + "']")).size()==0){
            clickNextMonth();
        }
        pickADay(day);


    }//wywolujemy Month.August

    private String getMonthAndYear() {
        return monthAndYearFromCalendar.getText();
    }

    public void chooseMonthAndYear(String monthYear) {
        getMonthAndYear();
        while (!getMonthAndYear().equals(monthYear)) {
            nextMonthSelectArrow.click();
            getMonthAndYear();
        }

    }





}


