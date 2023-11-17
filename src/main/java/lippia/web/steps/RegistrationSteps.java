package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.MyaccountService;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @And("^The client enters the valid email (.*)$")
    public void theClientEntersTheValidEmail(String email) {
        RegistrationService.validemail(email);
    }

    @And("^The client enters the empty password (.*)$")
    public void theClientEntersTheEmptyPassword(String password) {
        RegistrationService.emptypassword(password);
    }

    @And("^The client enters the empty email (.*)$")
    public void theClientEntersTheEmptyEmail(String email) {
        RegistrationService.emptyemail(email);
    }


    @Then("The registration button is disabled")
    public void theRegistrationButtonIsDisabled() {
        RegistrationService.registrationDisabled();
    }
}
