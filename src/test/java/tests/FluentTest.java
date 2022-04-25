package tests;

import fluentpage.LoginFluentPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Retry;

public class FluentTest extends BaseTest{
    LoginFluentPage loginFluentPage;

    private static final String USERNAME = "standard_user";
    private static final String PASSWORD = "secret_sauce";

    @Test (retryAnalyzer = Retry.class)
    public void CardAddingFluentTest() {
        loginFluentPage = new LoginFluentPage(driver);
        String itemName =  loginFluentPage.openLoginPage().inputAccountData(USERNAME, PASSWORD).clickLoginButton().getItemName();
        System.out.println(itemName);
        String itemPrice =  loginFluentPage.openLoginPage().inputAccountData(USERNAME, PASSWORD).clickLoginButton().getItemPrice();
        System.out.println(itemPrice);
        Assert.assertEquals(loginFluentPage.openLoginPage().inputAccountData(USERNAME, PASSWORD).clickLoginButton().addItemToCard().cardButtonClick().getCardItemName(), itemName, "items not equals");
        Assert.assertEquals(loginFluentPage.openLoginPage().inputAccountData(USERNAME, PASSWORD).clickLoginButton().addItemToCard().cardButtonClick().getCardItemPrice(), itemPrice, "prices not equals");
    }
}
