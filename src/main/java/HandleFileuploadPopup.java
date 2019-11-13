import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFileuploadPopup {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\sanjeevb\\Desktop\\Wizard.txt");


    }
}
