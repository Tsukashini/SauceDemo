package pagefactororypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[3]")
    private WebElement itemName;

    @FindBy(xpath= "(//div[@class='inventory_item_price'])[3]")
    private WebElement itemPrice;

    @FindBy(xpath = "((//div[@class='pricebar'])[3])/button")
    private WebElement addToCardButton;

    @FindBy (css = ".shopping_cart_container")
    private WebElement cardButton;

    public String getItemPrice() {
        return itemPrice.getText();
    }

    public String getItemName() {
        return itemName.getText();
    }
    public void addItemToCard() {
        addToCardButton.click();
    }

    public void cardButtonClick() {
        cardButton.click();
    }
}
