package conversor.exceptions;

/**
 * Clase manejadora de exepciones de monedas CurrencyPriceException.
 * 
 * Esta clase representa los errores respecto a los precios no valido de una moneda.
 * @author Local_User
 */
public class CurrencyPriceException extends IllegalCurrencyException
{    
    public CurrencyPriceException(String message) 
    {
        super(message);
    }   
}
