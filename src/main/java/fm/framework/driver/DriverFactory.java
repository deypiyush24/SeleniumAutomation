package fm.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static final Logger logger = LoggerFactory.getLogger(DriverFactory.class);




    public void  initTheWebDriver(String browserName) throws MalformedURLException {
        WebDriver driver = null;
        switch(browserName.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--incognito");
                driver = new ChromeDriver();
                logger.info("ChromeBrowser started {}",browserName);

            case "firefox":
                driver = new FirefoxDriver();
                logger.info("FixeFoxDriver started {}",browserName);
                break;
            case "remoteDriver":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new"); // Run headless for optimal speed
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
                logger.info("RemoteWebDriver started {}",browserName);
                break;
            default:
                throw new RuntimeException("Invalid browser: " + browserName);
        }

        DriverManager.setTheWebDriver(driver);



    }
}
