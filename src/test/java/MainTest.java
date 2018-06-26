import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MainSearchPage;

import java.io.File;

public class MainTest {
    WebDriver driver;
    MainSearchPage mainSearchPage;



    @BeforeMethod
    public void beforeTest(){
        driver = new ChromeDriver();
        mainSearchPage = new MainSearchPage(driver);

    }

    @AfterMethod
    public void afterTest(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            try{
                String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()+ "\\test-output";
                String screenshootPath = reportDirectory + "\\errorScreenshots\\" + result.getName() + ".jpg";
//                File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(srcFile, new File(screenshootPath));
                byte[] srcByte = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                Allure.getLifecycle().addAttachment(screenshootPath, "image/jpg", ".jpg", srcByte);
                Reporter.log("<a href='" + screenshootPath + "'> <img src= '"+ screenshootPath + "'height='100' width = '100'/></a>");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        driver.close();
    }







}
