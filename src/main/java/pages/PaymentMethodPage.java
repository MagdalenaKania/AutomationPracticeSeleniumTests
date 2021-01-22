package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class PaymentMethodPage {
    public PaymentMethodPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "a.bankwire")
    private WebElement bankWirePayment;

    public OrderSummaryPage clickOnPayByBankWire() {
        bankWirePayment.click();
        return new OrderSummaryPage();
    }
}
