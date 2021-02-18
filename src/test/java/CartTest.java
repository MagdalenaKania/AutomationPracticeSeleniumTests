import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTest extends BaseTest {
    private HomePage homePage = new HomePage();

    @Test
    public void asLoginUserIShallBuyProductTest() {
        boolean orderConfirmed = homePage.clickOnEveningDressesLink()
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
        boolean isCartEmpty = homePage.clickOnEveningDressesLink()
                .addingToCart()
                .viewShoppingCart()
                .clickOnDeleteIcon()
                .isCartEmpty();
        assertTrue(isCartEmpty, "Cart is not empty!");




}

}
