package Pages.DeskTopPages.DeskTop.HomePage;

import PageElements.Button;
import Pages.Interfaces.IHomePage;
import org.openqa.selenium.By;

public class HomePageDeskTopImpl implements IHomePage {

    @Override
    public void ClickBBCWeather()
    {
        Button test3 = new Button(By.cssSelector("#orb-nav-links > ul > li.orb-nav-weather > a"));
        test3.Click();
    }
}
