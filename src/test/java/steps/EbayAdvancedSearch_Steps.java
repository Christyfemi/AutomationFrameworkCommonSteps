package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EbayAdvancedSearch_Steps {
    WebDriver driver;



    @Given("I am on Ebay Advanced Search page")
    public void i_am_on_Ebay_Advanced_Search_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.ebay.co.uk/sch/ebayadvsearch");
        Thread.sleep(3000);

        try{
            driver.findElement(By.id("gdpr-banner-accept")).click();
        } catch(Exception e){}

//        String parentwindow = driver.getWindowHandle();
//        Set<String> windows = driver.getWindowHandles();
//        for (String window:windows) {
//            if (!window.equals(parentwindow)) {
//                driver.switchTo().window(parentwindow);
//
//                //driver.switchTo().window(window);
//                // driver.close();
//                Thread.sleep(3000);
//            }
      //  }

        driver.findElement(By.cssSelector("//a[@id='gh-la']")).click();
       // driver.switchTo().window(parentwindow);
        driver.close();

    }




    @When("I click on Ebay Logo")
    public void i_click_on_Ebay_Logo() {
//        driver.findElement(By.cssSelector("#gdpr-banner-accept")).click();
       driver.findElement(By.cssSelector("//a[@id='gh-la']")).click();
//        driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys("Olufemi");
//        driver.findElement(By.cssSelector("div[class='adv-s mb space-top'] button[type='submit']")).click();
    }

    @Then("I am navigate to ebay Home page")
    public void i_am_navigate_to_ebay_Home_page() {
      String expUrl ="https://www.ebay.co.uk/sch/ebayadvsearch";
      String actUrl = driver.getCurrentUrl();
      if (!expUrl.equals(actUrl)){
          System.out.println("i got it");
      }
        driver.quit();

      }

    }





