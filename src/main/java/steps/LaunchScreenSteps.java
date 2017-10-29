package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LaunchPage;

public class LaunchScreenSteps extends ScenarioSteps {

    LaunchPage launchPage;

    @Step("Tap On Just Explore Button If Appears")
    public LaunchScreenSteps tapOnJustExploreButtonIfAppears() {
        launchPage.tapOnJustExploreButtonIfAppears();
        return this;
    }

    @Step("Login at Launch Screen")
    public LaunchScreenSteps LogInLaunchScreen() {
        launchPage.tapOnLogInButton();
        return this;
    }
}
