package pages;

import config.DriverHelper;
import config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public MyAccountPage(){
        PageFactory.initElements(DriverHelper.getDriver(), this);
        WaitHelper.explicitWait(heading);
    }

    @FindBy(css = "h1.page-heading")
    private WebElement heading;

    @FindBy(css="a.logout")
    private WebElement btnSignOut;

public String getTextFromHeading(){
    return heading.getText();
}

public SignInPage clickOnSignOutButton(){
    btnSignOut.click();
    return new SignInPage();
}
}
