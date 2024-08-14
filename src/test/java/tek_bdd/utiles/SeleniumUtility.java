package tek_bdd.utiles;

import tek_bdd.base.BaseSetUpClass;

import java.time.Duration;
import java.util.logging.Logger;

import static java.sql.DriverManager.getDriver;


public class SeleniumUtility extends BaseSetUpClass {
    private static final Logger LOGGER = LogManager.getLogger(SeleniumUtility.class);
    private WebDriverWait getWait()  {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_TIME_IN_SECOND));
    }

    public String getElementText(By locator) {
        LOGGER.debug("Returning element Text {}" , locator);
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }
}
