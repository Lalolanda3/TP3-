package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomeConstants;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @When("The client clicks on an arrival")
    public void theClientClicksOnAnArrival() { HomeService.clickArrival(); }

    @And("The client clicks on the Add to Basket button")
    public void theClientClicksOnTheAddToBasketButton() { HomeService.AddToBasketArrival(); }

    @And("The client clicks on the Item menu")
    public void theClientClicksOnTheItemMenu() { HomeService.ItemMenu();
    }

    @And("The client clicks on the Proceed to Check Out button")
    public void theClientClicksOnTheProceedToCheckOutButton() { HomeService.Proceed();
    }

    @Then("The client can add a coupon and see their order")
    public void theClientCanAddACouponAndSeeTheirOrder() { HomeService.Coupon();
    }

    @And("^The client fills the first name field (.*)$")
    public void theClientFillsTheFirstNameFieldFirstName(String firstname) {
        HomeService.firstname(firstname);
    }

    @And("^The client fills the last name field (.*)$")
    public void theClientFillsTheLastNameField(String lastname) {
        HomeService.lastname(lastname);
    }

    @And("^The client fills the phone field (.*)$")
    public void theClientFillsThePhoneField(String phone) {
        HomeService.phone(phone);
    }
    @And("^The client fills the address field (.*)$")
    public void theClientFillsTheAddressField(String address) {
        HomeService.address(address);
    }
    @And("^The client fills the town field (.*)$")
    public void theClientFillsTheTownField(String town) {
        HomeService.town(town);
    }
    @And("^The client fills the mail field (.*)$")
    public void theClientFillsTheMailField(String email) {
        HomeService.email(email);
    }
    @And("^The client fills the zip field (.*)$")
    public void theClientFillsTheZipField(String zip) {
        HomeService.zip(zip);
    }

    @And("The client chooses a payment method")
    public void theClientChoosesAPaymentMethod() {
        HomeService.PaymentMethod();
    }

    @And("The client clicks on the Place Order button")
    public void theClientClicksOnThePlaceOrderButton() {
        HomeService.PlaceOrderButton();
    }

    @Then("The client is sent to the Order Confirmation page")
    public void theClientIsSentToTheOrderConfirmationPage() {
        HomeService.OrderConfirmation();
    }


    @Given("the client goes to the main page")
    public void theClientGoesToTheMainPage() {
        HomeService.navigateToPage();
    }
}