import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {
    static int invalidimg;
    public static void main(String[] args)  {
        System.setProperty ("webdriver.chrome.driver", "D:\\SampleTest\\SeleniumConcepts\\src\\test\\java" +
                "\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ( );
        driver.manage ( ).window ( ).maximize ( );
        driver.manage ( ).timeouts ( ).implicitlyWait (10, TimeUnit.SECONDS);

       driver.get("http://ruchi-myseleniumblog.blogspot.in");
        invalidimg = 0;
        List<WebElement> images = driver.findElements(By.tagName ("img"));
        System.out.println ("Total links are " + images.size ( ));
        for (int i = 0; i < images.size ( ); i++) {
            WebElement img =  images.get (i);
            if (img != null)
                verifyImages (img);
            }
        System.out.println("Total invalid images are " + invalidimg);
        driver.quit();
    }

     public static void verifyImages(WebElement img)
     { HttpResponse response = null;
        try {
            response = new DefaultHttpClient ().execute(new HttpGet (img.getAttribute("src")));
            if (response.getStatusLine().getStatusCode() != 200)
                invalidimg++;
           } catch (Exception e) {
            e.printStackTrace ( );   }
     }

}

