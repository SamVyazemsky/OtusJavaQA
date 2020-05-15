import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class TestLocators extends TestBase {

    @Test
    public void myFirstTest() {
        driver.navigate().to("https://otus.ru/");

        WebElement link = driver.findElement(By.linkText("learning/"));
        link.click();

        WebElement ZhannaHW2 = driver.findElement(By.tagName("select"));
        form2.click();

        WebElement choose = driver.findElement(By.cssSelector(""));

        WebElement ZhannaHW1 = driver.findElement(By.id("login-form"));
        WebElement ZhannaHW3 = driver.findElement(By.className("login"));
        WebElement ZhannaHW4 = driver.findElement(By.cssSelector("form.login"));
        WebElement ZhannaHW5 = driver.findElement(By.cssSelector("#login-form"));

        WebElement ZhannaField1 = driver.findElement(By.name("username"));
        WebElement ZhannaField2 = driver.findElement(By.xpath("//input[@name='username']"));


        List<WebElement> links = driver.findElements(By.tagName("select"));

        
    }
}