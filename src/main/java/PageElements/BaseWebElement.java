package PageElements;

import Utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BaseWebElement {
    protected WebElement webelement;

    public BaseWebElement(By locator) {
        if (WebDriverFactory.webdriver().findElements(locator).size() > 1)
            webelement = WebDriverFactory.webdriver().findElements(locator).iterator().next();
        else
            webelement = WebDriverFactory.webdriver().findElement(locator);
    }

    protected BaseWebElement(WebElement webelement) {
        this.webelement = webelement;
    }


    public Boolean IsDisplayed() {
        return webelement.isDisplayed();
    }

    public Boolean IsEnabled() {
        return webelement.isEnabled();
    }

    public Boolean IsDisabled() {
        return !webelement.isEnabled();
    }

    public String Text() {
        return webelement.getText();
    }

    public String GetAttribute(String attributeName) {
        return webelement.getAttribute(attributeName);
    }

    public void Focus() {
        var actions = new Actions(WebDriverFactory.webdriver());
        actions.moveToElement(webelement).click().build().perform();
    }

    public void Unfocus() {
        var actions = new Actions(WebDriverFactory.webdriver());
        actions.moveByOffset(0, 0).click().build().perform();
    }

    public WebElement GetChildElement(By locator) {
        return webelement.findElement(locator);
    }

    public List<WebElement> GetChildElements(By locator) {
        return webelement.findElements(locator);
    }
}


