package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class OrderSummaryPage {
    public OrderSummaryPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "button[type = 'submit']")
    private WebElement btnConfirmOrder;

    public OrderConfirmationPage  clickOnConfirmOrder(){
        btnConfirmOrder.click();
        return new OrderConfirmationPage();
    }
}
