package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShopService extends WebActionManager {


    public static void edit() {
        WebElement editButtonLink = WebActionManager.getElement(ShopConstants.EDIT);
        editButtonLink.click();
    }


    public static void saveAddress() {
        click(ShopConstants.ADDRESS);
    }

    public static void shopButton() {
        click(ShopConstants.SHOP_BUTTON);
        WebElement shopButtonLink = WebActionManager.getElement(ShopConstants.SHOP_BUTTON);
        shopButtonLink.click();
    }

    public static void addToBasketButton() {
        click(ShopConstants.ADDTOBASKET_BUTTON);
    }

    public static void taxRate(String percentage) {

        switch (percentage) {
            case "2":
                calculador(2);
                break;
            case "5":
                calculador(5);
                break;
        }
    }


    public static void calculador(int valor) {
        String subSubTotal = WebActionManager.getText(ShopConstants.SUBTOTAL);
        subSubTotal = borrarPrimerCaracter(subSubTotal);
        int subTotal = obtenerNumeroSinDecimales(subSubTotal);
        int porcentaje = valor;
        int porcentajeTotal = 100;
        int result = (subTotal * porcentaje) / porcentajeTotal;
        String TaxPrice = WebActionManager.getText(ShopConstants.TAX);
        TaxPrice = borrarPrimerCaracter(TaxPrice);
        Assert.assertEquals(result, obtenerNumeroSinDecimales(TaxPrice));
        System.out.println(result);
    }

    public static String borrarPrimerCaracter(String input) {
        // Verificar si la cadena no es nula y tiene al menos un carácter
        if (input != null && input.length() > 0) {
            // Utilizar substring para obtener la cadena sin el primer carácter
            return input.substring(1);
        } else {
            // Manejar el caso de una cadena vacía o nula
            System.out.println("La cadena es nula o vacía.");
            return input;
        }
    }

    public static int obtenerNumeroSinDecimales(String input) {
        // Verificar si la cadena no es nula y contiene al menos un punto
        if (input != null && input.contains(".")) {
            // Encontrar la posición del primer punto
            int indicePunto = input.indexOf(".");

            // Utilizar substring para obtener la parte de la cadena antes del punto
            String parteEntera = input.substring(0, indicePunto);

            // Convertir la parte entera a un número entero
            return Integer.parseInt(parteEntera);
        } else {
            // Manejar el caso de una cadena sin punto
            System.out.println("La cadena no contiene un punto.");
            return 0; // Otra acción adecuada para manejar el caso
        }
    }

    public static void countrySelect(String country) {
        click(ShopConstants.SHOP_BUTTON);
        //WebElement countryButtonLink = WebActionManager.getElement(ShopConstants.COUNTRY);
        //countryButtonLink.click();
        click(ShopConstants.COUNTRY);
            setInput(ShopConstants.COUNTRY2, country);
            switch (country) {
                case "India":
                    click(ShopConstants.COUNTRY_INDIA);
                    click(ShopConstants.STATE);
                    click(ShopConstants.STATE_SELECT);
                    break;
                case "Argentina":
                    click(ShopConstants.COUNTRY_ARGENTINA);
                    click(ShopConstants.STATE);
                    click(ShopConstants.STATE_SELECT);
                    break;
            }
        }
    }







