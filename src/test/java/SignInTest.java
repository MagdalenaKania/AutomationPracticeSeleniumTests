import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignInTest extends BaseTest {


    private HomePage homePage = new HomePage();

    @Test
    public void asNotRegisteredCustomerIShallCreateAnAccount() {
        String headingText = homePage.clickOnSignInPage()
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
    public void asRegisteredUserShallILogin() {
        String textHeading = homePage.clickOnSignInPage()
                .inputEmailToLogin("usertest@example.com")
                .inputPasswordToLogin("automationpractice.com")
                .clickOnSignInButton()
                .getTextFromHeading();
        assertEquals("MY ACCOUNT", textHeading);

    }

    @Test
    public void asLoggedUserShallILogOut() {
        String signInHeading = homePage.clickOnSignInPage()
                .inputEmailToLogin("usertest@example.com")
                .inputPasswordToLogin("automationpractice.com")
                .clickOnSignInButton()
                .clickOnSignOutButton()
                .getTextFromHeading();
        assertEquals("AUTHENTICATION", signInHeading);

    }
}