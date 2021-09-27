package steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Steps {
   private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","webdrivers/chromedriver.exe");
        driver = new ChromeDriver();

    }
    @After
    public void tearDown() throws InterruptedException {

        driver.quit();
        Thread.sleep(1000);
    }


    public WebDriver getDriver(){
        return driver;
    }
}

