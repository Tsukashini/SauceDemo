package tests;

import loadeble.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoadCompanentLoginTest extends BaseTest{

    LoginPage loginPage;

    private static final String USERNAME = "standard_user";
    private static final String PASSWORD = "secret_sauce";

    @Test
    public void LoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        Assert.assertTrue(loginPage.isElementExist());
        loginPage.inputAccountData(USERNAME, PASSWORD);
        Assert.assertTrue(loginPage.isUrlLoaded(), "Login not done");

    }

}
