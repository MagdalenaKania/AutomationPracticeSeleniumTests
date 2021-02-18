import org.junit.jupiter.api.AfterEach;
import pages.BasePage;

public class BaseTest {

    BasePage basePage = new BasePage();

    @AfterEach
    public void cleanUp() {
        basePage.closeDriver();
    }

}
