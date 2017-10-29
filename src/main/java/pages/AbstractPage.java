package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class AbstractPage extends PageObject {

    public AppiumDriver<MobileElement> appiumDriver() {
        return (AppiumDriver<MobileElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    // public AndroidDriver<AndroidElement> androidDriver() {
    //     return (AndroidDriver<AndroidElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    // }
}