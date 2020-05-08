//package lesson7;
//
//import net.lightbody.bmp.BrowserMobProxyServer;
//import net.lightbody.bmp.client.ClientUtil;
//import net.lightbody.bmp.core.har.Har;
//import net.lightbody.bmp.BrowserMobProxy;
//import net.lightbody.bmp.proxy.CaptureType;
//import net.lightbody.bmp.proxy.auth.AuthType;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.Proxy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//
//import java.io.FileWriter;
//
//public class ProxyExample {
//
//    @Test
//    public void bmpTest() throws Exception {
//
//        BrowserMobProxy proxy = new BrowserMobProxyServer();
//        proxy.start(4444);
//
//        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
//
//
//        // configure it as a desired capability
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
//
//        WebDriver driver = new ChromeDriver(capabilities);
//
//
//        // enable more detailed HAR capture, if desired (see CaptureType for the complete list)
//        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
//
//
//        // создание HAR с меткой
//        proxy.newHar("example");
//
//        // открытие страницы
//        driver.get("https://otus.ru/ ");
//        //
//
//
//        // получение данных HAR
//        Har har = proxy.getHar();
//
//        // здесь будет обработка полученных данных
//        // например, сохранение файл
//        proxy.getHar().writeTo(new FileWriter("Test.har", true));
//
//        driver.quit();
//        proxy.stop();
//    }
//
//    @Test
//    public void bmpTest() throws Exception {
//        // запуск прокси сервера
//        BrowserMobProxy server = new BrowserMobProxyServer();
//        server.start(4444);
//        server.autoAuthorization("example.com", "username", "password", AuthType.BASIC);
//        server.start();
//}