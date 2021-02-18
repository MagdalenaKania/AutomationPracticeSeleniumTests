package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProductPage extends BasePage {


    @FindBy(css = "a#new_comment_tab_btn")
    private WebElement firstReviewBtn;

    @FindBy(css = "input#comment_title")
    private WebElement titleInput;

    @FindBy(css = "textarea#content")
    private WebElement commentInput;

    @FindBy(css = "button#submitNewMessage")
    private WebElement btnSend;

    @FindBy(xpath = "//p[.='Your comment has been added and will be available once approved by a moderator']")
    private WebElement textConfirmation;


    public ProductPage openingWriteAReviewWindow(){
        firstReviewBtn.click();
        explicitWait(titleInput);
        return this;
    }

    public ProductPage inputTitle(String title){
        titleInput.sendKeys(title);
        return this;
    }

    public ProductPage inputComment(String comment){
        commentInput.sendKeys(comment);
        return this;
    }

    public ProductPage clickOnSendBtn(){
        btnSend.click();
        return new ProductPage();
    }

    public boolean isReviewAdded(){
        return textConfirmation != null;
    }

}
