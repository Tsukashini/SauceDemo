package loadeble;

import fluentpage.InventoryFluentPage;
import fluentpage.LoginFluentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isElementExist() {
        return loginButton.isDisplayed();
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public boolean isUrlLoaded() {
       return driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }

    public void openLoginPage() {
        driver.get(WebUrls.SOUCEDEMO_MAIN_URL);
    }

    public void inputAccountData(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }


}
