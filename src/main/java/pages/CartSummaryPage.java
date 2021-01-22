package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class CartSummaryPage {
    public CartSummaryPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath="//p[@class='cart_navigation clearfix'] /*[1]")
    private WebElement btnProceedToCheckout;


    public SignInPage clickOnProceedToCheckoutButton(){
        btnProceedToCheckout.click();
        return new SignInPage();
    }


}
