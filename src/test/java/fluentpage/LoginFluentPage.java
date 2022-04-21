package fluentpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class LoginFluentPage extends BasePage {


    public LoginFluentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginFluentPage openLoginPage() {
        driver.get(WebUrls.SOUCEDEMO_MAIN_URL);
        return this;
    }

    public LoginFluentPage inputAccountData(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        return this;
    }

    public InventoryFluentPage clickLoginButton() {
        loginButton.click();
        return new InventoryFluentPage(driver);
    }

}
