package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    @When("The client clicks on the my account botton")
    public void theClientClicksOnTheMyAccountBotton() {
        LoginService.hacerClickMyAccount();
    }

    @And("^The client enters the case changed username(.*)$")
    public void theClientEntersTheCaseChangedUsername(String username) {
        LoginService.enterusername(username);
    }

    @And("^The client enters the case changed password(.*)$")
    public void theClientEntersTheCaseChangedPassword(String password) {
        LoginService.enterpassword(password);
    }

    @And("The client clicks on the login button")
    public void theClientClicksOnTheLoginButton() {
        LoginService.clicklogin();
    }


    @And("^The client enters the valid username(.*)$")
    public void theClientEntersTheValidUsernameUsername(String username) {
        LoginService.validusername(username);
    }

    @And("^The client enters the valid password(.*)$")
    public void theClientEntersTheValidPasswordPassword(String password) {
        LoginService.validpassword(password);
    }

    @Then("A login error is displayed")
    public void aLoginErrorIsDisplayed() {
        LoginService.loginerror();
    }

    @And("The client clicks on the Sign Out Button")
    public void theClientClicksOnTheSignOutButton() {
        LoginService.SignOutButton();
    }

    @And("The client goes back to My Account")
    public void theClientGoesBackToMyAccount() {
        LoginService.Back();
    }

    @Then("A general webpage must be visible without the user being signed in")
    public void aGeneralWebpageMustBeVisibleWithoutTheUserBeingSignedIn() {
        LoginService.GeneralWeb();
    }
}
