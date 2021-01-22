package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;
import static config.WaitHelper.explicitWait;

public class EveningDressesPage {
    public EveningDressesPage() {
        PageFactory.initElements(getDriver(), this);
    }


    @FindBy(css = "img[title='Printed Dress']")
    private WebElement imgProduct;

    @FindBy(xpath = "//a[@title='Add to cart']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement btnProceedToCheckout;


    public CartSummaryPage proceedingToCheckout() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(imgProduct).click(btnAddToCart).build().perform();
        explicitWait(btnProceedToCheckout);
        btnProceedToCheckout.click();
        return new CartSummaryPage();
    }

}
