package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {

    @FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
    private  WebElement textOrder;

    public boolean isOrderConfirmed(){
        return textOrder != null;
    }

}
