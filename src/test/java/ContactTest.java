import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void asLoginUserIShallSentFormWithAttachment() {
        boolean isMessageSent = homePage.clickOnContactUs()
                .selectSubjectHeading("Customer service")
                .inputEmailAddress("test@gmail.com")
                .inputOrderId("12345")
                .inputContactMessage("Test")
                .attachingFile("C:\\\\Users\\\\mkania\\\\OneDrive - Objectivity Sp. z o.o\\\\Pulpit\\\\test.txt")
                .clickOnSendButton()
                .isMessageSent();

        assertTrue(isMessageSent, "Contact message was not sent!");
    }


}
