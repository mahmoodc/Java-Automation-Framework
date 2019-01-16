package StepDefs;

import PageElements.BaseWebElement;
import PageElements.ClickableObject;
import Utils.UIConfigurationSettings;
import Utils.WebDriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class BBC {
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


    //BaseWebElement test = new BaseWebElement(By.cssSelector("#orb-nav-links > ul > li.orb-nav-sport > a"));
        ClickableObject test2 = new ClickableObject(By.cssSelector("#orb-nav-links > ul"));
        test2.GetChildElement(By.cssSelector("li.orb-nav-sport > a")).click();
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