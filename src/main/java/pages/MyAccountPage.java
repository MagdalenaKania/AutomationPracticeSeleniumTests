package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage {

    public MyAccountPage() {
        super();
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
    return new SignInPage();
}

public HomePage clickOnHomeButton(){
    btnHome.click();
    return new HomePage();

}
}
