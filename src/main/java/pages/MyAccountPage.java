package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
        explicitWait(heading);
    }


    @FindBy(css = "h1.page-heading")
    private WebElement heading;

    @FindBy(css="a.logout")
    private WebElement btnSignOut;

    @FindBy(xpath = "//a[@title='Home']")
    private WebElement btnHome;



public String getTextFromHeading(){
    return heading.getText();
}

public SignInPage clickOnSignOutButton(){
    btnSignOut.click();
    return new SignInPage(this.driver);
}

public HomePage clickOnHomeButton(){
    btnHome.click();
    return new HomePage(this.driver);

}
}
