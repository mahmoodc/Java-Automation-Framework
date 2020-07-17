package StepDefs;

import Pages.Interfaces.IHomePage;
import Utils.GoogleGuice;
import Utils.UIConfigurationSettings;
import Utils.WebDriverFactory;
import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.w3c.dom.html.HTMLSelectElement;

public class BBC {

    private Injector injector = Guice.createInjector(new GoogleGuice());
    IHomePage ihomePage = injector.getInstance(IHomePage.class);

    @Given("^I am on bbc website$")
    public void iAmOnBbcWebsite() {

        WebDriverFactory.webdriver().get(UIConfigurationSettings.HomepageURL());


    }

    @When("^I click the weather link$")
    public void iClickTheWeatherLink() throws InterruptedException {
        ihomePage.ClickBBCWeather();

    }
}