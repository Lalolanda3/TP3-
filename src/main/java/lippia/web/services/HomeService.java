package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomeService extends WebActionManager {

    public static void clickArrival() {
        WebElement arrivalLink = ActionManager.getElement(HomeConstants.ARRIVAL);
        arrivalLink.click();
    }

    public static void AddToBasketArrival() {
        click(HomeConstants.ADD_ARRIVAL, false);
    }

    public static void ItemMenu() {
        WebElement itemMenuLink = WebActionManager.getElement(HomeConstants.ITEM_MENU);
         itemMenuLink.click();


    }

    public static void Proceed() {
        click(HomeConstants.PROCEED);
    }

    public static void Coupon() {
        Assert.assertNotNull(HomeConstants.COUPON_BUTTON);
        Assert.assertNotNull(HomeConstants.YOUR_ORDER);
        Assert.assertNotNull(HomeConstants.PRODUCT);
        Assert.assertNotNull(HomeConstants.TOTAL);
        Assert.assertNotNull(HomeConstants.SUBTOTAL);
        Assert.assertNotNull(HomeConstants.TAX);
    }

    public static void firstname(String firstname) { setInput(HomeConstants.FIRST_NAME, firstname);
    }

    public static void lastname(String lastname) { setInput(HomeConstants.LAST_NAME, lastname);
    }

    public static void phone(String phone) { setInput(HomeConstants.PHONE, phone);
    }
    public static void address(String address) { setInput(HomeConstants.ADDRESS, address);
    }
    public static void town(String town) { setInput(HomeConstants.TOWN, town);
    }
    public static void email(String email) { setInput(HomeConstants.EMAIL, email);
    }
    public static void zip(String zip) { setInput(HomeConstants.ZIP, zip);
    }

    public static void PaymentMethod() {
        click(HomeConstants.PAYMENT_METHOD);
    }

    public static void PlaceOrderButton() {
        click(HomeConstants.PLACE_ORDER_BUTTON);
    }

    public static void OrderConfirmation() {
        Assert.assertNotNull(HomeConstants.THANK_YOU);
        Assert.assertNotNull(HomeConstants.ORDER_NUMBER);
        Assert.assertNotNull(HomeConstants.ORDER_DETAILS);
    }


    public static void navigateToPage() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
}

