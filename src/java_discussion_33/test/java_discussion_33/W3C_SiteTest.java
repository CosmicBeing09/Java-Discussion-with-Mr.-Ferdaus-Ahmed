package java_discussion_33.test.java_discussion_33;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class W3C_SiteTest {

    public static WebDriver driver;

    @BeforeAll
    static void _init(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
    }


    @Test
    void headingCheck(){
        String actual = "Sample WebPage for Automation Testing";
        String expected = driver.findElement(By.className("col-md-offset-2")).getText();
        assertEquals(expected, actual);
    }

    @Test
    void heading2Check(){
        String actual = "This is sample webpage with dummy elements that will help you in learning selenium automation.";
        String expected = driver.findElement(By.xpath("/html/body/div/div[2]/div")).getText();
        assertEquals(expected, actual);
    }

    @Test
    void linkTextCheck(){
        String actual = "This is a link";
//        String expected = driver.findElement(By.linkText("This is a link")).getText();
        String expected = driver.findElement(By.partialLinkText("This is")).getText();
        assertEquals(expected, actual);
    }

    @Test
    void checkBoxTest(){
        WebElement checkbox = driver.findElement(By.cssSelector("input.Automation"));
        checkbox.click();
        assertTrue(checkbox.isSelected());
    }

    @AfterAll
    static void finishing(){
       driver.close();
    }

}