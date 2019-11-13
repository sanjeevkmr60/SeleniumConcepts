import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopHandling {

    public static void main(String args[]){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        if(alert.getText().equals("Please enter a valid user name"))
            System.out.println(alert.getText());
        else
            System.out.println("incorrect Alert text");
        alert.accept();
        driver.quit();
        System.out.println("Hello");

    }
}
