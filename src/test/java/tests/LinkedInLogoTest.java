package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;


public class LinkedInLogoTest extends BaseTest {
    private static final String USERNAME = "standard_user";
    private static final String PASSWORD = "secret_sauce";


    @Test
    public void linkedInLogoTest() {
        driverManager.removeTimeout();
        driver.get(WebUrls.SOUCEDEMO_MAIN_URL);
        driver.findElement(By.id("user-name")).sendKeys(USERNAME);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.partialLinkText("LinkedIn")).click();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//icon[@data-test-id='nav-logo']")));
        Assert.assertTrue(driver.findElement(By.xpath("//icon[@data-test-id='nav-logo']")).isDisplayed(), "Logo not displayed");
    }
}
