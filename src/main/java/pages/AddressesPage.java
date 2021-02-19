package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddressesPage extends BasePage {

    public AddressesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button[name = 'processAddress']")
    private WebElement btnProceedToCheckout;

    public ShippingPage clickOnProceedToCheckoutButton() {
        btnProceedToCheckout.click();
        return new ShippingPage(this.driver);
    }
}
