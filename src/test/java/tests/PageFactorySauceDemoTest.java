package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactororypages.CardPage;
import pagefactororypages.InventoryPage;
import pagefactororypages.LoginPage;

public class PageFactorySauceDemoTest extends BaseTest {
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CardPage cardPage;

    private static final String USERNAME = "standard_user";
    private static final String PASSWORD = "secret_sauce";

    @Test
    public void CardAddingTest() {
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cardPage = new CardPage(driver);
        loginPage.openLoginPage();
        loginPage.inputAccountData(USERNAME, PASSWORD);
        inventoryPage.addItemToCard();
        String itemName = inventoryPage.getItemName();
        System.out.println(itemName);
        String itemPrice = inventoryPage.getItemPrice();
        System.out.println(itemPrice);
        inventoryPage.cardButtonClick();
        Assert.assertEquals(cardPage.getCardItemName(), itemName, "items not equals");
        Assert.assertEquals(cardPage.getCardItemPrice(), itemPrice, "prices not equals");
    }

}
