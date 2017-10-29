package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.List;

public class HomePage extends AbstractPage {

    By toolbar = By.id("toolbar");
    By menuButton = By.className("android.widget.ImageButton");
    By settingsButton = By.id("settings_text");
    By logInButton = By.id("login_account_text");

    By emailField = By.id("login_field");
    By passwordField = By.id("password_field");

    By continueButton = By.id("continue_button");

    By sectionMenu = By.id("tab_indicator");

    By horizontalButtons = By.className("android.widget.TextView");

    By justExploreButton = By.id("just_explore");

    By parent = By.id("recycler");


    public void tapOnMenuButton() {
        appiumDriver().findElement(toolbar).findElement(menuButton).click();
    }

    public boolean isSidebarIsDisplayed() {
        return appiumDriver().findElement(settingsButton).isDisplayed();
    }

    public void logInFromHomePage() {
        tapOnJustExploreButtonIfAppears();
        appiumDriver().findElement(toolbar).findElement(menuButton).click();
        appiumDriver().findElement(logInButton).click();
        appiumDriver().findElement(emailField).setValue("test@gmail.com");
        appiumDriver().findElement(passwordField).setValue("testPassword");

        appiumDriver().findElement(continueButton).click();
    }

    public void navigateToHomeSection() {
        tapOnJustExploreButtonIfAppears();
        List<MobileElement> menuElements = appiumDriver().findElement(sectionMenu).findElements(horizontalButtons);
        menuElements.get(0).click();
    }

    public void selectAnime() {
        tapOnJustExploreButtonIfAppears();

        By anime = By.id("image");
        List<MobileElement> animeElements = appiumDriver().findElement(parent).findElements(anime);
        animeElements.get(0).click();
        for(int i = 0; i < 10; i++) {
            swipeDown();
        }

        By movie = By.id("media_image");
        List<MobileElement> movieElements = appiumDriver().findElements(movie);
        movieElements.get(0).click();
    }

    public void tapOnJustExploreButtonIfAppears() {
        if (find(justExploreButton).isVisible()) {
            appiumDriver().findElement(justExploreButton).click();
        }
    }

    public void swipeDown() {
        Dimension size;
        size = appiumDriver().manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.50);
        int startx = size.width / 2;
        TouchAction actions = new TouchAction(appiumDriver());
        actions.press(startx, starty).waitAction().moveTo(startx, endy).release().perform();
    }
}
