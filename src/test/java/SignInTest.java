import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class SignInTest extends BaseTest {

    @Test
    public void asNotRegisteredCustomerIShallCreateAnAccountTest() {
    	String headingText = new HomePage(driver).clickOnSignInPage()
                .inputEmailToCreateAccount("example" + Math.random() + "@email.com")
                .clickOnCreateAnAccountButton()
                .inputFirstName("User")
                .inputLastName("Test")
                .inputPassword("Password1234")
                .inputCompany("TestCompany")
                .inputAddress("Address Test 1/2")
                .inputCity("Test")
                .selectState("Alabama")
                .inputPostalCode(20000)
                .inputMobilePhone(123456789)
                .clickOnRegisterButton()
                .getTextFromHeading();

        assertEquals("MY ACCOUNT", headingText);

    }

    @Test
    public void asRegisteredUserShallILoginTest() {
        String textHeading = new HomePage(driver).clickOnSignInPage()
                .inputEmailToLogin("testuser@example.com")
                .inputPasswordToLogin("Password1234")
                .clickOnSignInButton()
                .getTextFromHeading();
        assertEquals("MY ACCOUNT", textHeading);

    }

    @Test
    public void asLoggedUserShallILogOutTest() {
        String signInHeading = new HomePage(driver).clickOnSignInPage()
                .inputEmailToLogin("testuser@example.com")
                .inputPasswordToLogin("Password1234")
                .clickOnSignInButton()
                .clickOnSignOutButton()
                .getTextFromHeading();
        assertEquals("AUTHENTICATION", signInHeading);

    }
}