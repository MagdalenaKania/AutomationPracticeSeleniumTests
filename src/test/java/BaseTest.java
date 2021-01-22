import config.DriverHelper;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    @AfterEach
    public void cleanUp() {
        DriverHelper.closeDriver();
    }

}
