import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NotClickablePointException {
    public static void main(String[] args) {
        System.setProperty ("webdriver.chrome.driver", "D:\\SampleTest\\SeleniumConcepts\\src\\test\\java" +
                "\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver ();

        driver.get ("https://login.yahoo.com/");
        driver.manage ().timeouts ().implicitlyWait (60, TimeUnit.SECONDS);
        System.out.println ("*********************************" );

        WebElement ele=driver.findElement(By.id("persistent"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);



        }
}
