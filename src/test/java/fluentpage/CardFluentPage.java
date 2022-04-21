package fluentpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardFluentPage extends BasePage {

    public CardFluentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".inventory_item_name")
    private WebElement cardItemName;

    @FindBy (css = ".inventory_item_price")
    private WebElement cardItemPrice;

    public String getCardItemName(){
        return cardItemName.getText();
    }

    public String getCardItemPrice(){
        return cardItemPrice.getText();
    }
}
