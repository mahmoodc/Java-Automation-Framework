package Pages.DeskTopPages.CommonFragments;

import PageElements.Button;
import PageElements.ClickableObject;
import Pages.AbstractFragments;
import org.openqa.selenium.By;

public class MobileHeaderFragments extends AbstractFragments {
    private ClickableObject clickableObject;
    private Button button;

    public By BrandModelButton1 = By.cssSelector("#orb-nav-more > a");

    public By BrandModelButton2 = By.cssSelector("#orb-panel-more > div > ul > li.orb-nav-weather > a");

    public By BrandModelButton3 = By.cssSelector("#orb-panel-more > div > ul > li.orb-nav-sport > a");

    public By BrandModelButton4 = By.cssSelector("#orb-panel-more > div > ul > li.orb-nav-news > a");

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

    public ClickableObject GetBrandModelButtonByName3() {
        clickableObject = new ClickableObject(BrandModelButton4);
        return clickableObject;
    }
}



