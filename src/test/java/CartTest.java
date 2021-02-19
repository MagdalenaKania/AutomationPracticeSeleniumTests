import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTest extends BaseTest {

	@Test
    public void asLoginUserIShallBuyProductTest() {
        boolean orderConfirmed = new HomePage(driver).clickOnEveningDressesLink()
                .proceedingToCheckout()
                .clickOnProceedToCheckoutButton()
                .inputEmailToLogin("testuser@example.com")
                .inputPasswordToLogin("Password1234")
                .clickOnSignInToOrder()
                .clickOnProceedToCheckoutButton()
                .clickOnCheckbox()
                .clickOnProceedToCheckoutButton()
                .clickOnPayByBankWire()
                .clickOnConfirmOrder()
                .isOrderConfirmed();

        assertTrue(orderConfirmed, "Order not confirmed");
    }

	@Test
    public void asNotLoginUserIShallRemoveItemFromCartTest(){
        boolean isCartEmpty = new HomePage(driver).clickOnEveningDressesLink()
                .addingToCart()
                .viewShoppingCart()
                .clickOnDeleteIcon()
                .isCartEmpty();
        assertTrue(isCartEmpty, "Cart is not empty!");




}

}
