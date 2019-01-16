package Utils;


import PageElements.BaseWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementWait {

    public static WebDriverWait Wait(int seconds)
    {
        return new WebDriverWait(WebDriverFactory.webdriver(), seconds);
    }

    public static void UntilElementIsClickable(WebElement element, int timeout)
    {
        var wait = new WebDriverWait(WebDriverFactory.webdriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void UntilElementExists(By locator, int timeout)
    {
        var wait = new WebDriverWait(WebDriverFactory.webdriver(), timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void UntilElementIsInvisible(By locator, int timeout)
    {
        var wait = new WebDriverWait(WebDriverFactory.webdriver(), timeout);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void UntilElementIsVisible(By locator, int timeout)
    {
        var wait = new WebDriverWait(WebDriverFactory.webdriver(), timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
