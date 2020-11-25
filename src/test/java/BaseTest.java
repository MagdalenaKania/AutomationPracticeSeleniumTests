import config.DriverHelper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup(){
        this.driver = DriverHelper.getDriver();
    }

    @AfterEach
    public void cleanUp() {
        DriverHelper.closeDriver();
    }

}
