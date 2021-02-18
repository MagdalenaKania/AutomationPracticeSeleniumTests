package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddressesPage extends BasePage {

    @FindBy(css = "button[name = 'processAddress']")
    private WebElement btnProceedToCheckout;



    public ShippingPage clickOnProceedToCheckoutButton() {
        btnProceedToCheckout.click();
        return new ShippingPage();
    }

}
