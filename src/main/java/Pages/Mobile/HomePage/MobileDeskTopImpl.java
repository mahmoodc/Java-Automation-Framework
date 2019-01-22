package Pages.Mobile.HomePage;

import PageElements.Button;
import Pages.Interfaces.IHomePage;
import org.openqa.selenium.By;

public class MobileDeskTopImpl implements IHomePage {
    @Override
    public void ClickBBCWeather() {
        Button test3 = new Button(By.cssSelector("#orb-nav-links > ul > li.orb-nav-sport > a"));
        test3.Click();
    }
}
