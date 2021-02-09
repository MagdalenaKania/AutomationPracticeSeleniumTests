import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemReviewTest extends BaseTest {
    private HomePage homePage = new HomePage();

    @Test
    public void asLoginUserIShallAddItemReview() {
        boolean isReviewAdded = homePage.clickOnSignInPage()
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
