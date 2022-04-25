package tests;

import driver.DriverFactory;
import driver.DriverManager;
import driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.TestListeners;

import java.net.MalformedURLException;

@Listeners (TestListeners.class)
public class BaseTest {
    WebDriver driver;
    DriverManager driverManager;
    DriverType driverType;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {
        DriverFactory factory = new DriverFactory();
        driverType = null;
        if (browser.equals("chrome")) {
            driverType = DriverType.CHROME;
        } else if (browser.equals("firefox")) {
            driverType = DriverType.MOZILLA;
        }
        driverManager = factory.getManager(driverType);
        driverManager.createDriver();
        driver = driverManager.getDriver();
        driverManager.maximize();
        driverManager.setTimeout();
    }
    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}
