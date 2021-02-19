package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage {


    public ShippingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button[name = 'processCarrier']")
    private WebElement btnProceedToCheckout;

    @FindBy(css = "input#cgv")
    private WebElement checkbox;

    public ShippingPage clickOnCheckbox() {
        checkbox.click();
        return this;
    }

    public PaymentMethodPage clickOnProceedToCheckoutButton() {
        btnProceedToCheckout.click();
        return new PaymentMethodPage(this.driver);
    }

}
