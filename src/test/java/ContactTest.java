import org.junit.jupiter.api.Test;
import pages.HomePage;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void asLoginUserIShallSentFormWithAttachmentTest() throws URISyntaxException {
        URL filePath = getClass().getClassLoader().getResource("test.txt");
        File file = Paths.get(filePath.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        boolean isMessageSent = homePage.clickOnContactUs()
                .selectSubjectHeading("Customer service")
                .inputEmailAddress("test@gmail.com")
                .inputOrderId("12345")
                .inputContactMessage("Test")
                .attachingFile(absolutePath)
                .clickOnSendButton()
                .isMessageSent();

        assertTrue(isMessageSent, "Contact message was not sent!");
    }


}
