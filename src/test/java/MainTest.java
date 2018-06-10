import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.MainSearchPage;

public class MainTest {
    WebDriver driver;
    MainSearchPage mainSearchPage;



    @BeforeMethod
    public void beforeTest(){
        driver = new ChromeDriver();
        mainSearchPage = new MainSearchPage(driver);

    }

//    @AfterMethod
//    public void afterTest(){
//        driver.close();
//    }







}
