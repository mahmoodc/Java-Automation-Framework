package Pages;

import Utils.Logger;
import Utils.PageWaitUtils;
import Utils.WebDriverFactory;
import Utils.WebDriverUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AbstractPage {

        private final long _redirectTimeoutInSeconds = 120;
        private final String _statusComplete = "complete";

        private PageWaitUtils _pageWaitUtils = new PageWaitUtils();
        private WebDriverUtils _webDriverUtils = new WebDriverUtils();
        private String _baseUrl;
        private String _relativeUrl;
        private String _urlFormat;
        private static String _winHandleBefore;
        private static List<String> _tabs;

        public AbstractPage()
        {

            PageFactory.initElements(WebDriverFactory.webdriver(), this);
        }

        protected String GetUrl() {
           return  GetRelativeUrl();
        }
        protected void SetUrl(String relativeURL) {
            _relativeUrl = relativeURL;
        }
        private String GetRelativeUrl()
        {
            if (_relativeUrl != null)
            {
                return _relativeUrl;
            }
            try {
                throw new Exception("Please set page URL using appropriate method. Page URL must not be null.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return("Page URL must not be null.");
        }

        private String GetUrlFormat()
        {
            if (_urlFormat == null)
            {
                return null;
            }
            return _urlFormat;
        }

        private Boolean HasUrlFormat() {
            String x = GetUrlFormat();
            return (!x.isBlank()) || (!x.isEmpty());
            //!(String.IsNullOrEmpty(GetUrlFormat()));
        }

        public void AcceptAlert()
        {
            if (_pageWaitUtils.IsAlertPresent())
                WebDriverFactory.webdriver().switchTo().alert().accept();
        }

        public void Check()
        {
            if (HasUrlFormat())
            {
                if (!IsCurrentByFormat())
                {
                    try {
                        throw new Exception(
                                String.format("Current page is wrong by URL format.\nExpected URL format: {0}\nCurrent URL: {1}",
                                        GetUrlFormat(), WebDriverFactory.webdriver().getCurrentUrl()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Logger.log().info(new Object[] { String.format("The page {0} suits format {1}.", GetCurrentUrl(), GetUrlFormat()) });
            }
            else if (!WebDriverFactory.webdriver().getCurrentUrl().contains(GetRelativeUrl()))
            {
                try {
                    throw new Exception("Current page is wrong by URL format.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void ClearCookies()
        {
            List<Cookie> allCookies = new ArrayList<>(WebDriverFactory.webdriver().manage().getCookies());
            for (Cookie cookie: allCookies)
            {
                WebDriverFactory.webdriver().manage().deleteCookieNamed(cookie.getName());
            }
        }

        public void ClosePage() {
            WebDriverFactory.webdriver().close();
        }
        public void DeclineAlert()
        {
            if (_pageWaitUtils.IsAlertPresent())
                WebDriverFactory.webdriver().switchTo().alert().dismiss();
        }

        public void Delay(int milliseconds)
        {
            try
            {
                Thread.sleep(milliseconds);
            }
            catch (Exception ex)
            {
                Logger.log().error(ex.toString());
                try {
                    throw new Exception(ex.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public String GetCurrentUrl() {
            return WebDriverFactory.webdriver().getCurrentUrl();
        }

        public Boolean IsCurrentByFormat() {
           return  Pattern.matches(WebDriverFactory.webdriver().getCurrentUrl()
                    , GetUrlFormat());
        }
        public void RefreshPage() {
            WebDriverFactory.webdriver().navigate().refresh();
        }

        public void SetUrlFormat(String urlFormat) {
            _urlFormat = urlFormat;
        }

        public void SwitchBrowserWindow()
        {
            _winHandleBefore = WebDriverFactory.webdriver().getWindowHandle();
            for (String winHandle: WebDriverFactory.webdriver().getWindowHandles())
            {
                _webDriverUtils.SwitchTo(winHandle);
            }
        }

        public void SwitchBrowserWindowBack()
        {
            if (_winHandleBefore != null)
            {
                _webDriverUtils.SwitchTo(_winHandleBefore);
                if (!WebDriverFactory.webdriver().getWindowHandle().toLowerCase().equals(_winHandleBefore.toLowerCase()))
                {
                    WebDriverFactory.webdriver().close();
                }
            }
            else throw new NullPointerException("Windows handle before is null!");
        }

        public void SwitchToDefault() {
            WebDriverFactory.webdriver().switchTo().defaultContent();
        }

        public void SwitchToIFrame() {
            WebDriverFactory.webdriver().switchTo().frame(0);
        }

        public void SwitchToMainTab()
        {
            WebDriverFactory.webdriver().switchTo().window(_tabs.get(1)).close();
            WebDriverFactory.webdriver().switchTo().window(_tabs.get(0));
        }

        public void SwitchToSecondTab()
        {
            _tabs = new ArrayList<String>(WebDriverFactory.webdriver().getWindowHandles());
            WebDriverFactory.webdriver().switchTo().window(_tabs.get(1));
        }

        public void OpenNewTab()
        {
            ((JavascriptExecutor)WebDriverFactory.webdriver()).executeScript("window.open();");
        }

        public void Visit() {
            WebDriverFactory.webdriver().navigate().to(GetUrl());
        }

        public void WaitForComplete() {
            _pageWaitUtils.ForPageStatusChange(_statusComplete, _redirectTimeoutInSeconds);
        }

        public void WaitForCompleteAndAjax()
        {
            _pageWaitUtils.ForPageStatusChange(_statusComplete, _redirectTimeoutInSeconds);
            _pageWaitUtils.WaitForJQuery();
        }

        public void WaitForRedirectedAndComplete()
        {
            _pageWaitUtils.ForRedirected(GetUrlFormat(), _redirectTimeoutInSeconds);
            _pageWaitUtils.ForPageStatusChange(_statusComplete, _redirectTimeoutInSeconds);
        }

        public void WaitForRedirectedAndCompleteLazy()
        {
            try
            {
                WaitForRedirectedAndComplete();
            }
            catch (TimeoutException ex)
            {
                Logger.log().error(String.format("\nRedirection to page {0} failed!", GetUrlFormat()));
            }
        }
    }

