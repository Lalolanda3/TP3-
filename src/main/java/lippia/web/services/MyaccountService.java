package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.google.api.services.storage.Storage;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyaccountService extends WebActionManager {

    public static void clickAddressLink() {
        click(MyAccountConstants.ADDRESS_LINK);
    }

    public static void AccountDetails() {
        WebElement accountDetailsLink = ActionManager.getElement(MyAccountConstants.ACCOUNT_DETAILS);
        accountDetailsLink.click();
    }

    public static void AccountDetailsAssert() {
        Assert.assertNotNull(MyAccountConstants.FIRST_NAME);
        Assert.assertNotNull(MyAccountConstants.LAST_NAME);
        Assert.assertNotNull(MyAccountConstants.EMAIL_ADDRESS);
        Assert.assertNotNull(MyAccountConstants.PASSWORD_CHANGE);
        Assert.assertNotNull(MyAccountConstants.NEW_PASSWORD);
        Assert.assertNotNull(MyAccountConstants.CONFIRM_PASSWORD);
        Assert.assertNotNull(MyAccountConstants.SAVE_BUTTON);
    }

    public static void LogOutButton() {
        click(MyAccountConstants.LOGOUT_BUTTON);
    }

    public static void LogOutAssert() {
        Assert.assertNotNull(LoginConstants.LOGIN_WORD);
        Assert.assertNotNull(LoginConstants.REGISTER_WORD);
    }
}



