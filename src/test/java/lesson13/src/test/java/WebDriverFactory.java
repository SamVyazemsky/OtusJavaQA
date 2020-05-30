//port driver_names.DriverName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static driver_names.DriverName.*;


public class WebDriverFactory {
    public WebDriverFactory() {
        System.setProperty("webdriver.chrome.driver", "/home/ksenia/tools/chromedriver");
    }

    public static WebDriver createNewDriver(String driverType, MutableCapabilities mc) throws Exception {
        if (driverType.toLowerCase().equals(CHROME.name().toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver((ChromeOptions) mc);
        } else if (driverType.toLowerCase().equals(FIREFOX.name().toLowerCase())) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver((FirefoxOptions) mc);
        } else if (driverType.toLowerCase().equals(EDGE.name().toLowerCase())) {
            WebDriverManager.firefoxdriver().setup();
            return new EdgeDriver((EdgeOptions) mc);
        }
        throw new Exception("no such driver");
    }

    public static WebDriver createNewDriver(String driverType) throws Exception {
        if (driverType.toLowerCase().equals(CHROME.name().toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (driverType.toLowerCase().equals(FIREFOX.name())) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }  else if (driverType.toLowerCase().equals(EDGE.name())) {
            WebDriverManager.firefoxdriver().setup();
            return new EdgeDriver();
        }
        throw new Exception("no such driver");
    }


}
