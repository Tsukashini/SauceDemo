package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class SauceDemoTest extends BaseTest{
    private static final String USERNAME ="standard_user";
    private static final String PASSWORD ="secret_sauce";



    @Test
    public void SignIn() {
        driver.get(WebUrls.SOUCEDEMO_MAIN_URL);
        driver.findElement(By.id("user-name")).sendKeys(USERNAME);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("login-button")).click();
        String itemName = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[3]")).getText();
        System.out.println(itemName);
        String itemPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[3]")).getText();
        System.out.println(itemPrice);
        driver.findElement(By.xpath("((//div[@class='pricebar'])[3])/button")).click();
        driver.findElement(By.cssSelector(".shopping_cart_container")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_item_name")).getText(), itemName, "items not equals");
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_item_price")).getText(), itemPrice, "prices not equals");
    }

}
