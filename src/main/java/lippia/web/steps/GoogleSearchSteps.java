package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.GoogleHomeService;
import lippia.web.services.GoogleSearchResultService;

public class GoogleSearchSteps extends PageSteps {

    @Given("^The client is on google page$")
    public void home() {
        GoogleHomeService.navegarWeb();
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        GoogleHomeService.enterSearchCriteria(criteria);
        GoogleHomeService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerification() {
        GoogleSearchResultService.verifyResults();
    }

    @Then("^The client verify that results are shown incorrectly$")
    public void statIncorrectlyVerification() {
        GoogleSearchResultService.verifyIncorrectResults();
    }

}
