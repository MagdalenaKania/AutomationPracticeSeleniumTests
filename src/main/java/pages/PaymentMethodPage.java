package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPage extends BasePage {


    public PaymentMethodPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a.bankwire")
    private WebElement bankWirePayment;

    public OrderSummaryPage clickOnPayByBankWire() {
        bankWirePayment.click();
        return new OrderSummaryPage(this.driver);
    }
}
