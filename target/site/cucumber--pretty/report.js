$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/Features/Login.feature");
formatter.feature({
  "name": "testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "testing a link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on bbc website",
  "keyword": "Given "
});
formatter.match({
  "location": "BBC.iAmOnBbcWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the weather link",
  "keyword": "When "
});
formatter.match({
  "location": "BBC.iClickTheWeatherLink()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-C8D3UUN\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Andre\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60514}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 343a8240e20c6e327aa1a58684447426\n*** Element info: {Using\u003dcss selector, value\u003d#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageElements.BaseWebElement.\u003cinit\u003e(BaseWebElement.java:17)\r\n\tat PageElements.ClickableObject.\u003cinit\u003e(ClickableObject.java:13)\r\n\tat Pages.DeskTopPages.CommonFragments.HeaderFragments.GetBrandModelButtonByName(HeaderFragments.java:21)\r\n\tat Pages.DeskTopPages.DeskTop.HomePage.HomePageDeskTopImpl.ClickBBCWeather(HomePageDeskTopImpl.java:18)\r\n\tat StepDefs.BBC.iClickTheWeatherLink(BBC.java:28)\r\n\tat ✽.I click the weather link(src/main/Features/Login.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "testing a link two",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on bbc website",
  "keyword": "Given "
});
formatter.match({
  "location": "BBC.iAmOnBbcWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the weather link",
  "keyword": "When "
});
formatter.match({
  "location": "BBC.iClickTheWeatherLink()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-C8D3UUN\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Andre\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60514}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 343a8240e20c6e327aa1a58684447426\n*** Element info: {Using\u003dcss selector, value\u003d#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageElements.BaseWebElement.\u003cinit\u003e(BaseWebElement.java:17)\r\n\tat PageElements.ClickableObject.\u003cinit\u003e(ClickableObject.java:13)\r\n\tat Pages.DeskTopPages.CommonFragments.HeaderFragments.GetBrandModelButtonByName(HeaderFragments.java:21)\r\n\tat Pages.DeskTopPages.DeskTop.HomePage.HomePageDeskTopImpl.ClickBBCWeather(HomePageDeskTopImpl.java:18)\r\n\tat StepDefs.BBC.iClickTheWeatherLink(BBC.java:28)\r\n\tat ✽.I click the weather link(src/main/Features/Login.feature:9)\r\n",
  "status": "failed"
});
formatter.uri("src/main/Features/Logout.feature");
formatter.feature({
  "name": "Logout",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "testing a link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on bbc website",
  "keyword": "Given "
});
formatter.match({
  "location": "BBC.iAmOnBbcWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the weather link",
  "keyword": "When "
});
formatter.match({
  "location": "BBC.iClickTheWeatherLink()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-C8D3UUN\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Andre\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60514}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 343a8240e20c6e327aa1a58684447426\n*** Element info: {Using\u003dcss selector, value\u003d#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageElements.BaseWebElement.\u003cinit\u003e(BaseWebElement.java:17)\r\n\tat PageElements.ClickableObject.\u003cinit\u003e(ClickableObject.java:13)\r\n\tat Pages.DeskTopPages.CommonFragments.HeaderFragments.GetBrandModelButtonByName(HeaderFragments.java:21)\r\n\tat Pages.DeskTopPages.DeskTop.HomePage.HomePageDeskTopImpl.ClickBBCWeather(HomePageDeskTopImpl.java:18)\r\n\tat StepDefs.BBC.iClickTheWeatherLink(BBC.java:28)\r\n\tat ✽.I click the weather link(src/main/Features/Logout.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "testing a link two",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on bbc website",
  "keyword": "Given "
});
formatter.match({
  "location": "BBC.iAmOnBbcWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the weather link",
  "keyword": "When "
});
formatter.match({
  "location": "BBC.iClickTheWeatherLink()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-C8D3UUN\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Andre\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60514}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 343a8240e20c6e327aa1a58684447426\n*** Element info: {Using\u003dcss selector, value\u003d#orb-nav-links \u003e ul \u003e li.orb-nav-weather \u003e a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageElements.BaseWebElement.\u003cinit\u003e(BaseWebElement.java:17)\r\n\tat PageElements.ClickableObject.\u003cinit\u003e(ClickableObject.java:13)\r\n\tat Pages.DeskTopPages.CommonFragments.HeaderFragments.GetBrandModelButtonByName(HeaderFragments.java:21)\r\n\tat Pages.DeskTopPages.DeskTop.HomePage.HomePageDeskTopImpl.ClickBBCWeather(HomePageDeskTopImpl.java:18)\r\n\tat StepDefs.BBC.iClickTheWeatherLink(BBC.java:28)\r\n\tat ✽.I click the weather link(src/main/Features/Logout.feature:9)\r\n",
  "status": "failed"
});
});