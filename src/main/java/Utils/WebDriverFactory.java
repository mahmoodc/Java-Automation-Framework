package Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {

    private static ThreadLocal<WebDriver> _driver = new ThreadLocal<WebDriver>();

    public static WebDriver webdriver() {
        return _driver.get();
    }

/*    public static WebDriver _driver;

    public static WebDriver webdriver() {
        return _driver;
    }*/

    private static String BrowDir = System.getProperty("user.dir") + "\\src\\main\\Drivers\\";

    public static void CloseBrowser() {
        if (_driver.get() instanceof InternetExplorerDriver) {
            Logger.log().info("Closing driver instance...");
            _driver.get().close();
        }
        Logger.log().info("Closing driver instance...");
        _driver.get().quit();
    }

    @Parameters({"driver"})
    public static WebDriver InitDriver(String driver) {
        try {
            Logger.log().info("Initializing driver instance...");
            String Driver = driver;
            //String Driver = "ipad";
            switch (Driver) {
                case "chrome": {
                    System.setProperty("webdriver.chrome.driver", BrowDir + "chromedriver.exe");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--disable-notifications");
                    _driver.set(new ChromeDriver(chromeOptions));
                    _driver.get().manage().window().maximize();
                    break;
                }
                case "edge": {
                    System.setProperty("webdriver.edge.driver", BrowDir + "MicrosoftWebDriver.exe");
                    _driver.set(new EdgeDriver());
                    _driver.get().manage().window().maximize();
                    break;
                }
                case "ie": {
                    System.setProperty("webdriver.ie.driver", BrowDir + "IEDriverServer.exe");
                    InternetExplorerOptions ieoptions = new InternetExplorerOptions();
                    ieoptions.disableNativeEvents();
                    _driver.set(new InternetExplorerDriver(ieoptions));
                    _driver.get().manage().window().maximize();
                    break;
                }
                case "firefox": {
                    System.setProperty("webdriver.gecko.driver", BrowDir + "geckodriver.exe");
                    _driver.set(new FirefoxDriver());
                    _driver.get().manage().window().maximize();
                    break;
                }
                case "iphone x": {
                    System.setProperty("webdriver.chrome.driver", BrowDir + "chromedriver.exe");
                    Map<String, String> mobileEmulation = new HashMap<>();
                    mobileEmulation.put("deviceName", "iPhone X");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                    _driver.set(new ChromeDriver(chromeOptions));
                    _driver.get().manage().window().maximize();
                    break;
                }
                case "ipad": {
                    System.setProperty("webdriver.chrome.driver", BrowDir + "chromedriver.exe");
                    Map<String, String> mobileEmulation = new HashMap<>();
                    mobileEmulation.put("deviceName", "iPad");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                    _driver.set(new ChromeDriver(chromeOptions));
                    _driver.get().manage().window().maximize();
                    break;
                }
                case "S5": {
                    System.setProperty("webdriver.chrome.driver", BrowDir + "chromedriver.exe");
                    Map<String, String> mobileEmulation = new HashMap<>();
                    mobileEmulation.put("deviceName", "Galaxy S5");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                    _driver.set(new ChromeDriver(chromeOptions));
                    _driver.get().manage().window().maximize();
                    break;
                }
                default:
                    throw new WebDriverException("Browser is not supported or name is wrong");
            }
            return _driver.get();

        } catch (WebDriverException driver1) {
            Logger.log().error("Failed to create driver instance!", driver1);
            throw driver1;
        }
    }
}