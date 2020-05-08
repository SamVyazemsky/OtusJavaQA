import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("ALL")
public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void start() {

        driver = new FirefoxDriver();
    }

    @AfterEach
    public void stop() {
        driver.quit();
        //driver = null;
    }
}

//List<WebElement> links = (List<WebElement>) ((JavascriptExecutor) driver)
//  .executeScript("return $$('a:contains((WebDriver)')");