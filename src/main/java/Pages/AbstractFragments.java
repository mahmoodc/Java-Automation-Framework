package Pages;

import Utils.WebDriverFactory;
import Utils.WebElementWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class AbstractFragments extends AbstractPage{

        private final int _webElementTimeout = 60;
        //private FragmentFactory _fragmentFactory = new FragmentFactory();

        private WebElement _rootElement;

        public AbstractFragments()
        {
            PageFactory.initElements(WebDriverFactory.webdriver(), this);
            InitializeFragment();
        }

        protected void InitializeFragment()
        {
            // Should be overridden if necessary in child
        }


        protected WebElement GetRootElement() {
            return _rootElement;
    }

        public void SetRootElement(WebElement rootElement) {
            _rootElement = rootElement;
        }

        public int GetGlobalWaitingTimeout() {
           return _webElementTimeout;
        }

        public WebElement GetChildElement(By locator)
        {
            var pageObject = _rootElement.findElement(locator);
            return pageObject;
        }

        public List<WebElement> GetChildElements(By locator)
        {
            var pageObjects = _rootElement.findElements(locator);
            return pageObjects.stream().collect(Collectors.toList());
        }


        public Boolean IsDisplayed()
        {
            try
            {
                return GetRootElement().isDisplayed();
            }
            catch (NoSuchElementException ex)
            {
                return false;
            }
        }

        protected Boolean IsElementDisplayed(By selector)
        {
            try
            {
                return WebDriverFactory.webdriver().findElement(selector).isDisplayed();
            }
            catch (NoSuchElementException ex)
            {
                return false;
            }
        }

        protected Boolean IsElementPresent(By selector)
        {
            try
            {
                WebDriverFactory.webdriver().findElement(selector);
                return true;
            }
            catch (NoSuchElementException ex)
            {
                return false;
            }
        }

        public void WaitForClickable() {
            WebElementWait.UntilElementIsClickable(GetRootElement(), GetGlobalWaitingTimeout());
        }

        public void WaitForVisible() {
            WebElementWait.UntilElementIsDisplayed(GetRootElement(), GetGlobalWaitingTimeout());
        }

        public void Click() {
            GetRootElement().click();
        }

        public void ScrollToTop() {
            ((JavascriptExecutor)WebDriverFactory.webdriver()).executeScript("window.scrollBy(0, -3000)");
    }
}
