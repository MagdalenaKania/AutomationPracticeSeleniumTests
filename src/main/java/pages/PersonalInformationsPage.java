package pages;

import config.DriverHelper;
import config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationsPage {

    public PersonalInformationsPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
        WaitHelper.explicitWait(inptFirstName);
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


    public PersonalInformationsPage inputFirstName(String firstName) {
        inptFirstName.sendKeys(firstName);
        return this;
    }

    public PersonalInformationsPage inputLastName(String lastName) {
        inptLastName.sendKeys(lastName);
        return this;
    }

    public PersonalInformationsPage inputPassword(String password) {
        inptPassword.sendKeys(password);
        return this;
    }

    public PersonalInformationsPage inputCompany(String company) {
        inptCompany.sendKeys(company);
        return this;
    }

    public PersonalInformationsPage inputAddress(String address) {
        inptAddress.sendKeys(address);
        return this;
    }

    public PersonalInformationsPage inputCity(String city) {
        inptCity.sendKeys(city);
        return this;
    }

    public PersonalInformationsPage selectState(String selectedState) {
        Select state = new Select(stateSelector);
        state.selectByVisibleText(selectedState);
        return this;

    }

    public PersonalInformationsPage inputPostalCode(int postalCode) {
        inptPostalCode.sendKeys(String.valueOf(postalCode));
        return this;
    }

    public PersonalInformationsPage inputMobilePhone(int mobilePhone) {
        inptPhoneMobile.sendKeys(String.valueOf(mobilePhone));
        return this;
    }

    public MyAccountPage clickOnRegisterButton() {
        btnSubmit.click();
        return new MyAccountPage();
    }
}
