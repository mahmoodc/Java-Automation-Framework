package Pages.Mobile.HomePage;

import PageElements.Button;
import Pages.DeskTopPages.CommonFragments.MobileHeaderFragments;
import Pages.Interfaces.IHomePage;
import Utils.WebElementWait;
import org.openqa.selenium.By;

public class MobileDeskTopImpl implements IHomePage {
    MobileHeaderFragments mobileHeaderFragments = new MobileHeaderFragments();

    @Override
    public void ClickBBCWeather() {
        mobileHeaderFragments.GetBrandModelButtonByName().Click();
        WebElementWait.UntilElementIsVisible(mobileHeaderFragments.BrandModelButton1, 60);
        mobileHeaderFragments.GetBrandModelButtonByName1().Click();
        mobileHeaderFragments.GetBrandModelButtonByName().Click();
        mobileHeaderFragments.GetBrandModelButtonByName2().Click();
        mobileHeaderFragments.GetBrandModelButtonByName3().Click();
    }
}
