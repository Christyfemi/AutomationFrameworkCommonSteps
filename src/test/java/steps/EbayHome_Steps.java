package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;
public class EbayHome_Steps {
          WebDriver driver;



    @Given("I am on Ebay Home page")
    public void i_am_on_Ebay_Home_page() throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","webdrivers/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://www.ebay.co.uk");
        Thread.sleep(3000);

        try{
            driver.findElement(org.openqa.selenium.By.id("gdpr-banner-accept")).click();
        } catch(Exception e){}
    }

    @When("I click on Advanced Link")
    public void i_click_on_Advanced_Link() {
   driver.findElement(By.cssSelector("#gh-as-a")).click();
    }

    @Then("I navigate to Advanced Search page")
    public void i_navigate_to_Advanced_Search_page() {
        String expUrl = "https://www.ebay.co.uk/sch/ebayadvsearch";
        String ActUrl = driver.getCurrentUrl();
        if (expUrl.equals(ActUrl)){
            System.out.println("it actually passes");
        }else {
            System.out.println("It fails");
        }
//        driver.quit();
    }
    @When("I search for iphone 11")
    public void i_search_for_iphone() {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone 11");
        driver.findElement(By.cssSelector("#gh-btn")).click();
    }

    @Then("I validate at least 1000 search present")
    public void i_validate_at_least_search_present() {
        String itemCount= driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim();
        System.out.println("itemCount:" + itemCount);
        //3258
        String itemCount2 = itemCount.replace(",", "");
        System.out.println("itemCount2:" + itemCount2);
       int itemCountInt = Integer.parseInt(itemCount2);
       if(itemCountInt <= 1000){
           fail("Less than 1000 result shown");
       }
      driver.quit();
    }



}
