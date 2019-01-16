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
}
