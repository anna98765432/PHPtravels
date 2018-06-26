package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import pages.MainSearchPage;

@CucumberOptions (features = "src/test/resources/gherkin", glue="steps")
public class MainSteps extends AbstractTestNGCucumberTests {
    protected static WebDriver driver;
    protected static MainSearchPage mainSearchPage;
    private String url = "https://www.phptravels.net/";

    public MainSteps(){
        driver = new ChromeDriver();
        mainSearchPage = new MainSearchPage(driver);
    }


//    @BeforeTest
//    public void before(){
//        driver = new ChromeDriver();
//        mainSearchPage = new MainSearchPage(driver);
//    }

    @AfterTest
    public void after(){
        driver.close();
    }





}
