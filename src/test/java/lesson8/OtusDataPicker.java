package Lesson8;

import org.apache.cassandra.io.util.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.OtusActions;


public class OtusActions {

    @Test
    public void testOtusTakeScreenshot() throws Exception{

        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("http://jqueryui.com/datepicker/");
        driver.SwitchTo().Frame(
            driver.FindElement(By.CssSelector("iframe.demo-frame")));
        SetDatepicker(driver, "#datepicker", "02/20/2022");
        driver.quit();

    public void setDatepicker(WebDriver driver, String cssSelector, String date) {
      new WebDriverWait(driver, 30000).until(
        (WebDriver d) -> d.findElement(By.cssSelector(cssSelector)).isDisplayed());
      JavascriptExecutor.class.cast(driver).executeScript(
        String.format("$('%s').datepicker('setDate', '%s')", cssSelector, date));
      WebElement el = JavascriptExecutor(driver, '$("#myid")');
      
}

}
