import Pages.LogInPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppiumTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void falseLoginTest() throws InterruptedException {
        new LogInPage(driver).logInTest();
    }
}
