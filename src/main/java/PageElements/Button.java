package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Button extends ClickableObject {
    public Button(By locator) {
        super(locator);
    }

    protected Button(WebElement webelement) {
        super(webelement);
    }

    @Override
    public void Click() {
        webelement.click();
    }
}
