package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class WebDriverFactory {

    private static ThreadLocal<WebDriver> _driver = new ThreadLocal<WebDriver>();

    public static WebDriver webDriver = _driver.get();

    private static String CurDir = System.getProperty("user.dir") + "\\src\\main\\Drivers\\";
    private static String Drivername = "chrome";

    public static void CloseBrowser() {
        if (_driver.get() instanceof InternetExplorerDriver) {
            _driver.get().close();
        }
        _driver.get().quit();
    }



    public static WebDriver InitDriver() {
        try {
                switch (Drivername) {
                    case "chrome": {
                        System.setProperty("webdriver.chrome.driver", CurDir + "chromedriver.exe");
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("--disable-notifications");
                        _driver.set(new ChromeDriver(chromeOptions));
                        _driver.get().manage().window().maximize();
                        break;
                    }
                    case "edge": {
                        System.setProperty("webdriver.edge.driver", CurDir + "MicrosoftWebDriver.exe");
                        _driver.set(new EdgeDriver());
                        _driver.get().manage().window().maximize();
                        break;
                    }
                    case "ie": {
                        System.setProperty("webdriver.ie.driver", CurDir + "IEDriverServer.exe");
                        InternetExplorerOptions ieoptions = new InternetExplorerOptions();
                        ieoptions.disableNativeEvents();
                        _driver.set(new InternetExplorerDriver(ieoptions));
                        _driver.get().manage().window().maximize();
                        break;
                    }
                    case "firefox": {
                        System.setProperty("webdriver.gecko.driver", CurDir + "geckodriver.exe");
                        _driver.set(new FirefoxDriver());
                        _driver.get().manage().window().maximize();
                        break;
                    }
                    default:
                        throw new WebDriverException("Browser is not supported or name is wrong");
                }
                return _driver.get();

        } catch (WebDriverException driver) {
            throw driver;
        }
    }
}