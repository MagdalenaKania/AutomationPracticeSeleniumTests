package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage extends BasePage {

    public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[.='I confirm my order']")
    private WebElement btnConfirmOrder;

    public OrderConfirmationPage  clickOnConfirmOrder(){
        btnConfirmOrder.click();
        return new OrderConfirmationPage(this.driver);
    }
}
