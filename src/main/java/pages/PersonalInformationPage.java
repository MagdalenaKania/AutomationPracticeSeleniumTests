package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationPage extends BasePage {

    public PersonalInformationPage() {

        super();
        explicitWait(inptFirstName);

    }


    @FindBy(css = "input#customer_firstname")
    private WebElement inptFirstName;

    @FindBy(css = "input#customer_lastname")
    private WebElement inptLastName;

    @FindBy(css = "input#passwd")
    private WebElement inptPassword;

    @FindBy(css = "input#company")
    private WebElement inptCompany;

    @FindBy(css = "select#id_state")
    private WebElement stateSelector;

    @FindBy(css = "input#address1")
    private WebElement inptAddress;

    @FindBy(css = "input#city")
    private WebElement inptCity;

    @FindBy(css = "input#postcode")
    private WebElement inptPostalCode;

    @FindBy(css = "input#phone_mobile")
    private WebElement inptPhoneMobile;

    @FindBy(css = "button#submitAccount")
    private WebElement btnSubmit;


    public PersonalInformationPage inputFirstName(String firstName) {
        inptFirstName.sendKeys(firstName);
        return this;
    }

    public PersonalInformationPage inputLastName(String lastName) {
        inptLastName.sendKeys(lastName);
        return this;
    }

    public PersonalInformationPage inputPassword(String password) {
        inptPassword.sendKeys(password);
        return this;
    }

    public PersonalInformationPage inputCompany(String company) {
        inptCompany.sendKeys(company);
        return this;
    }

    public PersonalInformationPage inputAddress(String address) {
        inptAddress.sendKeys(address);
        return this;
    }

    public PersonalInformationPage inputCity(String city) {
        inptCity.sendKeys(city);
        return this;
    }

    public PersonalInformationPage selectState(String selectedState) {
        Select state = new Select(stateSelector);
        state.selectByVisibleText(selectedState);
        return this;

    }

    public PersonalInformationPage inputPostalCode(int postalCode) {
        inptPostalCode.sendKeys(String.valueOf(postalCode));
        return this;
    }

    public PersonalInformationPage inputMobilePhone(int mobilePhone) {
        inptPhoneMobile.sendKeys(String.valueOf(mobilePhone));
        return this;
    }

    public MyAccountPage clickOnRegisterButton() {
        btnSubmit.click();
        return new MyAccountPage();
    }
}
