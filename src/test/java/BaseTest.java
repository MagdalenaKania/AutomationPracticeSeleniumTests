import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	
	public WebDriver driver;

	private WebDriver startDriver() {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
        String chromeDriverPath = loader.getResource("chromedriver.exe").getFile();
        File chromeDriver = new File(chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;

    }
    
    @BeforeEach
    public void start() {
    	this.driver = startDriver();
    }    

    @AfterEach
    public void cleanUp() {
    	this.driver.close();
        this.driver.quit();
        this.driver = null;
    }
}
