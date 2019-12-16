import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
    public static void main(String args[])
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\SampleTest\\SeleniumConcepts\\src\\test\\java\\SeleniumDrivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("title of the application = " + title);
        if(title.equals("Google"))
            System.out.println("Correct Url");
        else
            System.out.println("Incorrect Url");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();
    }

}
