package tests;

import loadeble.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Retry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadCompanentLoginTest extends BaseTest{

    LoginPage loginPage;

    private static final String USERNAME = "standard_user";
    private static final String PASSWORD = "secret_sauce";

    @Test (groups = {"load"})
    public void LoginTest() throws IOException {
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        Assert.assertTrue(loginPage.isElementExist());
        loginPage.inputAccountData(USERNAME, PASSWORD);
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        byte[] sourceFile = screenShot.getScreenshotAs(OutputType.BYTES);
        Files.write(Paths.get("src/test/resources/screenshot.png"), sourceFile);
        Assert.assertTrue(loginPage.isUrlLoaded(), "Login not done");

    }

    @Test (retryAnalyzer = Retry.class)
    public void LoginTest1() throws IOException {
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        Assert.assertTrue(loginPage.isElementExist());
        loginPage.inputAccountData(USERNAME, PASSWORD);
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        byte[] sourceFile = screenShot.getScreenshotAs(OutputType.BYTES);
        Files.write(Paths.get("src/test/resources/screenshot.png"), sourceFile);
        Assert.assertTrue(loginPage.isUrlLoaded(), "Login not done");

    }

}
