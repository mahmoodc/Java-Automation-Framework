package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {

        public void Back() {
            WebDriverFactory.webdriver().navigate().back();
        }

        public void DeleteCookies() {
            WebDriverFactory.webdriver().manage().deleteAllCookies();
        }

        public void Forward() {
            WebDriverFactory.webdriver().navigate().forward();
        }

        public String GetCurrentUrl() {
            return WebDriverFactory.webdriver().getCurrentUrl();
        }

        public void MaximizePage() {
            WebDriverFactory.webdriver().manage().window().maximize();
        }

        public void Navigate(String url) {
            WebDriverFactory.webdriver().navigate().to(url);
        }

        public void Refresh() {
            WebDriverFactory.webdriver().navigate().refresh();
        }

        public void SwitchTo(String windowHandler) {
            WebDriverFactory.webdriver().switchTo().window(windowHandler);
        }

        public Object ExecuteJavaScript(String script) {
           return ((JavascriptExecutor) WebDriverFactory.webdriver()).executeScript(script);
        }

        public WebElement FindElement(By locator) {
            return WebDriverFactory.webdriver().findElement(locator);
        }

        public Iterable<WebElement> FindElements(By locator) {
            return WebDriverFactory.webdriver().findElements(locator);
        }

        public String GetValueFromLocalStorage(String key) {
            return ((JavascriptExecutor) WebDriverFactory.webdriver()).executeScript("return localStorage.getItem('%1$s')", key).toString();
        }

        public void SetValueToLocalStorage(String key, String value) {
            ((JavascriptExecutor) WebDriverFactory.webdriver()).executeScript("localStorage.setItem('%1$s','%2$s')", key, value);
        }

        public String GetWindowHandle() {
            return WebDriverFactory.webdriver().getWindowHandle();
        }

        public Iterable<String> GetWindowHandles() {
            return WebDriverFactory.webdriver().getWindowHandles();
        }

}
