package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static config.DriverHelper.getDriver;
import static config.WaitHelper.explicitWait;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "select#id_contact")
    private WebElement selectSubjectHeading;

    @FindBy(css = "textarea#message")
    private WebElement textArea;

    @FindBy(css = "input#fileUpload")
    private WebElement fileUploadInput;

    @FindBy(css = "button#submitMessage")
    private WebElement submitBtn;


    @FindBy(css = "input#email")
    private WebElement inputEmail;


    @FindBy(css = "input#id_order")
    private WebElement inputOrder_Id;

    @FindBy(xpath = "//p[text() = 'Your message has been successfully sent to our team.'")
    private WebElement textConfirmation;



    public ContactUsPage selectSubjectHeading(String selectedSubject) {
        Select subject = new Select(selectSubjectHeading);
        subject.selectByVisibleText(selectedSubject);
        return this;
    }

    public ContactUsPage inputContactMessage(String message) {
        textArea.sendKeys(message);
        return this;
    }


    public ContactUsPage attachingFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
        return this;
    }

    public ContactUsPage clickOnSendButton() {
        submitBtn.click();
        return this;
    }

    public ContactUsPage inputEmailAddress(String email) {
        inputEmail.sendKeys(email);
        return this;
    }

    public ContactUsPage inputOrderId(String order_id) {
        inputOrder_Id.sendKeys(order_id);
        return this;
    }

    public boolean isMessageSent(){
        return textConfirmation != null;

    }


}
