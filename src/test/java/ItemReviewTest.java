import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemReviewTest extends BaseTest {

	@Test
    public void asLoginUserIShallAddItemReviewTest() {
        boolean isReviewAdded = new HomePage(driver).clickOnSignInPage()
                .inputEmailToLogin("testuser@example.com")
                .inputPasswordToLogin("Password1234")
                .clickOnSignInButton()
                .clickOnHomeButton()
                .clickOnEveningDressesLink()
                .clickOnMoreButton()
                .openingWriteAReviewWindow()
                .inputTitle("TEST")
                .inputComment("TEST")
                .clickOnSendBtn()
                .isReviewAdded();

        assertTrue(isReviewAdded, "Review not added!");


    }

}
