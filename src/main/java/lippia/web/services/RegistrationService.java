package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.RegistrationConstants;
import org.testng.Assert;

public class RegistrationService extends WebActionManager {

    public static void validemail(String email) {
        setInput(RegistrationConstants.EMAIL, email);
    }

    public static void emptypassword(String password) {
        setInput(RegistrationConstants.PASSWORD, password);
    }


    public static void emptyemail(String email) {
        setInput(RegistrationConstants.EMAIL, email);
    }


    public static void registrationDisabled() {
        Assert.assertFalse(false, RegistrationConstants.REGISTRATION_BUTTON);
    }
}



