package StepDefs;

import PageElements.BaseWebElement;
import PageElements.Button;
import PageElements.ClickableObject;
import Pages.Interfaces.IHomePage;
import Utils.GoogleGuice;
import Utils.PageWaitUtils;
import Utils.UIConfigurationSettings;
import Utils.WebDriverFactory;
import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class BBC {

    private Injector injector = Guice.createInjector(new GoogleGuice());
    IHomePage ihomePage = injector.getInstance(IHomePage.class);
    @Given("^I am on bbc website$")
    public void iAmOnBbcWebsite() {
        WebDriverFactory.webdriver().get(UIConfigurationSettings.HomepageURL());
    }

    @When("^I click the weather link$")
    public void iClickTheWeatherLink() throws InterruptedException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
   /*     WebDriverFactory.webdriver().findElement(By.linkText("Weather")).click();

        var element2 = WebDriverFactory.webdriver().findElement(By.linkText("Weather"));
        WebElementWait.UntilElementIsClickable(element, 60);
        element.click();*/
        //BaseWebElement test = new BaseWebElement(By.partialLinkText("Weather"));
        //System.out.println(test.Text);

        //var element2 = WebDriverFactory.webdriver().findElement(By.linkText("Weather"));
        ihomePage.ClickBBCWeather();
 /*       PageWaitUtils t = new PageWaitUtils();
        t.WaitForJQuery();
    BaseWebElement test = new BaseWebElement(By.cssSelector("#orb-nav-links > ul > li.orb-nav-sport > a"));
        Button test3 = new Button(By.cssSelector("#orb-nav-links > ul > li.orb-nav-weather > a"));


        System.out.println(test.Text());
test3.Click();
        t.WaitForJQuery();
        ClickableObject test2 = new ClickableObject(By.cssSelector("#orb-nav-links > ul li.orb-nav-sport > a"));
        test2.Click();*/
        //test2.GetChildElement(By.cssSelector("li.orb-nav-sport > a")).click();
    //Andrew2 test = new Andrew2(element2);
        //WebElementWait.UntilElementIsDisplayed(element2, 60);
        //WebElementWait.UntilElementIsClickable2(test, 60);
        //System.out.println(test.Text);
        //Thread.sleep(2000);
        //var tester = test.IsEnabled();
        //var rest = test.GetChildElement(By.cssSelector("#orb-nav-links > ul > li.orb-nav-sport > a"));
        //rest.Text();
        //var tester = test.Text();
        //System.out.println(test);
        //Thread.sleep(2000);
        //var element =  WebDriverFactory.webdriver().findElement(By.cssSelector("#orb-nav-links > ul > li.orb-nav-sport > a"));

        //ClickableObject elect = new ClickableObject(element);
        //elect.Click();
        //test.click();
    }
}