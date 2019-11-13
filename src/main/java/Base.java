import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver;

    public static void initialization(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    public void failed(String testMethodName){
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("D:\\SampleTest\\SeleniumConcepts\\Screenshots\\"+testMethodName+"_"+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
