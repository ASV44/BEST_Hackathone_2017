package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage {

    AndroidDriver driver;

    public LogInPage(AndroidDriver driver) {
        this.driver = driver;
    }

    @Test
    public void logInTest() {
        String app_package_name = "com.crunchyroll.crunchyroid:id/";
        By logInButton = By.id(app_package_name + "button_left");

        driver.findElement(logInButton).click();
    }
}

