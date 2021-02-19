package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartSummaryPage extends BasePage {


    public CartSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//p[@class='cart_navigation clearfix'] /*[1]")
    private WebElement btnProceedToCheckout;

    @FindBy(xpath="//a[@title='Delete']")
    private WebElement btnDelete;

    @FindBy(xpath="//*[.='Your shopping cart is empty.']")
    private WebElement textAlert;


    public SignInPage clickOnProceedToCheckoutButton(){
        btnProceedToCheckout.click();
        return new SignInPage(this.driver);
    }

    public CartSummaryPage clickOnDeleteIcon(){
        btnDelete.click();
        return this;
    }

    public boolean isCartEmpty(){
        return textAlert !=null;
    }


}
