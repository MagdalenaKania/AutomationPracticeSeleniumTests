package pages;

import config.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    @FindBy(css = "input#email_create")
    private WebElement inptCreateEmail;

    @FindBy(css = "button#SubmitCreate")
    private WebElement btnCreateAccount;

    @FindBy(css = "input#email")
    private WebElement inptEmail;

    @FindBy(css = "input#passwd")
    private WebElement inptPasswd;

    @FindBy(css = "button#SubmitLogin")
    private WebElement btnSubmitLogin;

    @FindBy(css="h1.page-heading")
    private WebElement headingSignIn;



    public SignInPage inputEmailToCreateAccount(String email) {
        inptCreateEmail.sendKeys(email);
        return this;
    }

    public PersonalInformationPage clickOnCreateAnAccountButton() {
        btnCreateAccount.click();
        return new PersonalInformationPage();
    }

    public SignInPage inputEmailToLogin(String email) {
        inptEmail.sendKeys(email);
        return this;
    }

    public SignInPage inputPasswordToLogin(String passwd){
        inptPasswd.sendKeys(passwd);
        return this;
    }

    public MyAccountPage clickOnSignInButton(){
        btnSubmitLogin.click();
        return new MyAccountPage();
    }

    public AddressesPage  clickOnSignInToOrder(){
        btnSubmitLogin.click();
        return new AddressesPage();
    }
public String getTextFromHeading(){
       return headingSignIn.getText();
}

}
