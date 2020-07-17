package Hooks;


import Utils.GoogleGuice;
import Utils.WebDriverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.BeforeStep;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

@CucumberOptions(features = {"src/main/Features"} , plugin = {"json:target/cucumber.json","html:target/site/cucumber--pretty"}, glue = "StepDefs")
public class TestRunner extends AbstractTestNGCucumberTests {

    //public static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent2.html");
    private static ExtentReports extent;
    public static ThreadLocal<ExtentTest> _extenttest = new ThreadLocal<>();
    GoogleGuice guice = new GoogleGuice();

/*    @BeforeSuite
            public void setUp() {

    }*/

    @BeforeTest
    @Parameters({"driver"})
    public void InitializeWebDriver(String driver)
    {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        _extenttest.set(extent.createTest("MyFirstTest3", "Sample description"));
       //guice.TestScreen(screen);
        WebDriverFactory.InitDriver(driver);

    }

    @BeforeMethod
    @Parameters({"screen"})
    public void InitiliseScreen(String screen)
    {
        guice.TestScreen(screen);
    }


   /* @Test
    public void test5(){
        ExtentTest test = extent.createTest("MyFirstTest2", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.pass("Test passed");
        //WebDriverFactory.webdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverFactory.webdriver().get("https://www.bbc.co.uk/");
        //BaseWebElement.CreatePageObject()
        System.out.println(WebDriverFactory.webdriver().getCurrentUrl());
        WebDriverFactory.webdriver().findElement(By.linkText("Weather")).click();
    }*/

    @AfterTest
    public void TearDown()
    {
        extent.flush();
        WebDriverFactory.CloseBrowser();

    }
}
