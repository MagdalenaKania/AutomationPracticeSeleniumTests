package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;



public class BasePage {
    public BasePage()
        {
            PageFactory.initElements(getDriver(), this);
        }

    private static WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = startDriver();
        }
        return driver;

    }

    private static WebDriver startDriver() {
        ClassLoader loader = BasePage.class.getClassLoader();
        String chromeDriverPath = loader.getResource("chromedriver.exe").getFile();
        File chromeDriver = new File(chromeDriverPath);

        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;

    }

    public  void closeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }



    public void implicitWait() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void explicitWait(WebElement element){
        WebDriverWait wait  = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}










