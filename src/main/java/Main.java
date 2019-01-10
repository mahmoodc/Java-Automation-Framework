
import Hooks.WebDriverHooks;
import Utils.WebDriverFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class Main {

    public static void main(String[] args)  throws Exception {

        WebDriverHooks._extenttest.get().log(Status.INFO, "This step shows usage of log(status, details)");
        bbc();
        WebDriverHooks._extenttest.get().pass("Test passed");
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
        //WebDriver driver = WebDriverFactory.InitDriver();
        //driver.manage().window().maximize();
        //WebDriverFactory.webdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverFactory.webdriver().get("https://www.bbc.co.uk/");
        //WebDriverFactory.webDriver.get("https://www.bbc.co.uk/");
        //BaseWebElement.CreatePageObject()
        System.out.println(WebDriverFactory.webdriver().getCurrentUrl());
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


