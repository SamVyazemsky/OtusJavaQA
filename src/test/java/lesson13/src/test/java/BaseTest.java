import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

public class FactoryTest {
    private final static Logger log = Logger.getLogger(FactoryTest.class.getName());

    @Test

    public void testWebFactory() throws Exception {
        log.info(System.getProperty("browser"));

        String browser = System.getProperty("browser");
        WebDriver wd = WebDriverFactory.createNewDriver(browser);
        wd.get("http://www.google.com");
        wd.quit();
    }

    @Test

    public void testWithOptions() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setHeadless(true);
        log.info(System.getProperty("browser"));

        String browser = System.getProperty("browser");

        WebDriver wd = WebDriverFactory.createNewDriver(browser, options);
        wd.get("http://www.google.com/");
        wd.quit();

    }

}
