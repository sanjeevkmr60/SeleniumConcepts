import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.linkText;

public class DifferentLocators {

    public static void main(String args[])
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F");
        //1.xpath
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("firstname");
        driver.findElement(By.xpath("//*[@id='lasttname']")).sendKeys("lastname");

        //id
        driver.findElement(By.id("firstname")).sendKeys("firstname");
        driver.findElement(By.id("lastname")).sendKeys("lastname");

        //name
        driver.findElement(By.name("firstname")).sendKeys("firstname");
        driver.findElement(By.name("lastname")).sendKeys("lastname");

        //linkText
         driver.findElement(linkText("Create account"));


        // partiallinkText
        driver.findElement(By.partialLinkText("Create acc")).click();


        // css selector
        driver.findElement(By.cssSelector("Adress1")).sendKeys("Hello");

        //class name
        driver.findElement(By.className("Adress1")).sendKeys("Hello");


    }
}
