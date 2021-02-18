package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EveningDressesPage extends BasePage {


    @FindBy(css = "img[title='Printed Dress']")
    private WebElement imgProduct;

    @FindBy(xpath = "//a[@title='Add to cart']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement btnProceedToCheckout;

    @FindBy(xpath = "//span[@title = 'Continue shopping']")
    private WebElement btnContinueShopping;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement btnCart;

    @FindBy(xpath = "//a[@title='View']")
    private WebElement btnMore;


    public CartSummaryPage proceedingToCheckout() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(imgProduct).click(btnAddToCart).build().perform();
        explicitWait(btnProceedToCheckout);
        btnProceedToCheckout.click();
        return new CartSummaryPage();
    }

    public EveningDressesPage addingToCart() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(imgProduct).click(btnAddToCart).build().perform();
        explicitWait(btnContinueShopping);
        btnContinueShopping.click();
        return this;
    }


    public ProductPage clickOnMoreButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(imgProduct).click(btnMore).build().perform();
        return new ProductPage();

    }

    public CartSummaryPage viewShoppingCart() {
        btnCart.click();
        return new CartSummaryPage();
    }

}
