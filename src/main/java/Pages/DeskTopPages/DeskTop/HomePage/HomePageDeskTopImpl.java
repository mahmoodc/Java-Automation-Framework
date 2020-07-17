package Pages.DeskTopPages.DeskTop.HomePage;

import PageElements.Button;
import Pages.DeskTopPages.CommonFragments.HeaderFragments;
import Pages.Interfaces.IHomePage;
import Utils.PageWaitUtils;
import Utils.WebDriverFactory;
import Utils.WebElementWait;
import org.openqa.selenium.By;

public class HomePageDeskTopImpl implements IHomePage {

    HeaderFragments headerFragments = new HeaderFragments();

    @Override
    public void ClickBBCWeather()
    {
        headerFragments.GetBrandModelButtonByName().Click();
        //headerFragments.GetBrandModelButtonByName1().Click();
        headerFragments.GetBrandModelButtonByName2().Click();
    }
}
