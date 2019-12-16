package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTests {
    @Test
    public void getIE(){
        System.setProperty("webdriver.ie.driver", "D:\\SampleTest\\SeleniumConcepts\\src\\test\\java" +
                "\\SeleniumDrivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver ();
        driver.get("http://www.SoftwareTestingMaterial.com");
        System.out.println ("Executed IE" );
        driver.close();
    }

    @Test
    public void getChorme(){
        System.setProperty("webdriver.chrome.driver", "D:\\SampleTest\\SeleniumConcepts\\src\\test\\java" +
                "\\SeleniumDrivers\\chromedriver.exe");
        System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver ();
        driver.get("http://www.SoftwareTestingMaterial.com");
        System.out.println ("Executed chrome" );
        driver.close();
        driver.quit ();
    }


}
