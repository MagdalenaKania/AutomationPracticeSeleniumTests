package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class OrderConfirmationPage {
    public OrderConfirmationPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
    private  WebElement textOrder;

    public boolean isOrderConfirmed(){
        return textOrder != null;
    }

}
