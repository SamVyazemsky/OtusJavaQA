package Lesson8;


import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.annotations.Test;		
    		
public class OtusScrollByJS {				

    @Test		
    public void testScroll() 					
    {		
        WebDriver driver = new FirefoxDriver();			
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://moneyboats.com/");			
     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");	
        js.executeScript("document.location.reload(true);")
        //quit driver		
        driver.quit();
    }		
    //скролл с загрузкой
    public void scroll_page_to_the_bottom() {
        ((JavascriptExecutor)getDriver()).executeScript(«function f() {» +
        » window.scrollTo(0, document.body.scrollHeight);» +
        » setTimeout(function(){» +
        » if ($(window).scrollTop() != $(document).height()-$(window).height()){» +
        » f();» +
        » }» +
        » }» +
        » , 500);» +
        » }» +
        «f()»);
        waitABit(5000);
        }
}