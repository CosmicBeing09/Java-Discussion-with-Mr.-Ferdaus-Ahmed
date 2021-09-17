package java_discussion_33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //        System.out.println(driver.findElement(By.cssSelector("div[class*='col-md-offset-2']")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div[class*='col-md-offset-2 col-md-8']")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div.col-md-offset-2[style*='font-size: 30;']")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div[style*='font-size: 30;']")).getText());
//        System.out.println(driver.findElement(By.xpath("//div[@class='col-md-offset-2 col-md-8']")).getText());



        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
//        System.out.println(driver.findElement(By.className("col-md-offset-2")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div.col-md-offset-2")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div[class*='col-md-offset']")).getText());
//        System.out.println(driver.findElement(By.xpath("//div[@class='col-md-offset-2 col-md-8']")).getText());

//        System.out.println(driver.findElement(By.cssSelector("div[class*='col-md-offset']")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[style*='font-size: 30;']")).getText());
//        driver.findElement(By.cssSelector("input[id=fname]")).sendKeys("Hey there");

        driver.close();

    }
}
