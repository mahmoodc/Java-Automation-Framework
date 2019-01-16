package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ImageObject extends BaseWebElement{
    public ImageObject(By locator) {
        super(locator);
    }

    protected ImageObject(WebElement webelement) {
        super(webelement);
    }
}

