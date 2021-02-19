package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
    public  WebDriver driver;
	
    public BasePage(WebDriver driver)
        {
            this.driver = driver;
    		PageFactory.initElements(driver, this);
        }

    public void implicitWait() {
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void explicitWait(WebElement element){
        WebDriverWait wait  = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}










