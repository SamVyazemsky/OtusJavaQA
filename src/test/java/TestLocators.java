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

        WebElement form2 = driver.findElement(By.tagName("select"));
        form2.click();

        WebElement choose = driver.findElement(By.cssSelector(""));

        WebElement form1 = driver.findElement(By.id("login-form"));
        WebElement form3 = driver.findElement(By.className("login"));
        WebElement form4 = driver.findElement(By.cssSelector("form.login"));
        WebElement form5 = driver.findElement(By.cssSelector("#login-form"));

        WebElement field1 = driver.findElement(By.name("username"));
        WebElement field2 = driver.findElement(By.xpath("//input[@name='username']"));


        List<WebElement> links = driver.findElements(By.tagName("select"));

        
    }
}