package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.MyaccountService;

public class MyaccountSteps extends PageSteps {

    @And("The client clicks on the Account details")
    public void theClientClicksOnTheAccountDetails() {
        MyaccountService.AccountDetails();
    }

    @Then("The client must view their account details")
    public void theClientMustViewTheirAccountDetails() {
        MyaccountService.AccountDetailsAssert();
    }

    @And("The client clicks on the logout Button")
    public void theClientClicksOnTheLogoutButton() {
        MyaccountService.LogOutButton();
    }

    @Then("The client succesfully logs out from the page")
    public void theClientSuccesfullyLogsOutFromThePage() {
        MyaccountService.LogOutAssert();
    }
}
