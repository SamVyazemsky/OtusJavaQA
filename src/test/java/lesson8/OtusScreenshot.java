package Lesson8;

import org.apache.cassandra.io.util.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class OtusScreenshot {
	@Test
    public void testOtusTakeScreenshot() throws Exception{

        WebDriver driver;
        driver = new FirefoxDriver();
        //goto url
        driver.get("https://otus.ru/");
        //Call take screenshot function
        takeSnapShot(driver, "screenshot" + System.currentTimeMillis() +".png");
        driver.quit();
    }
    /**
     * This function will take screenshot
     * @param webdriver
     * @param fileWithPath
     * @throws Exception
     */

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile = new File("/home/svyazemsky/JavaProjects/newqajava/src/test/java/Lesson8/screenshots/" + fileWithPath);
        System.out.println(DestFile);
        //Copy file at destination
        com.google.common.io.Files.copy(SrcFile, DestFile);
    }
}
