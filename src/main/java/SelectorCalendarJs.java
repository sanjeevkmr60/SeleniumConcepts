
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectorCalendarJs {
    public static void main(String args[]) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");


        WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
        String dateVal ="12-12-2018";

        selectDateByJs(driver,date,dateVal);

    }

    public static void selectDateByJs(WebDriver driver,WebElement element,String dateVal){
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);

    }


}
