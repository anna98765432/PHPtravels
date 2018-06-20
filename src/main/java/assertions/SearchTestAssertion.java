package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.MainPage;

public class SearchTestAssertion extends MainPage {

    public String dateToCheck = "15/01/2019";
    public String date1;
    @FindBy(xpath = "//form[@name='fFilters']") private WebElement filterMenu;
    @FindBy(xpath = "//input[@class ='form-control input-lg dpd1']") private WebElement checkInInputEnabled;
    @FindBy(xpath = "//h4/a[contains(@href,'grand-plaza-apartments')]") private WebElement grandPlazaLink;


    public SearchTestAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void wasAbleToMaketoSearchResultsPage(){
        Assert.assertTrue(filterMenu.isDisplayed());
    }

    public void hasCorrectDate(String date){
        String date1 = checkInInputEnabled.getAttribute("value");
        Assert.assertTrue(date1.equals(date));

    }

    public void hasGrandPlazaBeenFound(){
        Assert.assertTrue(grandPlazaLink.isDisplayed());
    }




}
