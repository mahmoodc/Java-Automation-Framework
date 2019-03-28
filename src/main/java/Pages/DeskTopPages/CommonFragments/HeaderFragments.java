package Pages.DeskTopPages.CommonFragments;

import PageElements.Button;
import PageElements.ClickableObject;
import Pages.AbstractFragments;
import org.openqa.selenium.By;


public class HeaderFragments extends AbstractFragments {

    private ClickableObject clickableObject;
    private Button button;

    private static By BrandModelButton1 = By.cssSelector("#orb-nav-links > ul > li.orb-nav-weather > a");

    private static By BrandModelButton2 = By.cssSelector("#orb-nav-links > ul > li.orb-nav-sport > a");

    private static By BrandModelButton3 = By.cssSelector("#orb-nav-links > ul > li.orb-nav-news > a");

    public ClickableObject GetBrandModelButtonByName() {
        clickableObject = new ClickableObject(BrandModelButton1);
        return clickableObject;
    }

    public Button GetBrandModelButtonByName1() {
        button = new Button(BrandModelButton2);
        return button;
    }

    public ClickableObject GetBrandModelButtonByName2() {
        clickableObject = new ClickableObject(BrandModelButton3);
        return clickableObject;
    }
}


