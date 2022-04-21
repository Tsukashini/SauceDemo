package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.PropertiesManager;

public class MozillaDriverManager extends DriverManager{

    @Override
    public void createDriver() {
            PropertiesManager propertiesManager = new PropertiesManager();
            System.setProperty("webdriver.gecko.driver", propertiesManager.get("PATH_TO_MOZILLA_DRIVER"));
            driver = new FirefoxDriver();
    }
}
