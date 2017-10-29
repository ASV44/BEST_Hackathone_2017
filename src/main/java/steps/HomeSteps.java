package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomeSteps extends ScenarioSteps {

    HomePage homePage;

    @Step("Tap on menu button")
    public HomeSteps tapOnMenuButton() {
        homePage.tapOnMenuButton();
        return this;
    }

    @Step("Should see menu sidebar")
    public void shouldSeeMenuSideBar() {
        assertThat("Sidebar is not opened", homePage.isSidebarIsDisplayed(), is(true));
    }

    @Step("Login from Home Page")
    public HomeSteps logInFromHomePage() {
        homePage.logInFromHomePage();
        return this;
    }

    @Step("Navigate to home section")
    public HomeSteps navigateToHomeSection() {
        homePage.navigateToHomeSection();
        return this;
    }

    @Step("Navigate to anime")
    public HomeSteps navigateToAnime() {
        homePage.selectAnime();
        return this;
    }
}
