package discussion_34.test.discussion_34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class SpiceJetTest {

    WebDriver driver;

    @BeforeTest
    void _init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://book.spicejet.com/search.aspx");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    void chooseFrom() throws InterruptedException {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a")).click();
        Thread.sleep(100);
    }

    @Test(priority = 2)
    void chooseDestination() throws InterruptedException {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[text*='Kolkata (CCU)']")).click();
        Thread.sleep(100);
    }

    @Test(priority = 3)
    void selectDate() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[2]/a")).click();
        Thread.sleep(100);
    }

    @Test(priority = 4)
    void selectPassenger() throws InterruptedException {
        driver.findElement(By.id("divpaxinfo")).click();
        Select select = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
        select.selectByVisibleText("3");
        Thread.sleep(100);
    }

    @Test(priority = 5)
    void selectCurrency() throws InterruptedException {
        Select select = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
        select.selectByVisibleText("BDT");
        Thread.sleep(100);

    }

    @Test(priority = 6)
    void search() throws InterruptedException {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
        Thread.sleep(1000);
        String actual = driver.findElement(By.xpath("//*[@id=\"selectMainBody\"]/div[5]/div")).getText();
        String expected = "Sorry, no fares available for this date. Please select another date and try again.";
        assertEquals(actual, expected);
    }

//    @AfterTest
//    void terminate(){
//        driver.close();
//    }

}