package uk.be2co.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by olja on 06/01/16.
 */
public class BaseTest {

    private static final ThreadLocal<WebDriver> DRIVER = new  ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return DRIVER.get();
    }

    public void loadSiteUlr(String url){
        getDriver().get(url);
    }

    @BeforeMethod
    public void setUP(){
        DRIVER.set(new FirefoxDriver());
    }

    @AfterMethod
    public void tearDown(){
        if (getDriver() != null){
            getDriver().quit();
        }
    }



}
