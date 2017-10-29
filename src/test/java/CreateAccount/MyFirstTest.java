package CreateAccount;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomeSteps;
import steps.LaunchScreenSteps;

@RunWith(SerenityRunner.class)
public class MyFirstTest {

    @Managed(driver = "appium")
    public WebDriver driver;

    @Steps
    public LaunchScreenSteps launchScreenSteps;

    @Steps
    public HomeSteps homeSteps;

    @Test
    //@Title("Your first successful test")
    public void tryToCreateAccount() {
//        launchScreenSteps.tapOnJustExploreButtonIfAppears();
//        homeSteps.tapOnMenuButton();
//        launchScreenSteps.LogInLaunchScreen();
        homeSteps.logInFromHomePage();
    }

    @Test
    public void navigateToHomeSection() {
        homeSteps.navigateToHomeSection();
    }

    @Test
    public void navigateToAnime() {
        homeSteps.navigateToAnime();
    }
}
