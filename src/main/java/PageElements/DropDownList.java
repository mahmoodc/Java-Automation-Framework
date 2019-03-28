package PageElements;

import Utils.WebElementWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownList extends BaseWebElement {
    public DropDownList(By locator) {
        super(locator);
    }

    protected DropDownList(WebElement webelement) {
        super(webelement);
    }

    protected void Expand() {
        webelement.click();
    }

    public List<WebElement> Options(String tag) {
        return GetChildElements(By.cssSelector(tag));
                //GetChildElements<Button> (By.CssSelector(tag));
    }
    public WebElement Option(String tag, String attribute, String value)
    {
        return GetChildElement(By.cssSelector(String.format("'%1$s'['%2$s'=\"'%3$s'\"]", tag, attribute, value)));
    }

    public WebElement Option(String tag, String text)
    {
        return GetChildElement(By.xpath(String.format("//'%1$s'[text()=\"'%2$s'\"]", tag, text)));
    }

    public void ChooseOption(String tag, String attribute, String value)
    {
        Expand();
        WebElementWait.UntilElementIsEnabled(GetChildElement(By.cssSelector(String.format("'%1$s'['%2$s'=\"'%3$s'\"]", tag, attribute, value))),60);
        GetChildElement(By.cssSelector(String.format("'%1$s'['%2$s'=\"'%3$s'\"]", tag, attribute, value))).click();
    }

    public void ChooseOption(String tag, String text)
    {
        Expand();
        WebElementWait.UntilElementIsEnabled(GetChildElement(By.xpath(String.format("//'%1$s'[text()=\"'%2$s'\"]", tag, text))), 60);
        GetChildElement(By.xpath(String.format("//'%1$s'[text()=\"'%2$s'\"]", tag, text))).click();
    }

    public void ChooseOptionWithJS(String tag, String attribute, String value)
    {
        Expand();
        WebElementWait.UntilElementIsEnabled(GetChildElement(By.cssSelector(String.format("'%1$s'['%2$s'=\"'%3$s'\"]", tag, attribute, value))), 60);
        GetChildElement(By.cssSelector(String.format("'%1$s'['%2$s'=\"'%3$s'\"]", tag, attribute, value))).click();
    }

    public void ChooseOptionWithJS(String tag, String text)
    {
        Expand();
        WebElementWait.UntilElementIsEnabled(GetChildElement(By.xpath(String.format("//'%1$s'[text()=\"'%2$s'\"]", tag, text))), 60);
        GetChildElement(By.xpath(String.format("//{0}[text()=\"{1}\"]", tag, text))).click();
    }
}

