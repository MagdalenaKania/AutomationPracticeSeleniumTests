package config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitHelper {
public static void implicitWait() {
        DriverHelper.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

public static void explicitWait(WebElement element){
        WebDriverWait wait  = new WebDriverWait(DriverHelper.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        }
        }
