package Page_Object_Test;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {
    public static final String USERNAME = "kamrun2";
    public static final String AUTOMATE_KEY = "oexBu6JakUtNBmNJp8yd";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");
        caps.setCapability("name", "kamrun2's First Test");


        WebDriver driver = new RemoteWebDriver(new URL("https://" + "kamrun2" + ":" + "oexBu6JakUtNBmNJp8yd"+ "@hub-cloud.browserstack.com/wd/hub"), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Browserstack");
        element.submit();
        System.out.println(driver.getTitle());
        driver.quit();


    }


}