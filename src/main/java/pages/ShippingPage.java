package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class ShippingPage {
    public ShippingPage() {
        PageFactory.initElements(getDriver(), this);
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
        return new PaymentMethodPage();
    }

}
