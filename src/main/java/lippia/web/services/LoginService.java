package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginService extends WebActionManager {

   public static void hacerClickMyAccount(){
       WebElement myAccountLink = ActionManager.getElement(LoginConstants.BOTON_MY_ACCOUNT);
       myAccountLink.click();
   }
    public static void enterusername(String username){
        setInput(LoginConstants.USERNAME_INPUT_LOCATOR, username);
    }

    public static void enterpassword(String password) {
        setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
    }

    public static void clicklogin() {
       click(LoginConstants.LOGIN_BUTTON);
    }

    public static void validusername(String username) {
       setInput(LoginConstants.USERNAME_INPUT_LOCATOR, username);
    }

    public static void validpassword(String password) {
       setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
    }

    public static void loginerror() {
       Assert.assertNotNull(LoginConstants.LOGIN_ERROR);
    }

    public static void SignOutButton() {
        WebElement signoutLink = ActionManager.getElement(LoginConstants.SIGN_OUT);
        signoutLink.click();
    }
    public static void Back() {
       click(LoginConstants.BOTON_MY_ACCOUNT);
    }
    public static void GeneralWeb() {
       Assert.assertNotNull(LoginConstants.LOGIN_WORD);
       Assert.assertNotNull(LoginConstants.REGISTER_WORD);
    }
}

