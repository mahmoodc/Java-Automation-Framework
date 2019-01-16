package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends BaseWebElement{
    public Checkbox(By locator)
    {
        super (locator);
    }

    protected Checkbox(WebElement webelement)
    {
        super(webelement);
    }

    public Boolean IsChecked()

    {
        return webelement.isSelected();
    }
    public void Check()
    {
        if (!IsChecked()) webelement.click();
    }

    public void Uncheck()
    {
        if (IsChecked()) webelement.click();
    }
}

