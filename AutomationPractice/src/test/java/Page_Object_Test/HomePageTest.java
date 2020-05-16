package Page_Object_Test;

import Page_Object.HomePage;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class HomePageTest extends BrowserDriver {
    HomePage homePage = null;

    @BeforeMethod
    public void initialiseElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchTest() throws InterruptedException {
        String actualValue = homePage.search();
        String expectedValue = "Showing 1 - 1 of 1 item";
        Assert.assertEquals(actualValue, expectedValue);
    }
    @AfterMethod
    public void shutdown () {driver.close();
    }
}
