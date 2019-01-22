
import PageElements.BaseWebElement;
import Utils.PageWaitUtils;
import Utils.UIConfigurationSettings;
import Utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class Main {

    public static void main(String[] args)  throws Exception {

  /*      WebDriverHooks._extenttest.get().log(Status.INFO, "This step shows usage of log(status, details)");
        bbc();
        WebDriverHooks._extenttest.get().pass("Test passed");*/

        bbc();




    }


    public static int Multiply(int x  , int y)
    {
        return x * y;
    }

    public static WebElement Element(List<WebElement> elements, String text)
    {
        WebElement mainElement = elements.listIterator().next();
        for (WebElement element : elements) {
            if (element.getText().equals(text))
                mainElement = element;
        }
        return mainElement;
    }

    public static void bbc() throws Exception
    {
        //Browser x = new Browser();
        //WebDriver driver = x.execute(browser);
        //WebDriver driver = WebDriverFactory.InitDriver("chrome");
        WebDriverFactory.InitDriver("chrome");
        WebDriverFactory.webdriver().get(UIConfigurationSettings.HomepageURL());
        Thread.sleep(2000);
        //WebDriverFactory.webdriver().findElements(By.cssSelector("#orb-nav-links ul li")).get(1).click();
        //String x = PageWaitUtils.GetDocumentReadyState();
        //System.out.println(x);

        //WebDriverFactory.webdriver().findElement(By.linkText("Weather")).click();
        //Thread.sleep(2000);
        PageWaitUtils t = new PageWaitUtils();
        //Boolean x = t.PageStatus.apply(WebDriverFactory.webdriver());
        //t.ForRedirected("https://www.bbc.co.uk/weather/", 60);
        //var r = t.Until(x -> x.getCurrentUrl().equals("https://www.bbc.co.uk/"));
        //var s = t.Until(x -> x.getPageSource().contains("bbc"));
        //t.ForPageStatusChange("complete", 60);
        Thread.sleep(3000);
        t.WaitForJQuery();
        //boolean f = t.PageUrlFormat().apply(WebDriverFactory.webdriver());
        //System.out.println(f);
        //boolean b = t.PageStatus.apply(WebDriverFactory.webdriver());
        t.ForPageStatusChange("Complete",60);
        System.out.println("Middle");
        t.ForRedirected("http://www.bbc.co.uk/", 30);
        System.out.println("finished");
        //boolean e = t.PageStatus("Complete").apply();
        //System.out.println(e);
        //var e = t.Until(x-> x.findElement(By.linkText("Sport")));
        //var y = t.Until(x -> WebDriverFactory.webdriver().getPageSource());
        //t.ForPageStatusChange("Complete",60);
       // var w =PageWaitUtils.GetDocumentReadyState();
        //var c = PageWaitUtils.PageStatus("complete");
        //System.out.println(t.Until(x -> x.getCurrentUrl().equals("Http://www.bbc.co.uk/")));
       // String z = PageWaitUtils.PageStatus("complete").toString();
        //System.out.println(b);
        //System.out.println(s);
       // System.out.println(e);
       // System.out.println(c);
       // System.out.println(w);
        //element.listIterator().next().click();




        //Andrew2 hate = new Andrew2(element);
        //BaseWebElement hate2 = new BaseWebElement(element);
        //hate2.Click();
        //WebDriver driver = WebDriverFactory.InitDriver("chrome");
        //driver.manage().window().maximize();
        //BaseWebElement tree = new BaseWebElement(By.linkText("Sport"));
        //WebDriverFactory.webdriver().
        //System.out.println(tree.Text);
        //WebDriverFactory.webdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverFactory.webdriver().get(UIConfigurationSettings.HomepageURL());
        //WebDriverFactory.webDriver.get("https://www.bbc.co.uk/");
        //BaseWebElement.CreatePageObject()
        //System.out.println(WebDriverFactory.webdriver().getCurrentUrl());
        //System.out.println(WebDriverFactory.webDriver.getCurrentUrl());
        //WebDriverFactory.webdriver().findElement(By.linkText("Weather")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[4]/a")).click();
        //Thread.sleep(3000);
//        for(int i = 1; i < 5; i++)
//        {
//            driver.findElements(By.cssSelector(".orb-nav-section ul li a")).get(i).click();
//            Thread.sleep(3000);
//        }
//        //driver.findElements(By.cssSelector(".orb-nav-section ul li")).get(2).click();
//        driver.quit();

    }

}


