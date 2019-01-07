
import Utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class Main {

    public static void main(String[] args)  throws InterruptedException {

        bbc();
        //bbc();
        //bbc();
        //bbc();
        //WebDriverFactory.CloseBrowser();
        //System.out.println(UIConfigurationSettings.getVersion());
        //String x = System.getProperty("user.dir");
        //C:\Users\aonwuyal\Documents\Java Framework\src\main\Drivers
        //System.out.println(x + "\\src\\main\\Drivers");

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

    public static void bbc() throws InterruptedException
    {
        //Browser x = new Browser();
        //WebDriver driver = x.execute(browser);
        WebDriver driver = WebDriverFactory.InitDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bbc.co.uk/");
        //BaseWebElement.CreatePageObject()
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.linkText("Weather")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[4]/a")).click();
        Thread.sleep(3000);
        for(int i = 1; i < 5; i++)
        {
            driver.findElements(By.cssSelector(".orb-nav-section ul li a")).get(i).click();
            Thread.sleep(3000);
        }
        //driver.findElements(By.cssSelector(".orb-nav-section ul li")).get(2).click();
        driver.quit();

    }

}


