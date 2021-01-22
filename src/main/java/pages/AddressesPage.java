package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class AddressesPage {
    public AddressesPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "button[name = 'processAddress']")
    private WebElement btnProceedToCheckout;

    public ShippingPage clickOnProceedToCheckoutButton() {
        btnProceedToCheckout.click();
        return new ShippingPage();
    }

}
