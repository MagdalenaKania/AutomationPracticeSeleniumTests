package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
		super(driver);
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
        return new PersonalInformationPage(this.driver);
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
        return new MyAccountPage(this.driver);
    }

    public AddressesPage  clickOnSignInToOrder(){
        btnSubmitLogin.click();
        return new AddressesPage(this.driver);
    }
public String getTextFromHeading(){
       return headingSignIn.getText();
}

}
