import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
    public static void main(String args[]) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        Actions action = new Actions(driver);
       action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
               .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
               .release().build().perform();

       driver.quit();


    }
}
