package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class InputObject extends ClickableObject {
    public InputObject(By locator) {
        super(locator);
    }

    protected InputObject(WebElement webelement) {
        super(webelement);
    }

    public void SendKeys(String text) {
        webelement.clear();
        webelement.sendKeys(text);
    }

    public void SendKeysAndLoseFocus(String text) {
        SendKeys(text);
        webelement.sendKeys(Keys.TAB);
    }

    public String Value() {
        return GetAttribute("value");
    }
}
