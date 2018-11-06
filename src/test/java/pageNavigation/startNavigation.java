package pageNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class startNavigation {
    @Test
    public void navigate() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions cOption = new ChromeOptions();
        cOption.addArguments("start-maximized");
        WebDriver wDriver = new ChromeDriver(cOption);
        wDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wDriver.navigate().to("https://www.priceline.com");
        Thread.sleep(5000);
        wDriver.quit();
    }
}
