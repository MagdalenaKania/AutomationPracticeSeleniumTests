package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverHelper {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = startDriver();
        }
        return driver;

    }

    private static WebDriver startDriver() {
        ClassLoader loader = DriverHelper.class.getClassLoader();
        String chromeDriverPath = loader.getResource("chromedriver.exe").getFile();
        File chromeDriver = new File(chromeDriverPath);

        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;

    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
