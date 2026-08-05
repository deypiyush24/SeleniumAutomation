package fm.framework.driver;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {

    private static final Logger logger = LoggerFactory.getLogger(DriverManager.class);
    private static final ThreadLocal<WebDriver> localThreadDriver = new ThreadLocal<>();

    public static void setTheWebDriver(WebDriver driver)
    {
        if (driver == null) {
            logger.debug("DriverManger is null.");
            throw new RuntimeException("Driver value is not set properly");
        }
        localThreadDriver.set(driver);
    }

    public static WebDriver getDriver()
    {
        logger.debug("DriverManger is started.");
        return localThreadDriver.get();
    }

    public static void closeDriver()
    {
        if (localThreadDriver.get() != null) {
            localThreadDriver.get().quit();
            localThreadDriver.remove();
        }
    }


}
