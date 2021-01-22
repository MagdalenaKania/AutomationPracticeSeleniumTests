package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.DriverHelper.getDriver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }


    @FindBy(css = "a.login")
    private WebElement btnSignIN;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement btnDrss;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement linkEvngDrss;


    public SignInPage clickOnSignInPage() {
        btnSignIN.click();
        return new SignInPage();
    }

    public EveningDressesPage clickOnEveningDressesLink() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnDrss).click(linkEvngDrss).build().perform();
        return new EveningDressesPage();
    }

}
