package PageElements;

import Utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickableObject extends BaseWebElement {

    public ClickableObject(By locator)
    {
        super(locator);
    }
    protected ClickableObject(WebElement webelement)
    {
        super(webelement);
    }

    public void Click()
    {
        var executor = (JavascriptExecutor) WebDriverFactory.webdriver();
        executor.executeScript("arguments[0].click();", webelement);
    }

    public void DoubleClick()
    {
        var actions = new Actions(WebDriverFactory.webdriver());
        actions.doubleClick(webelement).perform();
    }
}


