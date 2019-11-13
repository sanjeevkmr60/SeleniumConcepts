import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns {

    public static void main(String args[]){

            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.get("https://www.facebook.com/?stype=lo&jlou=Afd7UlUDQo8KbGPMtKiersVVEmdpWYk9f9eyQgl8T6Z0lg3g2G4ltKfLRrkoV8VML8lthv3c0_Lui0-1UKnWGvxEMmosSc_fwYn6jsJwhiKAQw&smuh=9891&lh=Ac_SP6ug8bcPE6PS");
            Select select=new Select(driver.findElement(By.id("month")));
            select.selectByVisibleText("Aug");
            driver.quit();
        }
    }

