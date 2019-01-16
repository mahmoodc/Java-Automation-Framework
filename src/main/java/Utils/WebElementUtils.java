package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebElementUtils {
    public static String GetElementValue(WebElement element) {
        return element.getAttribute("value");
    }

    public static String GetNodeText(WebElement element) {
        String topElementTextValue = (String) ((JavascriptExecutor) WebDriverFactory.webdriver()).executeScript("return arguments'%1$s'.childNodes'%1$s'.nodeValue", element);
        return topElementTextValue.trim();
    }
}

