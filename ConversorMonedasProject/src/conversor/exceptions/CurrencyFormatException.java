package conversor.exceptions;

/**
 * Clase manejadora de excepciones CurrencyFormatException.
 * 
 * Este clase manejará los errors respecto a los formatos del precio de una moneda.
 * 
 * @author Luigi Salcedo
 */
public class CurrencyFormatException extends IllegalCurrencyException 
{    
    public CurrencyFormatException(String message) 
    {
        super(message);
    }   
}
