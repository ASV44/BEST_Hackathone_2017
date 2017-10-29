package pages;

import org.openqa.selenium.By;

public class LaunchPage extends AbstractPage {

    By loginButonId = By.id("login");
    By emailField = By.id("login_field");
    By passwordField = By.id("password_field");
    By continueButton = By.id("continue_button");
    By justExploreButton = By.id("just_explore");

    public void tapOnJustExploreButtonIfAppears() {
        if (find(justExploreButton).isVisible()) {
            appiumDriver().findElement(justExploreButton).click();
        }
    }

    public void tapOnLogInButton() {
        if(find(loginButonId).isVisible()) {
            appiumDriver().findElement(loginButonId).click();
//            appiumDriver().findElement(emailField).setValue("test@gmail.com");
//            appiumDriver().findElement(passwordField).setValue("testPassword");
        }
    }
}
