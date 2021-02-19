package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a.login")
    private WebElement btnSignIN;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement btnDrss;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement linkEvngDrss;

    @FindBy(xpath="//a[@title='Contact Us']")
    private WebElement btnContactUs;
  
    public SignInPage clickOnSignInPage() {
        btnSignIN.click();
        return new SignInPage(this.driver);
    }

    public EveningDressesPage clickOnEveningDressesLink() {
        Actions actions = new Actions(this.driver);
        Actions elem = actions.moveToElement(btnDrss);
        elem.click(linkEvngDrss).build().perform();
        return new EveningDressesPage(this.driver);
    }

    public ContactUsPage clickOnContactUs() {
        btnContactUs.click();
        return new ContactUsPage(this.driver);
    }
}
