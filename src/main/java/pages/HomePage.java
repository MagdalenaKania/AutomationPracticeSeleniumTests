package pages;

import config.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 public HomePage(){
     PageFactory.initElements(DriverHelper.getDriver(), this);
 }

 @FindBy(css = "a.login")
 private WebElement btnSignIN;


 public SignInPage clickOnSignInPage(){
     btnSignIN.click();
     return new SignInPage();
 }



}
