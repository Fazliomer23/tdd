package tek_bdd.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tek_bdd.utiles.SeleniumUtility;

import java.util.logging.Logger;

public class UIBaseClass extends SeleniumUtility {
    private static final Logger LOGGER = LogManager.getLogger(UIBaseClass.class);

    @BeforeMethod
    public void setupTests() {
        LOGGER.info("Setup Test and opening browser");
        setupBrowser();
    }


    @AfterMethod
    public void testCleanup() {
        LOGGER.info("running after each test and quite browser");
        quitBrowser();
    }

}
