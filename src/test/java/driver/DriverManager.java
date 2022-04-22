package driver;

import org.openqa.selenium.WebDriver;
import staticdata.WebTimeouts;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class DriverManager {

    protected WebDriver driver;
    public abstract void createDriver() throws MalformedURLException;

    public WebDriver getDriver() {
        return driver;
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void setTimeout() {
        driver.manage().timeouts().implicitlyWait(WebTimeouts.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(WebTimeouts.SCRIPT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(WebTimeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public  void removeTimeout() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void quitDriver() {
        driver.quit();
    }
}
