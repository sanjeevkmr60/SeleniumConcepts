package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
/*
Advantage:
It's great for finding a popular browser on desktop or mobile
It's reliable and runs without glitches
It has useful options for customizing how you view the browser or device you are working with
Disadvantage:
Response time is not as good as a locally installed VM
Would like it to be easier to see a device fill the screen so it's easier to use
Sometimes connection is glitchy and I have to reconnect
 */

public class BrowserStackTesting {

    public static final String USERNAME = "sai158";
    public static final String AUTOMATE_KEY = "6jsnMq49Eyb5Hxzje2D1";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    @Test
    public void ExecuteBrowserstack() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "62.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = new RemoteWebDriver (new URL(URL), caps);
        driver.get("https://www.softwaretestingmaterial.com/");
        String title = driver.getTitle ( );
        System.out.println (title );
        Assert.assertEquals (title,"Software Testing Material - Free Software Testing & Programming Tutorial" );

        driver.quit();
    }


}
