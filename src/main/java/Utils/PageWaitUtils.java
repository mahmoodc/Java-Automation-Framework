package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Clock;
import java.util.function.Function;
import java.util.regex.Pattern;

public class PageWaitUtils {
    private final long _defaultSleepInMilliseconds = 100;
    private final long _defaultWaitInSeconds = 120;
    private final String _statusComplete = "complete";
    private final String _defaultMessage = "ExpectedCondition didn't happen during timeout!";
    private Pattern p = Pattern.compile("^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");


    public <T> T Until(Function<WebDriver, T> condition) {
        return GetFluentWait(_defaultWaitInSeconds).until(condition);
    }

    public void ForPageStatusChange(String status, long timeoutInSeconds) {
        var pageStatusChangeCondition = PageStatus;
        Logger.log().info("Waiting for page became: " + status);
        GetFluentWait(timeoutInSeconds).until(pageStatusChangeCondition);
        System.out.println("Test passed");
    }

    public void ForRedirected(String expectedUrlFormat, long timeoutInSeconds) {
        Function<WebDriver, Boolean> pageURLFormatCondition = PageUrlFormat;
        Logger.log().info("Waiting for page is redirected to: " + expectedUrlFormat);
        GetFluentWait(timeoutInSeconds).until(pageURLFormatCondition);
    }

    private String GetDocumentReadyState() {
        return (String) ((JavascriptExecutor) WebDriverFactory.webdriver()).executeScript("return document.readyState");
    }

    private WebDriverWait GetFluentWait(long seconds) {
        return new WebDriverWait(WebDriverFactory.webdriver(), Clock.systemDefaultZone(), Sleeper.SYSTEM_SLEEPER, seconds, _defaultSleepInMilliseconds);
    }


    private Function<WebDriver, Boolean> PageUrlFormat = driver -> p.matcher(driver.getCurrentUrl()).matches();


    private Function<WebDriver, Boolean> PageStatus = driver -> GetDocumentReadyState().equals(_statusComplete);

    public Boolean IsAlertPresent() {
        try {
            WebDriverWait wait = GetFluentWait(_defaultWaitInSeconds);
            if (wait.until(ExpectedConditions.alertIsPresent()) != null)
                return true;
        } catch (Exception ex) {
            Logger.log().error(ex.getMessage());
        }
        return false;
    }

    public void WaitForJQuery() {
        GetFluentWait(_defaultWaitInSeconds).until(driver ->
                !((Boolean) ((JavascriptExecutor) WebDriverFactory.webdriver()).executeScript("return window.jQuery != undefined && jQuery.active == 0")));
    }
}

