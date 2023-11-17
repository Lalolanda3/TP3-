package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomeConstants;
import lippia.web.services.HomeService;
import lippia.web.services.MyaccountService;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {

    @And("The client clicks on the Address link")
    public void theClientClicksOnTheAddressLink() {
        MyaccountService.clickAddressLink();
    }

    @And("The client clicks on the edit button")
    public void theClientClicksOnTheEditButton() {
        ShopService.edit();
    }

    @And("^The client goes to country and types (.*)$")
    public void theClientGoesToCountryAndTypes(String country) {
        ShopService.countrySelect(country);
    }

    @When("The client clicks on the shop menu")
    public void theClientClicksOnTheShopMenu() {
        ShopService.shopButton();
    }

    @And("The client clicks on the Add to Basket button of the shop")
    public void theClientClicksOnTheAddToBasketButtonOfTheShop() {
        ShopService.addToBasketButton();
        HomeService.click(HomeConstants.BASKET);
    }


    @And("The client clicks on Save Address button")
    public void theClientClicksOnSaveAddressButton() {
        ShopService.saveAddress();
    }

    @Then("^The client can see that the tax rate for indian should be (.*)$")
    public void theClientCanSeeThatTheTaxRateForIndianShouldBe(String percentage) {
        ShopService.taxRate(percentage);
    }

    @And("The client clicks on the Item menu basket")
    public void theClientClicksOnTheItemMenuBasket() {
        //HomeService.click(HomeConstants.BASKET);
    }
}


