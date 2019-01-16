package Hooks;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources", plugin = "json:target/cucumber-report-feature-composite.json")
public class TestRunner2 {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }



   /*@Test(groups = "cucumber scenarios", description = "Runs Cucumber
            Scenarios", dataProvider = "scenarios")
            public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper
            cucumberFeature) throws Throwable{
        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
    }
    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }*/

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}